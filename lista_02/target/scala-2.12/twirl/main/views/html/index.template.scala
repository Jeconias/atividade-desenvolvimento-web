
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Extrato")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div class="container">
      
      <div>
        <h1>Extrado</h1>
        <table class="table">
          <thead>
            <tr>
              <td>Dia</td>
              <td>Hostórico</td>
              <td>Valor</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>01</td>
              <td>Nome</td>
              <td>2616</td>
            </tr>
          </tbody>
        </table>
      </div>

    </div>
""")))}),format.raw/*27.2*/("""
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
                  DATE: Mon Jun 24 08:04:04 GFT 2019
                  SOURCE: C:/Users/20181014040040/Desktop/lista02/app/views/index.scala.html
                  HASH: 85d872baabf7822e385604e8f06336b9c39e86be
                  MATRIX: 941->1|1037->3|1067->8|1090->23|1129->25|1161->31|1670->510
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|59->27
                  -- GENERATED --
              */
          