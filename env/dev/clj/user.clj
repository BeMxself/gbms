(ns user
  (:require [mount.core :as mount]
            gbms.core))

(defn start []
  (mount/start-without #'gbms.core/repl-server))

(defn stop []
  (mount/stop-except #'gbms.core/repl-server))

(defn restart []
  (stop)
  (start))


