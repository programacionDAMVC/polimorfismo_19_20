package ejercicios.ejercio3;

import javax.swing.*;

public enum TipoTrabajador {
    DIRECTIVO (4_000), ADMINISTRATIVO (2_000), OBRERO (1_500);

    private int sueldoBase;

    TipoTrabajador(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }
}
