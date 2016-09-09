package com.remydagostino.s99

import org.scalatest.prop.PropertyChecks
import org.scalatest.{ Matchers, PropSpec }

abstract class UnitSpec extends PropSpec
  with PropertyChecks
  with Matchers
