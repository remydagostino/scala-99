package com.remydagostino.s99

object P05 {
  def reverse[A](list: List[A]): List[A] =
    list.foldLeft(List.empty[A]) { (acc, x) => x :: acc }
}
