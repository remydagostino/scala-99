package com.remydagostino.s99

object P04 {
  def length[A](list: List[A]): Int =
    list.foldLeft(0) { (acc, _) => acc + 1 }
}
