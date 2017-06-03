; Pass a list to (type ) to return:
; clojure.lang.PersistentList$EmptyList
(type ())
; clojure.lang.PersistentList
(type (list 1 2 3))

; Write a boolean if function that returns a string:
(if true
  "the truth"
  "the lie")

; Compare 1/2 and 0.5 using an if statement. Can you make it return true?
(if (== 1/2 0.5)
  "true"
  "false")
(if (> 1/2 0.5)
  "false"
  "true")

; Use cond or condp to map out your day:
(condp < 60
   65 "go to the park"
   45 "learn closure"
   "sleep in")
