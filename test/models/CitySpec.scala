package models

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

import models.City._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class CitySpec extends Specification {

  "City" should {

    "has valid fields" in new WithApplication{
      val city = new City("code", "iso", "name")
      city.code must equalTo("code")
      city.iso must equalTo("iso")
      city.name must equalTo("name")
    }
  }
}
