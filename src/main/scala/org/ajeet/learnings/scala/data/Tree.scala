package org.ajeet.learnings.scala.data

/**
  * Follow it
  * https://github.com/vkostyukov/scalacaster/blob/master/src/tree/Tree.scala
  *
  * @tparam Ordered
  * @tparam V
  */
trait Tree[Ordered, V] {
  def add(key:Ordered, value:V)
  def update(key:Ordered, newValue:V):V
  def find(key:Ordered):V
  def findRange(from:Ordered, to:Ordered): List[V]

  def isEmpty():Boolean = false

  protected case class Node(key: Ordered, value: V, left:Node, right:Node)
}
