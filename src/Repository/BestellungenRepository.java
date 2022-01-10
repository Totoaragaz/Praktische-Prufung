package Repository;

import model.Bestellungen;
import model.Produkte;

import java.util.Objects;

public class BestellungenRepository extends InMemoryRepository<Bestellungen>{

    public BestellungenRepository(){ super(); }

    @Override
    public Bestellungen update(Bestellungen obj){
        Bestellungen bestellungToUpdate = this.repoList.stream()
                .filter(bestellung -> Objects.equals(bestellung.getBestellnr(), obj.getBestellnr()))
                .findFirst()
                .orElseThrow();

        bestellungToUpdate.setAdresse(obj.getAdresse());
        bestellungToUpdate.setProdukte(obj.getProdukte());
        return bestellungToUpdate;
    }
}
