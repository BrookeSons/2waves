(ns waves.site
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn render [{global-meta :meta posts :entries}]
  (html5 {:lang "en"}
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
     [:meta {:name "description" :content "2Wave Media Web Site"}]
     [:title "2Waves Media"]
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0, user-scalable=no"}]
     [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
     [:link {:rel "stylesheet" :href "https://code.getmdl.io/1.3.0/material.min.css"}]
     [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/css?family=Montserrat"}]
     [:link {:rel "stylesheet" :href "styles.css" }]] 
    
       [:div.mdl-layout__drawer
        [:span.mdl-layout__title "2Waves Media"]
        [:nav.mdl-navigation
        [:a.mdl-navigation__link "About Us"]
        [:a.mdl-navigation__link "Our Work"]
        [:a.mdl-navigation__link {:href "https://medium.com/me/stories/public"}  "Our Blog" ]
         [:a.mdl-navigation__link "Contact Us"]]]


      [:body
       [:div.mdl-layout.mdl-js-layout.mdl-layout--fixed-header
        [:div.waves-header.mdl-layout__header.mdl-layout__header--waterfall 
         [:div.mdl-layout__header-row
          [:span.waves-title.mdl-layout-title
           [:img.waves-logo-image {:src "images/waves-horizontal.png"}]]
          [:div.waves-header-spacer.mdl-layout-spacer]
          [:div.waves-search-box.mdl-textfield.mdl-js-textfield.mdl-textfield--expandable.mdl-textfield--floating-label.mdl-textfield--align-right.mdl-textfield--full-width
           [:label.mdl-button.mdl-js-button.mdl-button--icon {:for "search-field"}
            [:i.material-icons "search" ]]]]]

        [:div#vid.mdl-card.mdl-shadow--4dp
         [:div.mdl-card__title
          [:div.mdl-card__title-text "Our Featured Video"]]
         [:div.mdl-card__media]]]]))
