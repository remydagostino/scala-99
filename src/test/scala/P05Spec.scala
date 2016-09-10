package com.remydagostino.s99

class P05Spec extends UnitSpec {
  property("#reverse reverses a sample length 5 list") {
    assert(P05.reverse(List(1, 2, 3, 4, 5)) === List(5, 4, 3, 2, 1))
  }

  property("#reverse twice is the original list") {
    forAll { (list: List[Int]) =>
      assert(P05.reverse(P05.reverse(list)) === list)
    }
  }

  property("#reverse moves the first element to the end of the list") {
    forAll { (list: List[Int]) =>
      whenever(list.length > 0) {
        assert(P05.reverse(list).head === list.last)
      }
    }
  }
}
