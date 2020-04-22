package interfaces.interfaces3;

public interface Mamifero extends Animal {

    int obtenerNumeroPatas();
    int obtenerNumeroAlas();
    int obtenerAletas();

    @Override
    default void nombrarAnimal() {
        System.out.printf("Mamífero, con nº patas %d, con nº alas %d, con %d aletas, con ruido %s y tipo de animal %s%n",
                obtenerNumeroPatas(), obtenerNumeroAlas(), obtenerAletas(), obtenerRuido(), obtenerTipoAnimal().toString());
    }
    static String nombreDelaInterfaz(){
        return "Mamífero";
    }

}
