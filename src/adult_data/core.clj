(ns adult-data.core)

(use '[incanter.io      :only [read-dataset]])
(use '[clojure-csv.core :only [parse-csv]])

(defn -main []
  (print
    (map
      (fn [row] (println row))
      (take
        10
        (parse-csv
          (slurp "resources/adult.data"))))))
