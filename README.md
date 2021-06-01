# manifest-submodules

A Leiningen plugin to automatically include in your manifest the SHA1
of the project's sub-modules.

## Usage

Use this for user-level plugins:

Put `[fourtytoo/manifest-submodules "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your `:user`
profile.

or use this for project-level plugins:

Put `[fourtytoo/manifest-submodules "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

There is no command line.


## License

Copyright © 2021 Walter C. Pelissero

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
