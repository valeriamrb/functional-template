(ns exercise2)

(defn only-greater-than-five
  "Filter elements greater than five."
  [x]
  (filter (fn [p] (> p 5)) x))
