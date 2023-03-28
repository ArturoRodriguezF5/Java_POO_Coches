package poo.ejerciciointerfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    // Creamos una estructura de datos List, para guardar los elementos.
    List<Coche> coches = new ArrayList<Coche>();
    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> verCoches() {
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }
}
