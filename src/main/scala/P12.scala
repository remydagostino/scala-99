package com.remydagostino.s99

object P12 {
  def decode[A](list: List[(Int, A)]): List[A] =
    list.foldLeft(List.empty[A])((memo, encodedPair) => memo ++ List.fill(encodedPair._1)(encodedPair._2))
}
