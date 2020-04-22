package videoconferencia2.parte1;

import java.util.ArrayList;
import java.util.List;

public class TestAnimales {
    public static void main(String[] args) {
        Mamifero perro = new Perro();
        Mamifero delfin = new Delfin();
        Mamifero murcielago = new Murcielago();
        List<Mamifero> listaAnimales = new ArrayList<>();
        listaAnimales.add(perro);
        listaAnimales.add(murcielago);
        listaAnimales.add(delfin);
        mostrarDatos(listaAnimales);
       // Mamifero mamifero = new Mamifero(); no se puede crear objetos de interfaces o clases abstractas
    }

    private static void mostrarDatos(List<Mamifero> listaAnimales) {
       /* for (Mamifero animal: listaAnimales) {
            System.out.printf("Tipo animal %s, tipo sonido %s, nº patas %d, nº alas %d y nº aletas %d%n",
                    animal.obtenerTipoAnimal(), animal.obtenerRuido(),
                    animal.obtenerNumeroPatas(), animal.obtenerNumeroAlas(),animal.obtenerNumeroAletas());
        }*/
       /* for (Mamifero animal: listaAnimales) {
            animal.mostrarDatosAnimales();
        }*/
       listaAnimales.forEach(Mamifero::mostrarDatosAnimales);
    }
}
