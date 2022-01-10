package Repository;

import model.Produkte;

import java.util.Objects;

public class ProdukteRepository extends InMemoryRepository<Produkte> {

    public ProdukteRepository(){ super(); }

    @Override
    public Produkte update(Produkte obj){
        Produkte produktToUpdate = this.repoList.stream()
                .filter(produkt -> Objects.equals(produkt.getName(), obj.getName()))
                .findFirst()
                .orElseThrow();

        produktToUpdate.setPreis(obj.getPreis());
        return produktToUpdate;
    }

}
