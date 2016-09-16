package com.remydagostino.s99

class P08Spec extends UnitSpec {
  property("#compress works on sample input") {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }

  property("#compress is idempotent") {
    forAll { (list: List[Int]) =>
      assert(P08.compress(list) === P08.compress(P08.compress(list)))
    }
  }

  property("#compress on list(A, A) results in list(A)") {
    forAll { (a: Int) =>
      assert(P08.compress(List(a, a)) === List(a))
    }
  }
}
