package com.remydagostino.s99

class P10Spec extends UnitSpec {
  property("#encode works on sample input") {
    assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  property("#encode returns tuples whose second elements form the #compress list") {
    forAll { (list: List[Int]) =>
      assert(P10.encode(list).map(_._2) === P08.compress(list))
    }
  }

  property("#encode counts the unique items in a sorted list") {
    forAll { (a: Int, b: Int) =>
      whenever(a != b) {
        assert(P10.encode(List(a, a, b, b)) === List((2, a), (2, b)))
      }
    }
  }
}
