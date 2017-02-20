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
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0, minimum-scale=1.0"}]
     [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/icon?family=Material+Icons"}]
     [:link {:rel "stylesheet" :href "https://code.getmdl.io/1.3.0/material.min.css"}]
     [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/css?family=Montserrat"}]
     [:link {:rel "stylesheet" :href "styles.css" }]] 

       [:style#view-source {:position "fixed" :display "block" :right "0" :bottom "0" :margin-right "40px" :margin-bottom "40px" :z-index "900" } ]
 
       [:body
        [:div.mdl-layout__container
         [:div.mdl-layout.mdl-js-layout.mdl-layout--fixed-header
          [:div.waves-header.mdl-layout__header.mdl-layout__header--waterfall
           [:div.mdl-layout__header-row
            [:span.waves-title.mdl-layout-title
             [:img.waves-logo-image {:src "images/waves-horizontal.png"}]]
            [:div.android-header-spacer.mdl-layout-spacer]
            [:div.waves-search-box.mdl-textfield.mdl-js-textfield.mdl-textfield--expandable.mdl-textfield--floating-label.mdl-textfield--align-right.mdl-textfield--full-width
             [:label.mdl-button.mdl-js-button.mdl-button--icon {:for "search-field"}
              [:i.material-icons "search" ]]
             [:div.mdl-textfield__expandable-holder
              [:input.mdl-textfield__input {:type "text" :id "search-field" }]]]

            [:div.waves-navigation-container
             [:nav.waves-navigation.mdl-navigation
              [:a.mdl-navigation__link.mdl-typography--text-uppercase "About Us"]
              [:a.mdl-navigation__link.mdl-typography--text-uppercase "Our Work"]
              [:a.mdl-navigation__link.mdl-typography--text-uppercase  "Our Blog" ]
              [:a.mdl-navigation__link.mdl-typography--text-uppercase "Contact Us"]]]]]

          [:div.waves-drawer.mdl-layout__drawer
           [:span.waves-title.mdl-layout-title
            [:img.waves-logo-square {:src "images/waves.png"}]]
           [:nav.mdl-navigation
            [:a.mdl-navigation__link "About Us"]
            [:a.mdl-navigation__link "Our Work"]
            [:a.mdl-navigation__link {:href "https://medium.com/me/stories/public"}  "Our Blog" ]
            [:a.mdl-navigation__link "Contact Us"]]]



          [:div.waves-content.mdl-layout__content
           [:a {:name "top"}]
           [:div.waves-about.mdl-typography--text-center
            [:div.logo-font.waves-slogan "The Sport of the Shot"] 
            [:div.logo-font.waves-slogan "We are a video production Company"]
            [:div.logo-font.waves-slogan "In Charlotte, North Carolina"]
            [:div.android-wear-section.mdl-cell.mdl-cell--6-col
             [:p "" ]]]]]

         [:footer.waves-footer.mdl-mega-footer
          [:div.mdl-mega-footer--top-section
           [:div.mdl-mega-footer--left-section
            [:button.mdl-mega-footer--social-btn]]]]

         [:script {:src "https://code.getmdl.io/1.3.0/material.min.js"}]
         ]]))
