(ns a.b)

(defprotocol P
  (a [_]))

(a (throw ""))
