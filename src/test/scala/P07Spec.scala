package com.remydagostino.s99

class P07Spec extends UnitSpec with ListGens {
  property("#flatten fulfils the sample input") {
    val sample = List(List(1, 1), 2, List(3, List(5, 8)))
    val output = List(1, 1, 2, 3, 5, 8)

    assert(P07.flatten(sample) === output)
  }

  property("#flatten on two lists within a list is the same as concat") {
    forAll { (list1: List[Int], list2: List[Int]) =>
      assert(P07.flatten(List(list1, list2)) === (list1 ++ list2))
    }
  }

  property("#flatten multiple times is the same as flatten once") {
    forAll(lumpyIntList) { (lumpy: List[Any]) =>
      assert(P07.flatten(lumpy) === P07.flatten(P07.flatten(P07.flatten(lumpy))))
    }
  }
}
