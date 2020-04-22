package videoconferencia2.parte1;

public class Delfin implements Mamifero {
    @Override
    public int obtenerNumeroPatas() {
        return 0;
    }

    @Override
    public int obtenerNumeroAlas() {
        return 0;
    }

    @Override
    public int obtenerNumeroAletas() {
        return 3;
    }

    @Override
    public TipoAnimal obtenerTipoAnimal() {
        return TipoAnimal.ACUATICO;
    }

    @Override
    public String obtenerRuido() {
        return "chilla";
    }
}
