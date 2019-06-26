// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/atividade-desenvolvimento-web/lista_02/conf/routes
// @DATE:Wed Jun 26 02:40:45 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(genero:String = "", artista:String = ""): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(genero == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("genero", genero)), if(artista == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("artista", artista)))))
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
