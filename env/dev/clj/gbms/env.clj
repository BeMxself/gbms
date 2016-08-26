(ns gbms.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [gbms.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[gbms started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[gbms has shut down successfully]=-"))
   :middleware wrap-dev})
