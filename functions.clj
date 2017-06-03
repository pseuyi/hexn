; Write a function that returns an argument multiplied by 10 using def.
(def multiply-10 (fn [x] (* x 10)))

; Write a function that returns an argument multiplied by 10 using defn.
(defn multiply-10 [x] (* x 10))

; Write a recursive function that sums a list of numbers without recur.
(defn sum-list [nums]
  (if (== 1 (count nums))
    nums
    (+ nums (sum-list(rest nums)))))

; Write a recursive function that sums a list of numbers using loop and recur.
(defn sum-list [nums]
  (loop [n nums
         sum 0]
    (if (empty? n)
    sum
    (recur (rest n) (+ sum (first n))))))
