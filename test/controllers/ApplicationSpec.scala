package controllers

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  "Application" should {

    "list all cities" in new WithApplication{
      val home = route(FakeRequest(GET, "/api/geolocation/cities")).get
      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "application/json")
      //contentAsString(home) must contain ("Your new application is ready.")
    }

    "get status 200 when request valid city" in new WithApplication{
      val home = route(FakeRequest(GET, "/api/geolocation/cities/TH-10")).get
      status(home) must equalTo(OK)
    }

    "get status 204 when request invalid city" in new WithApplication{
      val home = route(FakeRequest(GET, "/api/geolocation/cities/TH-00")).get
      status(home) must equalTo(204)
    }
  }
}
