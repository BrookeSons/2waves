(set-env!
 :source-paths #{"src" "content"}
 :resource-paths #{"resources"}
 :dependencies '[[perun "0.3.0" :scope "test"]
                  [hiccup "1.0.5"]
                  [clj-time "0.9.0"]
                  [org.martinklepsch/boot-gzip "0.1.1"]
                  [tailrecursion/boot-static "0.1.0"]])

 
(require '[io.perun :refer :all]
          '[tailrecursion.boot-static :refer [serve]]
          '[org.martinklepsch.boot-gzip :refer [gzip]])



(task-options!
 pom {:project 'waves.com
      :version "0.2.0"})


(deftask build-dev
  "Build dev version"
  []
  (comp    (global-metadata)
        (base)
        (markdown)
        (collection :renderer 'waves.site/render :page "index.html") (target)))


(deftask build
  "Build Waves"
  []
  (comp (build-dev)
        (gzip :regex [#".html$" #".css$" #".js$"])))


(deftask dev
  []
  (comp (watch)
        (build-dev)
        (serve :port 3000) (target)))

