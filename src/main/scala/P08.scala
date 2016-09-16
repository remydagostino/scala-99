package com.remydagostino.s99

object P08 {
  def compress[A](list: List[A]): List[A] =
    list.foldRight((None: Option[A]) -> List.empty[A]) { (y, acc) =>
      acc match {
        case (Some(last), xs) if last == y =>
          (Some(y), xs)
        case (_, xs) =>
          (Some(y), y :: xs)
      }
    }._2
}
