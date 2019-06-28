// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/20181014040040/Desktop/atividade-desenvolvimento-web/lista_03/conf/routes
// @DATE:Fri Jun 28 10:29:03 BRT 2019


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
