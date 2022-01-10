package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository {

    public FileRepository() {
    }

    public List<Kunde> getAllKunden() {
        List<Kunde> kundeList = new ArrayList<>();
        try {

            File file = new File("kundendaten.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                Kunde kunde=new Kunde();
                String data = myReader.nextLine();
                String word= "";
                int counter=0;
                for (int i=0;i<data.length();i++) {
                    if (data.charAt(i) == ',') {
                        if (counter == 0) kunde.setId(Integer.parseInt(word));
                        else if (counter == 1) kunde.setUnternehmensname(word);
                        else if (counter == 2) kunde.setUnternehmensgrosse(word);
                        else if (counter == 3) kunde.setAnzahlMitarbeiter(Integer.parseInt(word));
                        else kunde.setKundeEinkommen(Integer.parseInt(word));
                        word = "";
                        counter += 1;
                    } else word += data.charAt(i);
                }
                kunde.setOrt(word);
                kundeList.add(kunde);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return kundeList;
    }

    public void writeSortierteKunden(List<Kunde> kundeList){
        try {
            FileWriter writer = new FileWriter("kundensortiert.txt");
            for (Kunde kunde: kundeList){
                writer.write(kunde.getId()+","+kunde.getUnternehmensname()+','+kunde.getUnternehmensgrosse()+','+kunde.getAnzahlMitarbeiter()+','+kunde.getKundeEinkommen()+','+kunde.getOrt());
                writer.write('\n');
            }
            writer.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeTopDerOrte(List<OrtEinkommen> orte){
        try {
            FileWriter writer = new FileWriter("statistik.txt");
            for (OrtEinkommen ort: orte){
                writer.write(ort.getOrt()+" "+ort.getEinkommen());
                writer.write('\n');
            }
            writer.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
