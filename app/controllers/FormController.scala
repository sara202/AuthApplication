package controllers

import javax.inject._
import play.api._
import play.api.mvc._
/**
 * Created by matthew on 01/11/16.
 */

@Singleton
class FormController @Inject() extends Controller {

  def authForm = Action {
    Ok(views.html.authFormPage("ready"))
  }

}
