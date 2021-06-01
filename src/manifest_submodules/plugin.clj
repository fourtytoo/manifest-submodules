(ns manifest-submodules.plugin
  (:require [clojure.java.io :refer [file]]
            [leiningen.core.main :refer [debug]]
            [clojure.string :as s]
            [clojure.java.shell :as sh]))


(defn submodules [root]
  (let [sm (sh/sh "git" "submodule" :dir root)]
    (when (= (:exit sm) 0)
      (->> (s/split-lines (:out sm))
           (map (fn [line]
                  (->> (s/split (s/trim line) #"\s+")
                       (zipmap [:sha :dir :ver]))))))))

(defn sub->manifest [sub]
  [(str "Submodule_" (-> (:dir sub)
                         file
                         .getName)
        "_SHA1")
   (:sha sub)])

(defn make-manifest [submodules]
  (->> submodules
       (map sub->manifest)
       (into {})))

(defn middleware
  [project]
  (->> (:root project)
       submodules
       make-manifest
       (update project :manifest merge)))
