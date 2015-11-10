package controllers

import play.api.libs.json._
import play.api._
import play.api.mvc._
import models.City._

class Application extends Controller {

  def listCities = Action {
  	Ok(Json.toJson(cities))
  }

  def getCity(iso: String) = Action {
  	val city = cities find { e => e.iso == iso }
  	city match {
  		case Some(x: models.City.City) => Ok(Json.toJson(city))
  		case _ => NoContent
  	}
  }

}
