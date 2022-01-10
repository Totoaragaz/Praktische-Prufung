package com.company;

public class Kunde {
    private int id;
    private String unternehmensname;
    private grosse unternehmensgrosse;
    private enum grosse{
        Small,Medium,Large
    }
    private int anzahlMitarbeiter;
    private int kundeEinkommen;
    private String Ort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public boolean setUnternehmensgrosse(String ugrosse){
        if (ugrosse.equals("Small")){
            this.unternehmensgrosse=grosse.Small;
            return true;
        }
        if (ugrosse.equals("Medium")){
            this.unternehmensgrosse=grosse.Medium;
            return true;
        }
        if (ugrosse.equals("Large")) {
            this.unternehmensgrosse=grosse.Large;
            return true;
        }
        return false;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    public int getKundeEinkommen() {
        return kundeEinkommen;
    }

    public void setKundeEinkommen(int kundeEinkommen) {
        this.kundeEinkommen = kundeEinkommen;
    }

    public grosse getUnternehmensgrosse() {
        return unternehmensgrosse;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public Kunde() {
    }

    public Kunde(int id, String unternehmensname, String unternehmensgrosse, int anzahlMitarbeiter, int kundeEinkommen, String ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        if (unternehmensgrosse.equals("Small")){
            this.unternehmensgrosse=grosse.Small;
        }
        else if (unternehmensgrosse.equals("Medium")){
            this.unternehmensgrosse=grosse.Medium;
        }
        else if (unternehmensgrosse.equals("Large")) {
            this.unternehmensgrosse=grosse.Large;
        }
        else this.unternehmensname=null;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.kundeEinkommen = kundeEinkommen;
        Ort = ort;
    }
}
