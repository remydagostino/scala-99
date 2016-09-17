package com.remydagostino.s99

object P09 {
  def pack[A](list: List[A]): List[List[A]] =
    list.foldRight(List.empty[List[A]]) { (y, acc) =>
      acc match {
        case pack :: packed =>
          if (pack.headOption == Some(y))
            (y :: pack) :: packed
          else
            List(y) :: (pack :: packed)
        case _ =>
          List(List(y))
      }
    }
}
