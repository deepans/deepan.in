(ns deepan.handler
  (:use compojure.core
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [deepan.controllers.profile :as profile]))

(defroutes app-routes
  profile/routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/site app-routes)
  (wrap-base-url)))
