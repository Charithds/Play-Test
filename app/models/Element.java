package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "periodic_elements")
public class Element extends Model{

    @Column(name = "ELEMENT")
    @Constraints.Required
    private String element;

    @Column(name = "ATOMIC_NUMBER")
    @Constraints.Required
    private byte atomicNumber;

    @Column(name = "SYMBOL")
    @Constraints.Required
    private String symbol;

    @Column(name = "METAL_GROUP")
    @Constraints.Required
    private String metalGroup;

    public Element(){}

    public Element(String element, byte atomicNumber, String symbol, String metalGroup) {
        this.element = element;
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.metalGroup = metalGroup;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public byte getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(byte atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMetalGroup() {
        return metalGroup;
    }

    public void setMetalGroup(String metalGroup) {
        this.metalGroup = metalGroup;
    }

    @Override
    public String toString(){
        return "Element : "+ getElement() +"\n"+
                "Atomic Number : "+ getAtomicNumber() +"\n"+
                "Symbol : "+ getSymbol() +"\n"+
                "Metal Group : "+ getMetalGroup();
    }

    public static final Finder<Long, Element> find = new Finder<>(Element.class);
}
