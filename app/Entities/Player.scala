import com.mongodb.casbah.Imports._
//
//val mongoClient = MongoClient("localhost", 30000)
//
//val db = mongoClient("local")("books")
//////db.find(MongoDBObject( "58a65e81af0e530a83ac1650"))
//
//val goodbye = MongoDBObject("goodbye" -> "world")
//val goodbyeWorld = db.findOne( MongoDBObject("$oid" -> "world") )

case class Book(isbn: String) {
  def Honk(s: String): String = {

    s + "honk"

  }
}


//val frankenstein = Book("978-0486282114")
//
//sealed trait Pet
//case class Cat(name: String) extends Pet
//case class Fish(name: String, color: String) extends Pet
//case class Squid(name: String, age: Int) extends Pet
//
//def sayHi(p: Pet): String =
//  p match {
//    case Cat(n)      => "Meow " + n + "!"
//    case Fish(n, _)  => "Hello fishy " + n + "."
//    case Squid(n, _) => "Hi " + n + "."
//  }