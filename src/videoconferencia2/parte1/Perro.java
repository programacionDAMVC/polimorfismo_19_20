package videoconferencia2.parte1;

public class Perro implements Mamifero{
    @Override
    public int obtenerNumeroPatas() {
        return 4;
    }

    @Override
    public int obtenerNumeroAlas() {
        return 0;
    }
    @Override

    public int obtenerNumeroAletas() {
        return 0;
    }

    @Override
    public TipoAnimal obtenerTipoAnimal() {
        return TipoAnimal.TERRESTRE;
    }

    @Override
    public String obtenerRuido() {
        return "ladra";
    }
    public String obtenerRaza() {
        return "Raza";
    }

    @Override
    public void mostrarDatosAnimales() {
        System.out.printf("Tipo animal %s, tipo sonido %s, nº patas %d, nº alas %d , nº aletas %d y raza %s%n",
                obtenerTipoAnimal(), obtenerRuido(),obtenerNumeroPatas(), obtenerNumeroAlas(),obtenerNumeroAletas(), obtenerRaza());
    }
}
