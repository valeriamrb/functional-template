(ns exercise3)

(defn fibonacci
  "Calculate the fibonacci sequence."
  [x]
  (cond
	(= x 0) 0
	(= x 1) 1
	:else (+ (fibonacci (- x 1)) (fibonacci (- x 2)))))
