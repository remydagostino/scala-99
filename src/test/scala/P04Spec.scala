package com.remydagostino.s99

class P04Spec extends UnitSpec {
  property("#length should return 0 when given an empty list") {
    assert(P04.length(List.empty) === 0)
  }

  property("#length should be one greater after an element is added") {
    forAll { (list: List[Int], end: Int) =>
      assert(P04.length(list) + 1 === P04.length(list :+ end))
    }
  }

  property("Sum of #length of two lists should be the same as the joined lists") {
    forAll { (list1: List[Int], list2: List[Int]) =>
      assert(P04.length(list1) + P04.length(list2) === P04.length(list1 ++ list2))
    }
  }
}
