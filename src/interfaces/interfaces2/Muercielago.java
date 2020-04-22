package interfaces.interfaces2;

public class Muercielago implements Mamifero {
    @Override
    public int obtenerNumeroPatas() {
        return 2;
    }

    @Override
    public int obtenerNumeroAlas() {
        return 2;
    }

    @Override
    public int obtenerAletas() {
        return 0;
    }

    @Override
    public TipoAnimal obtenerTipoAnimal() {
        return TipoAnimal.AREO;
    }

    @Override
    public String obtenerRuido() {
        return "Canta";
    }
}
