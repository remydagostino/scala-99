package com.remydagostino.s99

object P10 {
  def encode[A](list: List[A]): List[(Int, A)] =
    P09.pack(list).map(p => p.length -> p.head)
}
