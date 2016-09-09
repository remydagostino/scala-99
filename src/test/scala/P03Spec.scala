package com.remydagostino.s99

class P03Spec extends UnitSpec {
  property("#nth should return nothing when given an empty list") {
    forAll { (n: Int) =>
      whenever(n >= 0) {
        assert(P03.nth(n, List.empty)  === None)
      }
    }
  }

  property("#nth should equal #last when n equals length - 1") {
    forAll { (list: List[Int]) =>
      whenever(list.length > 0) {
        assert(P03.nth(list.length - 1, list) === P01.last(list))
      }
    }
  }

  property("#nth should equal #penultimate when n equals length - 2") {
    forAll { (list: List[Int]) =>
      whenever(list.length > 1) {
        assert(P03.nth(list.length - 2, list) === P02.penultimate(list))
      }
    }
  }

  property("#nth should find the first element of two joined lists") {
    forAll { (frontList: List[Int], backList: List[Int]) =>
      whenever(backList.length > 0) {
        assert(P03.nth(frontList.length, frontList ++ backList) === Some(backList.head))
      }
    }
  }
}
