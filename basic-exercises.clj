; Use (type ) to return the type of:
; true, 0, 0.0, 0N, 0.0M, 1/2, \f, "f"

; Pass a list to (type ) to return:
; clojure.lang.PersistentList$EmptyList
; clojure.lang.PersistentList

; Write a boolean if function that returns the string:
; "This is true!" when true
; "This is false!" when false

; For the condition, simply use the Clojure primitives for truth and falsity

; Compare 1/2 and 0.5 using an if statement. Can you make it return true?

; Use cond or condp to map out your day:

(condp < 60
   65 "go to the park"
   45 "learn closure"
   "sleep in")
