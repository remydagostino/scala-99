package com.remydagostino.s99

class P02Spec extends UnitSpec {
  property("#penultimate should return nothing when given an empty list") {
    assert(P02.penultimate(List.empty) === None)
  }

  property("#penultimate should return nothing when given a one element list") {
    forAll { (end: String) =>
      assert(P02.penultimate(List(end)) === None)
    }
  }

  property("#penultimate should return the second last element") {
    forAll { (list: List[String], secondLast: String, last: String) =>
      assert(P02.penultimate(list :+ secondLast :+ last) === Some(secondLast))
    }
  }
}
