package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {

    import java.util.Calendar
    import java.text.SimpleDateFormat

    val today = Calendar.getInstance.getTime
    val curTimeFormat = new SimpleDateFormat("dd/MM/YY - HH:mm.ss")

    val s = curTimeFormat.format(today)

    Ok(views.html.index(s"$s - Your new application is ready."))
  }

}