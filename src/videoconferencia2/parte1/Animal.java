package videoconferencia2.parte1;

public interface Animal {
    TipoAnimal obtenerTipoAnimal();
    String obtenerRuido();

   /* default void mostrarDatosAnimales() {
        System.out.printf("Tipo animal %s, tipo sonido %s, nº patas %d, nº alas %d y nº aletas %d%n",
                obtenerTipoAnimal(), obtenerRuido(),obtenerNumeroPatas(), obtenerNumeroAlas(),obtenerNumeroAletas());
    } * No viable pues quien hereda es el hijo del padre, nunca al revés */
}
