
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/chariths/Documents/Play_tutorials/Test_My/test_my/conf/routes
// @DATE:Thu Aug 03 12:56:09 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseElementController ElementController = new controllers.ReverseElementController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFormController FormController = new controllers.ReverseFormController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseElementController ElementController = new controllers.javascript.ReverseElementController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFormController FormController = new controllers.javascript.ReverseFormController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
