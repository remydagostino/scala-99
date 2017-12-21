package com.remydagostino.s99

import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.{Arbitrary, Gen}

trait ListGens {
  def nestList(list: List[Any], n: Int): List[Any] = {
    if (n > 0)
      list :: List(list, nestList(list, n - 1))
    else
      list
  }

  def lumpyIntList: Gen[List[Any]] = for {
    list <- arbitrary[List[Int]]
    num <- Gen.choose(0, 5)
  } yield nestList(list, num)

  def nonEmptyList[T: Arbitrary]: Gen[List[T]] = for {
    first <- implicitly[Arbitrary[T]].arbitrary
    rest <- arbitrary[List[T]]
  } yield first :: rest
}