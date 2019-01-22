package org.ajeet.learnings.scala.functional

object Currying extends App {

  def mail(ip:String)(msg:String) = println(msg + " " + ip)
  val localMail = mail("127.0.0.1") _

  localMail("Hello")

  def add(x:Int)(y:Int) = x + 100
  val add1 = add(1) _

  println(add1(10))

  def adder(x:Int)(f:(Int => Int) ) = f(x)
  val adder1 = adder(1) _

  println(adder1(x => x + 1))
}
