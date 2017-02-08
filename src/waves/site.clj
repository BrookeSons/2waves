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
     ;; Chrome on Android 
      [:meta {:name "mobile-web-app-capable" :content "yes"}]
     [:link {:rel "icon" :sizes "192x192" :href "images/android-desktop.png"}]

     ;; Safari on IOS 

     [:meta {:name "apple-mobile-web-app-capable" :content "yes"}]
     [:meta {:name "apple-mobile-web-app-status-bar-style" :content "black"}]
     [:meta {:name "apple-mobile-web-app-title" :content "Material Design Lite"}]
     [:link {:rel "apple-touch-icon-precomposed" :href "images/ios-desktop.png"}]


     [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
     [:link {:rel "stylesheet" :href "https://code.getmdl.io/1.3.0/material.indigo-pink.min.css"}]
     [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/css?family=Baumans" }]
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
        [:a.mdl-navigation__link {:href "https://medium.com/me/stories/public"}  "Our Blog" ] 
        [:a.mdl-navigation__link "Contact Us"]]]
      [:body
      [:div.mdl-layout__content
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
