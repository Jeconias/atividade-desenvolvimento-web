// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/20181014040040/Desktop/lista02/conf/routes
// @DATE:Mon Jun 24 07:58:28 GFT 2019


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
