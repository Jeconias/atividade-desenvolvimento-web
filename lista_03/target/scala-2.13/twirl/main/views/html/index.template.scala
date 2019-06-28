
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(imgLink : String, hide : Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("yUML")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<div class="containerForm">
    <form class="form" action="/yuml" method="POST">
      <div>
        <h1>Gerar UML</h1>
      </div>
      <div class="autorInput">
        <input type="text" name="autor" required placeholder="Autor">
      </div>
      <div class="casosDeUsoTextarea">
        <textarea name="casosDeUso" rows="10" placeholder="Insira os casos de uso separado por linhas" ></textarea>
      </div>
      <div class="coresSelect">
        <select name="cor" required>
          <option value="" disabled selected>Deseja utilizar cores nos casos de uso?</option>
          <option value="true">Sim</option>
          <option value="false">Não</option>
        </select>
      </div>
      <div class="formatStyle">
        <select name="format" required>
          <option value="" disabled selected>Escolha o formato do diagrama</option>
          <option value="scruffy">Scruffy</option>
          <option value="boring">Boring</option>
          <option value="plain">Plain</option>
        </select>
      </div>
      <div class="extensaoSelect">
        <select name="extensao" required>
          <option value="" disabled selected>Selecione o formato do arquivo</option>
          <option value=".png">.PNG</option>
          <option value=".jpg">.JPG</option>
          <option value=".svg">.SVG</option>
          <option value=".pdf">.PDF</option>
        </select>
      </div>
      <div class="buttonInput">
        <input type="submit" value="Gerar">
      </div>
    </form>
    <div class="containerImg">
      """),_display_(/*44.8*/if(hide == true)/*44.24*/{_display_(Seq[Any](format.raw/*44.25*/("""
        """),format.raw/*45.9*/("""<h1>Visualize a imagem aqui</h1>
      """)))}/*46.8*/else/*46.12*/{_display_(Seq[Any](format.raw/*46.13*/("""
        """),format.raw/*47.9*/("""<img src=""""),_display_(/*47.20*/imgLink),format.raw/*47.27*/("""" alt="Seu CDU gerado">
      """)))}),format.raw/*48.8*/("""
    """),format.raw/*49.5*/("""</div>
  </div>
""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(imgLink:String,hide:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(imgLink,hide)

  def f:((String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (imgLink,hide) => apply(imgLink,hide)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-06-28T10:29:03.459583600
                  SOURCE: C:/Users/20181014040040/Desktop/atividade-desenvolvimento-web/lista_03/app/views/index.scala.html
                  HASH: ee9f89ed756823657ca4ea3e6acb88726fb311e0
                  MATRIX: 956->1|1085->35|1115->40|1135->52|1174->54|1204->58|2814->1642|2839->1658|2878->1659|2915->1669|2974->1710|2987->1714|3026->1715|3063->1725|3101->1736|3129->1743|3191->1775|3224->1781|3273->1800
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|76->44|76->44|76->44|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|81->49|83->51
                  -- GENERATED --
              */
          