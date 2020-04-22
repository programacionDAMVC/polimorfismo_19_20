package interfaces.interfaces2;

public class Perro implements Mamifero {
    @Override
    public int obtenerNumeroPatas() {
        return 4;
    }

    @Override
    public int obtenerNumeroAlas() {
        return 0;
    }

    @Override
    public int obtenerAletas() {
        return 0;
    }

    @Override
    public TipoAnimal obtenerTipoAnimal() {
        return TipoAnimal.TERRESTRE;
    }

    @Override
    public String obtenerRuido() {
        return "Ladra";
    }
}
