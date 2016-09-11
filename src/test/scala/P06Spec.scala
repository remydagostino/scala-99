package com.remydagostino.s99

class P06Spec extends UnitSpec {
  val palindromes =
    Table(
      "palindromes",
      List.empty[Int],
      List(5),
      List(1, 2, 3, 2, 1),
      List(2, 2)
    )

  val nonPalindromes =
    Table(
      "non-palindromes",
      List(1, 2),
      List(5, 4, 3),
      List(1, 2, 3)
    )

  property("#isPalindrome is true for all example palindromes") {
    forAll(palindromes) { (list: List[Int]) =>
      assert(P06.isPalindrome(list) === true)
    }
  }

  property("#isPalindrome is false for all example non-palindromes") {
    forAll(nonPalindromes) { (list: List[Int]) =>
      assert(P06.isPalindrome(list) === false)
    }
  }

  property("#isPalindrome is false for a list of two different items") {
    forAll { (a: Int, b: Int) =>
      whenever(a != b) {
        assert(P06.isPalindrome(List(a, b)) === false)
      }
    }
  }

  property("#isPalindrome is true for any list appended to it's inverse") {
    forAll { (list: List[Int]) =>
      assert(P06.isPalindrome(list ++ P05.reverse(list)) === true)
    }
  }
}
