package ordenavector;

import java.util.Arrays;

public class Ordena1Vector implements OrdenarVector {

    @Override
    public String nombreMetodo() {
        return "ordena";
    }

    public void ordena(int[] v, DatosEstadisticos de) {
        float startTime = System.currentTimeMillis();
        Arrays.sort(v);
        float endTime = System.currentTimeMillis();
        de.estableceTiempo(startTime - endTime);
    }

}
