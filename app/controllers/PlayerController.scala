package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PlayerController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
//class PlayerController @Inject()(val reactiveMongoApi: ReactiveMongoApi) extends Controller with MongoController with ReactiveMongoComponents {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def get(playerId: Int) = Action.async { implicit request: Request[AnyContent] =>
    scala.concurrent.Future {
      Ok(s"Welcome player $playerId")
    }
  }
}

