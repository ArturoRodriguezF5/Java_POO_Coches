package poo.ejerciciointerfaces;

import java.util.List;

public interface CocheCRUD {

    // Definimos métodos.

    void save(Coche coche);
    List<Coche> verCoches();
    void delete(Coche coche);
}
