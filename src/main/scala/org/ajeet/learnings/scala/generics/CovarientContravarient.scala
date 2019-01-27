package org.ajeet.learnings.scala.generics

/**
  * https://apiumhub.com/tech-blog-barcelona/scala-generics-covariance-contravariance/
  *
  * Covariance - A generic class covariant over its abstract type can receive a parameter type of that type or subtypes of that type.
  * ==================
  * For Parking[+A]
  * If Car <: Vehicle
  * Then Parking[Car] <: Parking[Vehicle]
  *
  * Contravariant - A generic class contravariant over its abstract type can receive a parameter type of that type or supertypes of that type. This is reverse of 'Covariance'
  * ==================
  *
  * For Parking[-A]
  * If Vehicle >:(supertype of) Car
  * Then Parking[Vehicle] <: Parking[Car]
  *
  **/
object CovarientContravarient {

  def main(args: Array[String]): Unit = {
    //This will not work
    //val p1: Parking1[Vehicle] = Parking1[Car](new Car)
    val p2 = Parking1[Vehicle](new Car)
    println(p2)
    //val p3 = Parking1[Vehicle](new Car)
    val p3: Parking2[Vehicle] = Parking2[Car](new Car)
    println(p3)

  //  val p4: Parking3[Car] = Parking3[Vehicle](new Car)
   // println(p4)
  }
}
sealed abstract class Vehicle
case class Car() extends Vehicle
case class Motorcycle() extends Vehicle
case class Parking1[A](value: A)
case class Parking2[+A](value: A)
//case class Parking3[-A](value: A)
