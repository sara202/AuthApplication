package controllers

/**
 * Created by matthew on 17/11/16.
 */
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views.html.helper

class Application extends Controller {


  def index = Action {
    Ok(views.html.testForm())
  }

  def submit = Action {
    val url = "https://www-qa.tax.service.gov.uk/oauth/authorize?response_type=code&client_id=yq5WiFXVEqvjNymfThqrjlUg5ZUa&scope=write:trusts-estates&redirect_uri=https://www-qa.tax.service.gov.uk/trusts?userID='username1'&password='password1'"
    Redirect(url)
  }



}