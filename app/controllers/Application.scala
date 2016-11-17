package controllers

/**
 * Created by matthew on 17/11/16.
 */
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

class Application extends Controller {


  val form = Form(
    tuple(
      "clientID" -> text,
      "clientSecret" -> text
    )
  )

  def index = Action {
    Ok(views.html.testForm())
  }

  def submit = Action { implicit request =>
    val (clientID, clientSecret) = form.bindFromRequest.get
    val clientIDString = clientID.toString
    val clientSecretString = clientSecret
    Ok("Client ID = " + clientIDString + "\nClient Secret = " + clientSecretString)
  }
}