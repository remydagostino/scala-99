package com.remydagostino.s99

object P03 {
  def nth[A](n: Int, list: List[A]): Option[A] =
    if (n < 0)
      None
    else
      (n, list) match {
        case (_, Nil) =>
          None
        case (0, item :: _) =>
          Some(item)
        case (n, _ :: rest) =>
          nth(n - 1, rest)
      }
}
