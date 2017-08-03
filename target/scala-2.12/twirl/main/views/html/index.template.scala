
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Elements")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<h1>Welcome to Elements!</h1>
    """),_display_(/*5.6*/example_form()),format.raw/*5.20*/("""
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 14:39:22 IST 2017
                  SOURCE: C:/Users/chariths/Documents/Play_tutorials/Test_My/test_my/app/views/index.scala.html
                  HASH: 30527765e787d5401643d0454e82b1aa7f6b6639
                  MATRIX: 948->1|1060->18|1090->23|1114->39|1153->41|1185->47|1246->83|1280->97|1312->100
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|38->6
                  -- GENERATED --
              */
          