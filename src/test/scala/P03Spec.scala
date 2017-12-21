package com.remydagostino.s99

import org.scalacheck.Arbitrary.arbitrary

class P03Spec extends UnitSpec with ListGens {
  property("#nth should return nothing when given an empty list") {
    forAll { (n: Int) =>
      whenever(n >= 0) {
        assert(P03.nth(n, List.empty)  === None)
      }
    }
  }

  property("#nth should equal #last when n equals length - 1") {
    forAll(nonEmptyList[Int]) { (list) =>
      assert(P03.nth(list.length - 1, list) === P01.last(list))
    }
  }

  property("#nth should equal #penultimate when n equals length - 2") {
    forAll(nonEmptyList[Int]) { (list) =>
      assert(P03.nth(list.length - 2, list) === P02.penultimate(list))
    }
  }

  property("#nth should find the first element of two joined lists") {
    forAll(arbitrary[List[Int]], nonEmptyList[Int]) { (frontList, backList) =>
      assert(P03.nth(frontList.length, frontList ++ backList) === Some(backList.head))
    }
  }
}
