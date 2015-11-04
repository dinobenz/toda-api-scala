package controllers

import play.api.libs.json._
import play.api._
import play.api.mvc._
import models.City._

class Application extends Controller {

  def listCities = Action {
  	Ok(Json.toJson(cities))
  }

}
