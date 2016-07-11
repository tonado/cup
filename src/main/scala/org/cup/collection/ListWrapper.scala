package org.cup.collection

import scala.math.Ordering

case class ListWrapper[A](list: List[A]) {
  //  def sortBy[B](f: A => B)(implicit ord: Ordering[B]): List[A] =
  //    list.sortBy(f)(ord)

  def sortBy[B : Ordering](f: A => B): List[A] =
    list.sortBy(f)
}
