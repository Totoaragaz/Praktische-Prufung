package com.company;

public class OrtEinkommen {
    private String ort;
    private int einkommen;

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public void increaseEinkommen(int einkommen){
        this.einkommen+=einkommen;
    }

    public OrtEinkommen(String ort, int einkommen) {
        this.ort = ort;
        this.einkommen = einkommen;
    }

    public OrtEinkommen() {
        this.ort="";
        this.einkommen=0;
    }
}
