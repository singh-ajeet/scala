package org.ajeet.learnings.scala.data

class BinaryTree[K, V] extends Tree[K, V]{
  override def add(key: K, value: V): Unit = ???

  override def update(key: K, newValue: V): V = ???

  override def find(key: K): V = ???

  override def findRange(from: K, to: K): List[V] = ???
}
