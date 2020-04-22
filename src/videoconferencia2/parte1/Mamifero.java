package videoconferencia2.parte1;

public interface Mamifero extends Animal {
    int obtenerNumeroPatas();
    int obtenerNumeroAlas();
    int obtenerNumeroAletas();

    // a partir java 1.8 se permiten implementar métodos, pero deben ser default, static
    default void mostrarDatosAnimales() {
        System.out.printf("Tipo animal %s, tipo sonido %s, nº patas %d, nº alas %d y nº aletas %d%n",
                obtenerTipoAnimal(), obtenerRuido(),obtenerNumeroPatas(), obtenerNumeroAlas(),obtenerNumeroAletas());
    }
}
