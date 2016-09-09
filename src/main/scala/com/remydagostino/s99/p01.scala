package com.remydagostino.p99

object P01 {
  def last[A](list: List[A]): Option[A] = list match {
    case Nil =>
      None
    case item :: Nil =>
      Some(item)
    case _ :: rest =>
      last(rest)
  }
}
