package ControllerSpec


import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._



/**
 * Created by matthew on 16/11/16.
 */
class authFormSpec extends PlaySpec with OneAppPerTest {

  "FormController" should {
    "not return 404" when {
      "we try to hit the route /authFormPage"in {
        route(app, FakeRequest(GET, "/authFormPage")).map(status(_)) must not be Some(NOT_FOUND)
      }
    }


    "render a page" when {
      "we try to hit the route /authFormPage" in {
        val result = route(app, FakeRequest(GET, "/authFormPage"))
        result.map(status(_)) mustBe Some(OK)
        val text: String = result.map(contentAsString(_)).get
        text must include ("Welcome to Play")


      }
    }}

}
