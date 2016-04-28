package tutorial.webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

import org.scalajs.dom
import dom.document

import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {

  // This is called from ScalaJS, so doesn't need the annotation
  def clickMe(s: String) {
    jQuery("body").append(s"""<button type=\"button\" onclick=\"tutorial.webapp.TutorialApp().again('again')\">${s}</button>""")
  }

  // This is called from JavaScript, so needs the annotation
  @JSExport
  def again(s: String) {
    val b = jQuery(s"""<button type=\"button\">${s}</button>""")
    b.click(() => clickMe("and again"))
    jQuery("body").append(b)
  }

  def main(): Unit = {
    println("Hello world!")
    // Using the DOM API rather than jQuery
    document.body.appendChild(document.createTextNode("Hello World"))
    clickMe("Click me!")
  }
}