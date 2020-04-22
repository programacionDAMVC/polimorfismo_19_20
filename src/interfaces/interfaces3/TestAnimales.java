package interfaces.interfaces3;



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
        System.out.println(Animal.nombreDelaInterfaz());
        System.out.println(Mamifero.nombreDelaInterfaz());

    }

    private static void mostrarAnimales(List<Mamifero> listaAnimales) {
     /*   for (Mamifero mamifero: listaAnimales) {
            mamifero.nombrarAnimal();
        }*/
        listaAnimales.forEach(Mamifero::nombrarAnimal);
    }
}
