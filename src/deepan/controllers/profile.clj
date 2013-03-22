(ns deepan.controllers.profile
  (:use [compojure.core :only (defroutes GET)])
  (:require [deepan.views.profile :as profile_view]))

(defn profile []
  (profile_view/render))

(defroutes routes
  (GET "/" [] (profile)))