package videoconferencia2.parte1;

public class Murcielago implements Mamifero{
    @Override
    public int obtenerNumeroPatas() {
        return 2;
    }

    @Override
    public int obtenerNumeroAlas() {
        return 2;
    }

    @Override
    public int obtenerNumeroAletas() {
        return 0;
    }

    @Override
    public TipoAnimal obtenerTipoAnimal() {
        return TipoAnimal.AREO;
    }

    @Override
    public String obtenerRuido() {
        return "chilla";
    }
}
