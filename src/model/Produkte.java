package model;

public class Produkte {
    private String name;
    private int preis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public Produkte() {
    }

    public Produkte(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    @Override
    public String toString(){
        return "Produkt { Name:"+ name+", Preis: " + preis+" }";
    }
}
