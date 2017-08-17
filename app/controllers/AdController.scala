package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.bson.{BSONObjectID, BSONDocument}
import repos.AdRepoImpl

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
//class AdController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
@Singleton
  class AdController @Inject()(val reactiveMongoApi: ReactiveMongoApi) extends Controller with MongoController with ReactiveMongoComponents {


  //,class PlayerController @Inject()(val reactiveMongoApi: ReactiveMongoApi) extends Controller with MongoController with ReactiveMongoComponents {


  import controllers.AdFields._
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

  def create = Action.async(BodyParsers.parse.json) { implicit request =>
    val name = (request.body \ Name).as[String]
    val description = (request.body \ Description).as[String]
    val author = (request.body \ Author).as[String]
    adRepo.save(BSONDocument(
      Name -> name,
      Description -> description,
      Author -> author
    )).map(result => Created)
  }

  def delete(id: String) = TODO


  val adRepo = new AdRepoImpl(reactiveMongoApi)
}


object AdFields {
  val Id = "_id"
  val Name = "name"
  val Description = "description"
  val Author = "author"
}
