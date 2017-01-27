;; (set-env!
;;  :source-paths #{"src"}
;;  :resource-paths #{"resources"}
;;  :dependencies '[ [perun "0.3.0"]
;;                   [hiccup "1.0.5"]
;;                   [hashobject/boot-s3 "0.1.2-SNAPSHOT"]
;;                   [clj-time "0.9.0"]
;;                   [org.martinklepsch/boot-gzip "0.1.1"]
;;                   [pandeiro/boot-http "0.7.6"]])


(set-env!
 :source-paths #{"src"}
 :resource-paths #{"resources"}
 :dependencies '[[hiccup "1.0.5"]
                 [perun "0.3.0"]
                 [hashobject/boot-s3 "0.1.2-SNAPSHOT"]
                 [clj-time "0.9.0"]
                 [pandeiro/boot-http "0.6.3-SNAPSHOT"]
                 [org.martinklepsch/boot-gzip "0.1.1"]])




 

(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer [serve]]
         '[hashobject.boot-s3 :refer :all]
         '[org.martinklepsch.boot-gzip :refer [gzip]])

(task-options!
 pom {:project 'perun.io
      :version "0.2.0"}
 s3-sync {
          :bucket "perun.io"
          :access-key (System/getenv "AWS_ACCESS_KEY")
          :secret-key (System/getenv "AWS_SECRET_KEY")
          :source "public"
          :options {"Cache-Control" "max-age=315360000, no-transform, public"}})




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


