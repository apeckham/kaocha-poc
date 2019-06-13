(ns my.kaocha.hooks)

(println "ok")

(defn sample-hook [test test-plan]
  (prn "In sample hook!")
  (prn test)
  test)
