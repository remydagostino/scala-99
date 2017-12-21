package com.remydagostino.s99

class P12Spec extends UnitSpec {
  property("#decode works on sample input") {
    assert(P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) === List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  property("#decoding input encoded with #encode results in the original input") {
    forAll((list: List[String]) =>
      assert(P12.decode(P10.encode(list)) === list)
    )
  }
}

