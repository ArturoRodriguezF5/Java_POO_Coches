package poo.ejerciciointerfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Creamos un objeto de tipo CocheCRUD
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        //Creamos una List para guardar los coches.
        List<Coche> coches = new ArrayList<>();

        // Instanciamos y creamos un objeto de tipo Coche.
        Coche coche1 =  new Coche("Honda", "Civic", "Negro", 2023);
        Coche coche2 =  new Coche("VolksWagen", "Jetta", "Negro", 2023);
        Coche coche3 =  new Coche("Ford", "Escape", "Negro", 2023);

        // Usamos los métodos del objeto.
        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);
        cocheCRUD.save(coche3);
        coches = cocheCRUD.verCoches();
        System.out.println(coches);
        // Borramos coche3
        cocheCRUD.delete(coche3);
        coches = cocheCRUD.verCoches();
        System.out.println(coches);
    }
}
