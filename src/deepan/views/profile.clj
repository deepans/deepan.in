(ns deepan.views.profile
  (:use [hiccup.util :only (to-uri)])
  (:require [deepan.views.layout :as layout]))

(defn render []
  (layout/common "Deepan Profile"
                 [:div {:class "row"}
                  [:div {:class "twelve columns"}
                   [:div {:class "row"}
                    [:div {:id "photo" :class "four mobile-eight columns"}
                     [:img {:src (to-uri "/images/deepan.png")}]
                     ]
                    [:div {:id "overview" :class "eight mobile-eight columns"}
                      [:p {:id "name"} "Deepan Subramani"]
                      [:p {:id "title"} "Developer at ThoughtWorks"]
                      [:p {:id "location"} "Chennai, India"]
                     ]
                    ]
                   ]
                  ]))