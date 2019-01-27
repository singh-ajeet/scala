package org.ajeet.learnings.scala.generics

object LowerAndUpperBound {

  def main(args: Array[String]): Unit = {
    val processor1  = new LowerAndUpperBoundProcessor[Integer]
    processor1.process(100)
    val processor2  = new LowerAndUpperBoundProcessor[Number]
    processor2.process(200)

    //This will throw error at runtime
    //val processor3  = new LowerAndUpperBoundProcessor[Short]
    //processor3.process(200)
  }

}

class LowerAndUpperBoundProcessor[A>:Integer<:Number] {
  def process(input: A) = {
    println(input + " procdessed !!!")
  }
}
