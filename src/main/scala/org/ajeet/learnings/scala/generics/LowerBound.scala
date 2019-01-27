package org.ajeet.learnings.scala.generics

//https://apiumhub.com/tech-blog-barcelona/scala-type-bounds/
object LowerBound {

  def main(args: Array[String]): Unit = {
    val processor = new ProcessorImpl2[Number]
    processor.process(100)
  }
}


//Lower bound - Only Integer and its super classes are allowed
class ProcessorImpl2[A >: Integer]  {
  def process(input: A): Unit = {
    println(input + " processed !!")
  }
}
