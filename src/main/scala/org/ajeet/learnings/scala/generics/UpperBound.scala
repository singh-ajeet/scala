package org.ajeet.learnings.scala.generics


object UpperBound {

  def main(args: Array[String]): Unit = {
    val processor = new ProcessorImpl1[Integer]
    processor.process(1)
  }
}

//Upper bound - Only Number and its subclass are allowed
class ProcessorImpl1[A <: Number]  {
  def process(input: A): Unit = {
    println(input + " processed !!")
  }
}
