package models

import play.api.libs.json.Json

object City {

  case class City(code: String, iso: String, name: String)

  implicit val cityWrites = Json.writes[City]
  implicit val cityReads = Json.reads[City]

  var cities = List(City("BKK", "TH-10", "กรุงเทพมหานคร"), City("KRI", "TH-71", "จังหวัดกาญจนบุรี"))
}