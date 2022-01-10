package Repository;


import model.Bestellungen;
import model.Produkte;

public class Kontroller {
    private ProdukteRepository produkteRepository;
    private BestellungenRepository bestellungenRepository;

    public Kontroller(){
        produkteRepository=new ProdukteRepository();
        bestellungenRepository=new BestellungenRepository();
    }

    public void addProdukt(String name, int preis){
        produkteRepository.create(new Produkte(name,preis));
    }

    public void printProdukte(){
        for (Produkte produkt: produkteRepository.getAll()){
            System.out.println(produkt);
        }
    }

    public void deleteProdukt(String name){
        for (Produkte produkt: produkteRepository.getAll()){
            if (produkt.getName().equals(name)){
                produkteRepository.delete(produkt);
                break;
            }
        }
    }

    public void updateProdukt(String name,int preis){

    }


    public void printBestellungen(){
        for (Produkte produkt: produkteRepository.getAll()){
            System.out.println(produkt);
        }
    }


}
