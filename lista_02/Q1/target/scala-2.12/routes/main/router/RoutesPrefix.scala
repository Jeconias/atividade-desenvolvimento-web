// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/atividade-desenvolvimento-web/lista_02/conf/routes
// @DATE:Tue Jun 25 18:05:47 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
