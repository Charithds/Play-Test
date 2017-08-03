package controllers;

import io.ebean.Ebean;
import models.Element;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class FormController extends Controller {


    private FormFactory formFactory;

    @Inject
    public FormController(FormFactory formFactory){
        this.formFactory = formFactory;
    }


    public Result testForm(){
        /*
        if (request().hasBody())
            return badRequest("Body not found!");
        else
            return ok(request().body().asJson().asText());
        */
        /*
        DynamicForm form = formFactory.form().bindFromRequest();

        if (form == null) {
            return badRequest("Expceting some data");
        } else {
            return ok(Json.toJson(form.rawData()));
        }
        */

        Form<Element> elementFormData = formFactory.form(Element.class).bindFromRequest();
        if (elementFormData.hasErrors())
            return badRequest("Validation Failed!");
        Element element = elementFormData.get();
        try {
            Ebean.save(element);
        }catch (RuntimeException ex){
            return internalServerError("Database error!");
        }
        return ok(element.toString());
    }
}
