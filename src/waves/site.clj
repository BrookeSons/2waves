(ns waves.site
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn render [{global-meta :meta posts :entries}]
  (html5 {:lang "en"}
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
      [:title "2Waves Media"]
      [:meta {:name "viewport"   :content "width=device-width, initial-scale=1.0, user-scalable=no"}]
      [:meta {:itemprop "author" :name "author" :content "2Waves (Rchard.Brooke@2wavesmeda.com)"}]
      [:link {:rel "stylesheet"  :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
      [:link {:rel "stylesheet"  :href "https://code.getmdl.io/1.3.0/material.indigo-pink.min.css"}]
      [:link {:rel "stylesheet"  :href "https://fonts.googleapis.com/css?family=Baumans" }]
     (include-js   "https://code.getmdl.io/1.3.0/material.min.js")
     (include-js "https://player.vimeo.com/api/player.js")
     (include-css "/index.css")
     [:link {:href "https://fonts.googleapis.com/css?family=Oswald" :rel "stylesheet" :type "text/css"}]]
    [:div.mdl-layout.mdl-js-layout.mdl-layout
      [:div.mdl-layout__drawer
        [:span.mdl-layout__title "2Waves Media"]
        [:nav.mdl-navigation
        [:a.mdl-navigation__link "About Us"]
        [:a.mdl-navigation__link "Our Work"]
        [:a.mdl-navigation__link "Contact Us"]]]
      [:body
      [:div.main
       [:div.hero
         [:img {:src "/images/waves.png" :height "355px"}]
       ]]
       [:section 
        [:div.mdl-grid
         [:section.mdl-cell.mdl-cell--12-col
          [:h2.waves "2Waves Media LLC"]
          [:h3.waves "The Sport of the Shot"]
          [:p "2Waves Media we get the job done"]]]]
     [:div#vid.mdl-card.mdl-shadow--4dp
      [:div.mdl-card__title
       [:div.mdl-card__title-text "Our Featured Video"]]
      [:div.mdl-card__media]]]]))
