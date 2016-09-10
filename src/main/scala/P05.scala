package com.remydagostino.s99

object P05 {
  def reverse[A](list: List[A]): List[A] =
    list.foldRight(List.empty[A]) { (x, acc) => acc :+ x }
}
