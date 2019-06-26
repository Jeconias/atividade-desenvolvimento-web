
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.extrato.Extrato,List[models.filme.Filme],List[models.filme.Artista],List[models.filme.Filme],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(extrato : models.extrato.Extrato, fshow : List[models.filme.Filme], artistas : List[models.filme.Artista], fshowA : List[models.filme.Filme]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Extrato e lista de Filmes")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
"""),format.raw/*4.1*/("""<div class="container">

  <div class="containerExtrato">
    <div class="header">
      <div class="headerTopBar">
        <div>
          <img src=""""),_display_(/*10.22*/routes/*10.28*/.Assets.versioned("images/icon_bb_256x256.png")),format.raw/*10.75*/(""""" alt="Ícone do Banco do Brasil">
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
            <td class="blueColor">"""),_display_(/*43.36*/extrato/*43.43*/.getSaldoAnteriorFormatoBr()),format.raw/*43.71*/("""</td>
          </tr>
          """),_display_(/*45.12*/for(it <- extrato.getItens()) yield /*45.41*/{_display_(Seq[Any](format.raw/*45.42*/(""" """),format.raw/*45.43*/("""<tr>
            <td>"""),_display_(/*46.18*/it/*46.20*/.getData()),format.raw/*46.30*/("""</td>
            <td>"""),_display_(/*47.18*/it/*47.20*/.getHistorico()),format.raw/*47.35*/("""</td>
            """),_display_(/*48.14*/if(it.getTipo() == "debito")/*48.42*/{_display_(Seq[Any](format.raw/*48.43*/("""
            """),format.raw/*49.13*/("""<td class="redColor">"""),_display_(/*49.35*/it/*49.37*/.getValorFormatBr()),format.raw/*49.56*/("""</td>
            """)))}/*50.14*/else/*50.18*/{_display_(Seq[Any](format.raw/*50.19*/("""
            """),format.raw/*51.13*/("""<td class="blueColor">"""),_display_(/*51.36*/it/*51.38*/.getValorFormatBr()),format.raw/*51.57*/("""</td>
            """)))}),format.raw/*52.14*/("""
            """),format.raw/*53.13*/("""</tr>
            """)))}),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""<tr>
              <td></td>
              <td class="saldoFormat">Saldo</td>
              <td class="blueColor">"""),_display_(/*58.38*/extrato/*58.45*/.getSaldoAtualFormatoBr()),format.raw/*58.70*/("""</td>
            </tr>
        </tbody>
      </table>
    </div>
  </div>

  <div class="containerFilmes">
    <div>
      <div class="selectGenero">
        <select name="genero" id="selectGenero">
          <option value="" disabled selected>Selecione o Gênero</option>
          <option value="comedia">Comédia</option>
          <option value="ficcao-cientifica">Ficcção Científica</option>
          <option value="terror">Terror</option>
        </select>
      </div>
      <table class="tableGenero">
        <thead>
          <tr>
            <th>Nome</th>
            <th>Ano</th>
            <th>País</th>
            <th>Artistas</th>
          </tr>
        </thead>
        <tbody>
          """),_display_(/*85.12*/for(f <- fshow) yield /*85.27*/{_display_(Seq[Any](format.raw/*85.28*/(""" """),format.raw/*85.29*/("""<tr>
            <td>"""),_display_(/*86.18*/f/*86.19*/.getNome()),format.raw/*86.29*/("""</td>
            <td>"""),_display_(/*87.18*/f/*87.19*/.getAno()),format.raw/*87.28*/("""</td>
            <td>"""),_display_(/*88.18*/f/*88.19*/.getPais()),format.raw/*88.29*/("""</td>
            <td>"""),_display_(/*89.18*/f/*89.19*/.getArtistasStr()),format.raw/*89.36*/("""</td>
            </tr>
            """)))}),format.raw/*91.14*/("""
        """),format.raw/*92.9*/("""</tbody>
      </table>
    </div>

    <div>
      <div class="selectArtista">
        <select name="artista" id="selectArtista">
          <option value="" disabled selected>Selecione o Artista</option>
          """),_display_(/*100.12*/for(a <- artistas) yield /*100.30*/{_display_(Seq[Any](format.raw/*100.31*/("""
            """),format.raw/*101.13*/("""<option value=""""),_display_(/*101.29*/a/*101.30*/.getNome()),format.raw/*101.40*/("""">"""),_display_(/*101.43*/a/*101.44*/.getNome()),format.raw/*101.54*/("""</option>
          """)))}),format.raw/*102.12*/("""
        """),format.raw/*103.9*/("""</select>
      </div>
      <table class="tableGenero">
        <thead>
          <tr>
            <th>Filme</th>
            <th>Ano</th>
            <th>Gênero</th>
            <th>Papel</th>
          </tr>
        </thead>
        <tbody>
          """),_display_(/*115.12*/for(f <- fshowA) yield /*115.28*/{_display_(Seq[Any](format.raw/*115.29*/(""" """),format.raw/*115.30*/("""<tr>
            <td>"""),_display_(/*116.18*/f/*116.19*/.getNome()),format.raw/*116.29*/("""</td>
            <td>"""),_display_(/*117.18*/f/*117.19*/.getAno()),format.raw/*117.28*/("""</td>
            <td>"""),_display_(/*118.18*/f/*118.19*/.getGenero().getNome()),format.raw/*118.41*/("""</td>
            <td>01</td>
            </tr>
            """)))}),format.raw/*121.14*/("""
        """),format.raw/*122.9*/("""</tbody>
      </table>
    </div>
  </div>

</div>
""")))}))
      }
    }
  }

  def render(extrato:models.extrato.Extrato,fshow:List[models.filme.Filme],artistas:List[models.filme.Artista],fshowA:List[models.filme.Filme]): play.twirl.api.HtmlFormat.Appendable = apply(extrato,fshow,artistas,fshowA)

  def f:((models.extrato.Extrato,List[models.filme.Filme],List[models.filme.Artista],List[models.filme.Filme]) => play.twirl.api.HtmlFormat.Appendable) = (extrato,fshow,artistas,fshowA) => apply(extrato,fshow,artistas,fshowA)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jun 26 03:07:06 BRT 2019
                  SOURCE: /home/developer/atividade-desenvolvimento-web/lista_02/app/views/index.scala.html
                  HASH: fa6cbf76b822bb187d522395435713df762e6437
                  MATRIX: 1041->1|1277->144|1304->146|1345->179|1384->181|1411->182|1589->333|1604->339|1672->386|2418->1105|2434->1112|2483->1140|2543->1173|2588->1202|2627->1203|2656->1204|2705->1226|2716->1228|2747->1238|2797->1261|2808->1263|2844->1278|2890->1297|2927->1325|2966->1326|3007->1339|3056->1361|3067->1363|3107->1382|3145->1401|3158->1405|3197->1406|3238->1419|3288->1442|3299->1444|3339->1463|3389->1482|3430->1495|3480->1514|3521->1527|3663->1642|3679->1649|3725->1674|4461->2383|4492->2398|4531->2399|4560->2400|4609->2422|4619->2423|4650->2433|4700->2456|4710->2457|4740->2466|4790->2489|4800->2490|4831->2500|4881->2523|4891->2524|4929->2541|4997->2578|5033->2587|5277->2803|5312->2821|5352->2822|5394->2835|5438->2851|5449->2852|5481->2862|5512->2865|5523->2866|5555->2876|5608->2897|5645->2906|5928->3161|5961->3177|6001->3178|6031->3179|6081->3201|6092->3202|6124->3212|6175->3235|6186->3236|6217->3245|6268->3268|6279->3269|6323->3291|6416->3352|6453->3361
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|41->10|41->10|41->10|74->43|74->43|74->43|76->45|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|84->53|85->54|86->55|89->58|89->58|89->58|116->85|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|122->91|123->92|131->100|131->100|131->100|132->101|132->101|132->101|132->101|132->101|132->101|132->101|133->102|134->103|146->115|146->115|146->115|146->115|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|152->121|153->122
                  -- GENERATED --
              */
          