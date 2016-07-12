package org.cup.collection.immutable

import scala.math.Ordering

case class Pair[+T](first: T, second: T) {
  def smaller[T : Ordering] = Ordering[T].min(first, second)
}
