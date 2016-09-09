package com.remydagostino.p99

object P02 {
  def penultimate[A](list: List[A]): Option[A] = list match {
    case Nil =>
      None
    case secondLast :: _ :: Nil =>
      Some(secondLast)
    case _ :: rest =>
      penultimate(rest)
  }
}
