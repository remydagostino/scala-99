package com.remydagostino.p99

import org.scalatest.prop.PropertyChecks
import org.scalatest.{ Matchers, PropSpec }

class P01Spec extends PropSpec with PropertyChecks with Matchers {
  property("#last should return nothing when given an empty list") {
    assert(P01.last(List.empty) === None)
  }

  property("#last should return the last element appended to a list") {
    forAll { (list: List[String], end: String) =>
      assert(P01.last(list :+ end) === Some(end))
    }
  }
}
