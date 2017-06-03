; loop and recur

(loop [x 10]
  (when (> 1)
    (println x)
    (recur (- x 2))))

(def factorial
  (fn [n]
    (loop [cnt n
           acc 1N] ; accumulator
           (if (zero? cnt)
              acc ; return accumulated value when count hits 0
              (recur (dec cnt) (* acc cnt))))))
