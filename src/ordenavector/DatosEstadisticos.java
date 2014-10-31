package ordenavector;

class DatosEstadisticos {

    private float execTime;

    public void estableceTiempo(float execTime) {
        this.execTime = execTime;
    }

    public void añadeTiempo(float extraTime) {
        this.execTime += extraTime;
    }

    public float dameTiempo() {
        return execTime;
    }

    public DatosEstadisticos() {
        this.execTime = 0;
    }

}
