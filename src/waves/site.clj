(ns waves.site
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn render [{global-meta :meta posts :entries}]
  (html5 {:lang "en"}
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
      [:title "2Waves Media"]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0, user-scalable=no"}]
      [:meta {:itemprop "author" :name "author" :content "2Waves (Rchard.Brooke@2wavesmeda.com)"}]
      [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
      [:link {:rel "stylesheet"  :href "https://code.getmdl.io/1.3.0/material.indigo-pink.min.css"}]
      (include-js   "https://code.getmdl.io/1.3.0/material.min.js")
      (include-css "/index.css")
      [:link {:href "https://fonts.googleapis.com/css?family=Oswald" :rel "stylesheet" :type "text/css"}]]
    [:body
      [:div.hero
        ; [:h1 "2Waves"]
       [:img {:src "/images/waves.png" :height "255px"}]
       ]
      [:section.docs-section
        [:h2.waves "2Waves Media"]
        [:p "The Sport of the Shot"]
        [:p ""]]]))

