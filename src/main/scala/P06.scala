package com.remydagostino.s99

object P06 {
  def isPalindrome[A](list: List[A]): Boolean =
    !list
      .drop((list.length / 2).ceil.toInt)
      .reverse
      .zip(list)
      .exists(pair => pair._1 != pair._2)
}
