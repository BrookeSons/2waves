
(set-env!
 :source-paths #{"src"}
 :resource-paths #{"resources"}
 :dependencies '[[hiccup "1.0.5"]
                 [perun "0.3.0"]
                 [hashobject/boot-s3 "0.1.2-SNAPSHOT"]
                 [clj-time "0.9.0"]
                 [degree9/boot-npm "0.2.0"]
                 [pandeiro/boot-http "0.6.3-SNAPSHOT"]
                 [org.martinklepsch/boot-gzip "0.1.1"]])

(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer [serve]]
         '[org.martinklepsch.boot-gzip :refer [gzip]])

(deftask build-dev
  "Build dev version"
  []
  (comp    (global-metadata)
        (base)
        (markdown)
        (collection :renderer 'waves.site/render :page "index.html")))


(deftask build
  "Build Waves"
  []
  (comp (build-dev)
        (gzip :regex [#".html$" #".css$" #".js$"])))


(deftask dev
  []
  (comp (watch)
        (build-dev)
        (serve :resource-root "public")))

(deftask deploy
   []
  (comp
   (build)
   (target)))
