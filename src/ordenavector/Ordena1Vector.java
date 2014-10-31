package ordenavector;

import java.util.Arrays;


public class Ordena1Vector implements OrdenarVector {

    @Override
    public String nombreMetodo() {
        return null;
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        Arrays.sort(v);
    }

}
