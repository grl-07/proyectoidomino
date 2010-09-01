package servidor.datos;
public class Score {

    private int puntaje;

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
   /* public float getPuntaje() {
        return puntaje;
    }*/

    /**
     * setPuntaje establece el puntaje del usuario
     * @param puntaje, entero para asignar el puntaje
     */
    /*public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }*/



    /**
     * Constructor
     */
    public Score() {
    }

    /**
     * ajustarPuntaje para ajustar el puntaje del usuario cuando gana una partida
     * @param elUsuario es el usuario al cual se le va a ajustar el puntaje
     */
    public int ajustarPuntaje(Usuario elUsuario) {
        puntaje = elUsuario.getPuntaje();
        /*puntaje = puntaje + 10;*/
        ProcesarProperties.inicializarProcesarProperties();
        puntaje = puntaje +  ProcesarProperties.leerPropiedad();
return puntaje;
    }
}
