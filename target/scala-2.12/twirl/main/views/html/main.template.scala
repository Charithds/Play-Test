
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*12.58*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>

    <!--<link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned(" stylesheets/main.css")),format.raw/*15.102*/("""">-->

    <link rel="stylesheet" media="screen" href=""""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.106*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/favicon.png")),format.raw/*18.100*/("""">

    <script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*20.74*/("""" type="text/javascript"></script>
    </head>

    <body>

        <div class="navbar navbar-inverse" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Elements</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Add</a></li>
                </ul>
            </div>
        </div>

        <div class="container">
        """),format.raw/*38.32*/("""
        """),_display_(/*39.10*/content),format.raw/*39.17*/("""
        """),format.raw/*40.9*/("""</div>

        <script src=""""),_display_(/*42.23*/routes/*42.29*/.Assets.versioned("javascripts/jquery-3.2.1.min.js")),format.raw/*42.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*43.23*/routes/*43.29*/.Assets.versioned("javascripts/main.js")),format.raw/*43.69*/("""" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(function ($) """),format.raw/*45.33*/("""{"""),format.raw/*45.34*/("""
                """),format.raw/*46.17*/("""$("[rel='tooltip']").tooltip()
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/(""");
        </script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 14:54:33 IST 2017
                  SOURCE: C:/Users/chariths/Documents/Play_tutorials/Test_My/test_my/app/views/main.scala.html
                  HASH: a99eea522cfafab9bef39efa17f2fa529f5a0f2f
                  MATRIX: 1206->261|1331->291|1361->295|1436->395|1469->401|1504->409|1530->414|1622->479|1637->485|1701->527|1786->585|1801->591|1873->641|1958->699|1973->705|2034->744|2085->768|2100->774|2170->823|2717->1433|2755->1444|2783->1451|2820->1461|2879->1493|2894->1499|2967->1551|3052->1609|3067->1615|3128->1655|3265->1764|3294->1765|3340->1783|3412->1827|3441->1828
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|46->15|46->15|46->15|48->17|48->17|48->17|49->18|49->18|49->18|51->20|51->20|51->20|68->38|69->39|69->39|70->40|72->42|72->42|72->42|73->43|73->43|73->43|75->45|75->45|76->46|77->47|77->47
                  -- GENERATED --
              */
          