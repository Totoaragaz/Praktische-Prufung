package com.company;

import java.io.File;
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
        FileRepository fileRepository=new FileRepository();
        fileRepository.writeSortierteKunden(newKundeList);
    }

    public void topDerOrteStatistik(){
        List<OrtEinkommen> ortList=new ArrayList<>();
        boolean ortFound;
        for (Kunde kunde: kundeList){
            ortFound=false;
            for (int i=0;i<ortList.size();i++){
                if (ortList.get(i).getOrt().equals(kunde.getOrt())){
                    ortFound=true;
                    ortList.get(i).increaseEinkommen(kunde.getKundeEinkommen());
                }
            }
            if (!ortFound){
                ortList.add(new OrtEinkommen(kunde.getOrt(), kunde.getKundeEinkommen()));
            }
        }
        Collections.sort(ortList, new Comparator<OrtEinkommen>() {
            @Override
            public int compare(OrtEinkommen o1, OrtEinkommen o2) {
                if (o1.getEinkommen()<o2.getEinkommen()) return 1;
                else if (o1.getEinkommen()==o2.getEinkommen()) return 0;
                return -1;
            }
        });
        FileRepository fileRepository=new FileRepository();
        fileRepository.writeTopDerOrte(ortList);
    }


}
