(defproject datomico "0.2.1"
  :description "Use datomic with intention revealing names"
  :url "http://github.com/MC-Escherichia/datomico"
  :license {:name "The MIT License"
            :url "https://en.wikipedia.org/wiki/MIT_License"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-free "0.9.4815.10"]]
  :test-selectors {:focus :focus :default (constantly true)})
