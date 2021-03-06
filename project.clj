(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "My ClojureScript experiments"
  :url "https://github.com/crmaxx"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;; CLJ source code path
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [domina "1.0.2-SNAPSHOT"]
                ]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [;; cljsbuild plugin
            [lein-cljsbuild "0.3.2"]

            ;; ring plugin
            [lein-ring "0.8.5"]]

  ;; ring tasks configuration
  :ring {:handler modern-cljs.core/handler}

  ;; cljsbuild options configuration
  :cljsbuild {:builds
              [{;; CLJS source code path
                :source-paths ["src/cljs"]

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/modern.js"

                           ;; minimal JS optimization directive
                           :optimizations :whitespace

                           ;; generated JS code prettyfication
                           :pretty-print true}}]})
