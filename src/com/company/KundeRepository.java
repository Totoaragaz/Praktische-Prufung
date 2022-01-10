package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KundeRepository {
    private List<Kunde> kundeList;

    public KundeRepository() {
        kundeList=new ArrayList<>();
    }

    public List<Kunde> getKundeList() {
        return kundeList;
    }

    public void setKundeList(List<Kunde> kundeList) {
        this.kundeList = kundeList;
    }

    public KundeRepository(List<Kunde> kundeList) {
        this.kundeList = kundeList;
    }

    public void addKunde(Kunde kunde){
        this.kundeList.add(kunde);
    }

    public void getFileData(){
        FileRepository fileRepository=new FileRepository();
        this.kundeList=fileRepository.getAllKunden();
    }

    public void printKunden(){
        for (Kunde kunde: kundeList){
            System.out.println(kunde.getId()+" "+kunde.getUnternehmensname()+" "+kunde.getUnternehmensgrosse()+" "+kunde.getAnzahlMitarbeiter()+" "+kunde.getKundeEinkommen()+" "+kunde.getOrt());
        }
    }

    public void sortKunden(){
        List<Kunde> newKundeList=kundeList;
        Collections.sort(newKundeList, new Comparator<Kunde>() {
            @Override
            public int compare(Kunde o1, Kunde o2) {
                if (o1.getAnzahlMitarbeiter()<o2.getAnzahlMitarbeiter()) return 1;
                else if (o1.getAnzahlMitarbeiter()==o2.getAnzahlMitarbeiter()) return 0;
                return -1;
            }
        });
        for (Kunde kunde: newKundeList){
            System.out.println(kunde.getId()+" "+kunde.getUnternehmensname()+" "+kunde.getUnternehmensgrosse()+" "+kunde.getAnzahlMitarbeiter()+" "+kunde.getKundeEinkommen()+" "+kunde.getOrt());
        }
    }


}
