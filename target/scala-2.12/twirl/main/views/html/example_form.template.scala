
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
/*1.2*/import helper._

object example_form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.4*/("""
"""),format.raw/*3.1*/("""<form action="/test" method="post">
    """),_display_(/*4.6*/CSRF/*4.10*/.formField),format.raw/*4.20*/("""
    """),format.raw/*5.5*/("""<fieldset>
        <legend>Element information:</legend>
        Element:<br>
        <input type="text" name="element" ><br>
        Atomic Number:<br>
        <input type="text" name="atomicNumber" ><br>
        Symbol:<br>
        <input type="text" name="symbol"><br>
        Metal Group:<br>
        <input type="text" name="metalGroup"><br>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
                <button id="cancel" class="btn cancel">Cancel</button>
            </div>
        </div>
    </fieldset>
</form>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 14:28:39 IST 2017
                  SOURCE: C:/Users/chariths/Documents/Play_tutorials/Test_My/test_my/app/views/example_form.scala.html
                  HASH: 0fff2fef8a9da9dfdc3e8ca4c977f301ced64aa8
                  MATRIX: 651->1|971->19|1067->21|1095->23|1162->65|1174->69|1204->79|1236->85
                  LINES: 24->1|29->2|34->2|35->3|36->4|36->4|36->4|37->5
                  -- GENERATED --
              */
          