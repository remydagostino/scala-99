package com.remydagostino.s99

class P01Spec extends UnitSpec {
  property("#last should return nothing when given an empty list") {
    assert(P01.last(List.empty) === None)
  }

  property("#last should return the last element appended to a list") {
    forAll { (list: List[String], end: String) =>
      assert(P01.last(list :+ end) === Some(end))
    }
  }
}
