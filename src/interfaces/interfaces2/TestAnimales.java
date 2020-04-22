package interfaces.interfaces2;

import java.util.ArrayList;
import java.util.List;

public class TestAnimales {
    public static void main(String[] args) {
        Mamifero murcielago = new Muercielago();
        Mamifero delfin     = new Delfin();
        Mamifero perro      = new Perro();
        List<Mamifero> listaAnimales = new ArrayList<>();
        listaAnimales.add(murcielago);
        listaAnimales.add(delfin);
        listaAnimales.add(perro);
        mostrarAnimales(listaAnimales);
    }

    private static void mostrarAnimales(List<Mamifero> listaAnimales) {
        for (Mamifero animal: listaAnimales ) {
            System.out.printf("Nº patas %d, nº alas %d, nº aletas %d, tipo de animal %s y tipo de sonido %s%n",
                    animal.obtenerNumeroPatas(), animal.obtenerNumeroAlas(), animal.obtenerAletas(),
                    animal.obtenerTipoAnimal().toString(), animal.obtenerRuido());

        }
    }


}
