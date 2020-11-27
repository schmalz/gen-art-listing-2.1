(ns sketch.dynamic
  (:require [quil.core :as quil]))

(defn setup
  []
  (quil/frame-rate 24)
  (quil/smooth)
  (quil/background 180)
  (quil/stroke 0)
  (quil/stroke-weight 5)
  (quil/fill 255 50)
  {:x (/ (quil/width) 2)
   :y (/ (quil/height) 2)
   :diam 10})

(defn inc-diameter
  [d]
  (if (<= d 400)
    (+ d 10)
    d))

(defn update-state
  [state]
  (update state :diam inc-diameter))

(defn draw
  [state]
  (quil/background 180)
  (quil/ellipse (:x state) (:y state) (:diam state) (:diam state)))
