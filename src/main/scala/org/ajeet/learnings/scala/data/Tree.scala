package org.ajeet.learnings.scala.data

trait Tree[K, V] {
  def add(key:K, value:V)
  def update(key:K, newValue:V):V
  def find(key:K):V
  def findRange(from:K, to:K): List[V]
}
