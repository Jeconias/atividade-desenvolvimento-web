
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Extrato,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(extrato : Extrato):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Extrato")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div class="container">
      
      <div class="header">

        <div class="headerTopBar">
          <div>
            <img src=""""),_display_(/*10.24*/routes/*10.30*/.Assets.versioned("images/icon_bb_256x256.png")),format.raw/*10.77*/(""""" alt="Ícone do Banco do Brasil">
          </div>
          <div>
            <h1>Autoatendimento</h1>
          </div>
          <div>
            <button>Sair</button>
          </div>
        </div>

        <div class="headerBottomBar">
          <div>
            <button>Voltar</button>
          </div>
          <div>
            <h2>Extrato de Conta Corrente</h2>
          </div>
        </div>

      </div>

      <div class="containerTable">
        <table class="table">
          <thead>
            <tr>
              <th>Dia</th>
              <th>Histórico</th>
              <th>Valor</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td></td>
              <td>Saldo Anterior</td>
              <td class="blueColor">"""),_display_(/*44.38*/extrato/*44.45*/.getSaldoAnteriorFormatoBr()),format.raw/*44.73*/("""</td>
            </tr>
            """),_display_(/*46.14*/for(it <- extrato.getItens()) yield /*46.43*/{_display_(Seq[Any](format.raw/*46.44*/("""
              """),format.raw/*47.15*/("""<tr>
                  <td>"""),_display_(/*48.24*/it/*48.26*/.getData()),format.raw/*48.36*/("""</td>
                  <td>"""),_display_(/*49.24*/it/*49.26*/.getHistorico()),format.raw/*49.41*/("""</td>
                  """),_display_(/*50.20*/if(it.getTipo() == "debito")/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""
                    """),format.raw/*51.21*/("""<td class="redColor">"""),_display_(/*51.43*/it/*51.45*/.getValorFormatBr()),format.raw/*51.64*/("""</td>
                  """)))}/*52.20*/else/*52.24*/{_display_(Seq[Any](format.raw/*52.25*/("""
                    """),format.raw/*53.21*/("""<td class="blueColor">"""),_display_(/*53.44*/it/*53.46*/.getValorFormatBr()),format.raw/*53.65*/("""</td>
                  """)))}),format.raw/*54.20*/("""
              """),format.raw/*55.15*/("""</tr>
            """)))}),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""<tr>
                <td></td>
                <td class="saldoFormat">Saldo</td>
                <td class="blueColor">"""),_display_(/*60.40*/extrato/*60.47*/.getSaldoAtualFormatoBr()),format.raw/*60.72*/("""</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
""")))}),format.raw/*66.2*/("""
"""))
      }
    }
  }

  def render(extrato:Extrato): play.twirl.api.HtmlFormat.Appendable = apply(extrato)

  def f:((Extrato) => play.twirl.api.HtmlFormat.Appendable) = (extrato) => apply(extrato)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jun 25 20:26:11 BRT 2019
                  SOURCE: /home/developer/atividade-desenvolvimento-web/lista_02/Q1/app/views/index.scala.html
                  HASH: 61747857290508751c407d86230245540b9ba7be
                  MATRIX: 949->1|1062->21|1089->23|1112->38|1151->40|1182->45|1342->178|1357->184|1425->231|2234->1013|2250->1020|2299->1048|2363->1085|2408->1114|2447->1115|2490->1130|2545->1158|2556->1160|2587->1170|2643->1199|2654->1201|2690->1216|2742->1241|2779->1269|2818->1270|2867->1291|2916->1313|2927->1315|2967->1334|3011->1359|3024->1363|3063->1364|3112->1385|3162->1408|3173->1410|3213->1429|3269->1454|3312->1469|3362->1488|3403->1501|3551->1622|3567->1629|3613->1654|3728->1739
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|41->10|41->10|41->10|75->44|75->44|75->44|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|86->55|87->56|88->57|91->60|91->60|91->60|97->66
                  -- GENERATED --
              */
          