// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/atividade-desenvolvimento-web/lista_02/conf/routes
// @DATE:Wed Jun 26 02:40:45 BRT 2019


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
