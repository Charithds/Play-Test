package controllers;

import io.ebean.Ebean;
import models.Element;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class ElementController extends Controller{

    public Result getElement(long atomicNumber){
        if (atomicNumber == 0){
            return notAcceptable("Enter a valid atomic number!.");
        }

        List<Element> results = Element.find.query().where()
                .eq("atomic_number", atomicNumber)
                .setFirstRow(0)
                .setMaxRows(25)
                .findPagedList()
                .getList();
        if (results.size() > 0)
            return ok(results.get(0).toString());
        return notFound("Element not found!");
    }

}
