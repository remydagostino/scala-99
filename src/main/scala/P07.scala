package com.remydagostino.s99

object P07 {
  def flatten(list: List[Any]): List[Any] =
    list.flatMap {
      case sublist: List[Any] => flatten(sublist)
      case x => List(x)
    }
}
