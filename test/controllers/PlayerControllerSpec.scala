//package controllers
//
//import org.scalatestplus.play._
//import org.scalatestplus.play.guice._
//import play.api.test.Helpers._
//import play.api.test._
//
///**
// * Add your spec here.
// * You can mock out a whole application including requests, plugins etc.
// *
// * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
// */
//class AdControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {
//
//
//  "PlayerController GET" should {
//
//    "render the index page from a new instance of controller" in {
//
//      val components = stubControllerComponents()
//      val playerId = 1
//      val controller = new AdController(components)
//      val home = controller.get(playerId).apply(FakeRequest(GET, "/player/${playerId}"))
//
//      status(home) mustBe OK
//      contentType(home) mustBe Some("text/plain")
//      contentAsString(home) must include (s"Welcome $playerId" )
//
//    }
////
////    "render the index page from the application" in {
////      val controller = inject[HomeController]
////      val home = controller.index().apply(FakeRequest(GET, "/"))
////
////      status(home) mustBe OK
////      contentType(home) mustBe Some("text/html")
////      contentAsString(home) must include ("Welcome to Play")
////    }
////
////    "render the index page from the router" in {
////      val request = FakeRequest(GET, "/")
////      val home = route(app, request).get
////
////      status(home) mustBe OK
////      contentType(home) mustBe Some("text/html")
////      contentAsString(home) must include ("Welcome to Play")
////    }
//  }
//}
