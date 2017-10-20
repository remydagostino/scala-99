package com.remydagostino.s99

object P11 {
  def encodeModified(list: List[Any]): List[Any] =
    P10.encode(list).map {
      case (1, x) => x
      case tup    => tup
    }
}
