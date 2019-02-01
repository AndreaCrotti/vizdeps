(defproject walmartlabs/vizdeps "0.1.6"
  :description "Visualize Leiningen project dependencies using Graphviz."
  :url "https://github.com/walmartlabs/vizdeps"
  :license {:name "Apache Sofware License 2.0"
            :url  "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [dorothy "0.0.7"]
                 [medley "1.1.0"]
                 [com.stuartsierra/dependency "0.2.0"]]
  :eval-in-leiningen true)
