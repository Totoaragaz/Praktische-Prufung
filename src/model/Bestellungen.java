package model;

import model.Produkte;

import java.util.ArrayList;
import java.util.List;

public class Bestellungen {
    private int bestellnr;
    private String adresse;
    private List<Produkte> produkte;

    public int getBestellnr() {
        return bestellnr;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produkte> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkte> produkte) {
        this.produkte = produkte;
    }

    public List<String> getProduktNames() {
        List<String> produktNames=new ArrayList<>();
        for (Produkte i: produkte)
            produktNames.add(i.getName());
        return produktNames;
    }

    public Bestellungen() {
    }

    public Bestellungen(int bestellnr, String adresse, List<Produkte> produkte) {
        this.bestellnr = bestellnr;
        this.adresse = adresse;
        this.produkte = produkte;
    }

    @Override
    public String toString(){
        return "Bestellung { Bestellnr:"+ bestellnr+", Adresse: " + adresse+ ", Produkte: "+getProduktNames()+" }";
    }
}
