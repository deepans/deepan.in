(ns deepan.views.layout
  (:use [hiccup.core :only (html)]
        [hiccup.util :only (to-uri)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn common [title & body]
  (html5
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:name "HandheldFriendly" :content "true"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
    [:title title]
    [:link {:href (to-uri "/stylesheets/less/styles.less") :rel "stylesheet/less" :type "text/css"}]
    (include-css "/stylesheets/foundation/foundation.css")
    (include-css "/stylesheets/foundation/app.css")
    (include-css "http://fonts.googleapis.com/css?family=Raleway:italic,bold,regular")
    
    (include-js "/js/less-1.3.3.min.js")
    (include-js "/js/foundation/modernizr.foundation.js")]
   
   [:body
    [:div {:id "content" :class "container"} body]
    (include-js "/js/foundation/jquery.js")
    (include-js "/js/foundation/foundation.min.js")
    (include-js "/js/foundation/app.js")
    ]))