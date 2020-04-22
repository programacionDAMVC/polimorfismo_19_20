package interfaces.interfaces3;

public interface Animal {
        TipoAnimal obtenerTipoAnimal();
        String obtenerRuido();

        static String nombreDelaInterfaz(){
            return "Animal";
        }

        default void nombrarAnimal(){
            System.out.printf("Animal, con ruido %s y tipo de animal %s%n", obtenerRuido(), obtenerTipoAnimal().toString());
        }

}
