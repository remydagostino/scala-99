package com.remydagostino.s99

class P09Spec extends UnitSpec {
  property("#pack works on the sample input") {
    val sampleInput = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val sampleOutput = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

    assert(P09.pack2(sampleInput) === sampleOutput)
  }

  property("#pack returns an empty list when given an empty sample") {
    assert(P09.pack2(List.empty[Int]) === List.empty[List[Int]])
  }
}
