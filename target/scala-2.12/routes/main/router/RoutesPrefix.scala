
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/chariths/Documents/Play_tutorials/Test_My/test_my/conf/routes
// @DATE:Thu Aug 03 12:56:09 IST 2017


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
