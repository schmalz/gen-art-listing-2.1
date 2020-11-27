(ns sketch.core
  (:require [quil.core :as quil]
            [quil.middleware :as middleware]
            [sketch.dynamic :as dynamic])
  (:gen-class))

(quil/defsketch example
                :title "sketch"
                :setup dynamic/setup
                :update dynamic/update-state
                :draw dynamic/draw
                :middleware [middleware/fun-mode]
                :size [900 900])
