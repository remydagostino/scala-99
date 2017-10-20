package com.remydagostino.s99

class P11Spec extends UnitSpec {
  property("#encodeModified works on sample input") {
    assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  property("#encodeModified is the identity function on unique lists") {
    forAll { (stringSet: Set[String]) => {
      val uniqueStringList = stringSet.toList
      assert(P07.flatten(P11.encodeModified(uniqueStringList)) === uniqueStringList)
    }}
  }

  property("#encodeModified collapses a homogeneous list into a tuple with the length of the list") {
    forAll { (str: String, n: Int) =>
      whenever(n > 0) {
        assert(P07.flatten(P11.encodeModified(List.fill(n)(str))) === List((n, str)))
      }
    }
  }
}
