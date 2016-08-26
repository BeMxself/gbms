(ns gbms.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[gbms started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[gbms has shut down successfully]=-"))
   :middleware identity})
