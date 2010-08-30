package servidor.datos;
public class Piedra {

    private String ID;
    private int num1;
    private int num2;
    private String ImagenArriba;
    private String ImagenDerecha;
    private String ImagenAbajo;
    private String ImagenIzquierda;
    private String ImagenActual;
    private int extremo;
    private String posicion;

    /**
     * getID para obtener el ID de la piedra
     * @return retorna el ID de la piedra
     */
    public String getID() {
        return ID;
    }

    /**
     * setID setea el ID de la piedra
     * @param ID, string con el ID de la piedra
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * getNum1 para obtener uno de los números de la piedra
     * @return un entero, uno de los números de la piedra (num1)
     */
    public int getNum1() {
        return num1;
    }

    /**
     * setNum1 setea el num1 de la piedra
     * @param num1, entero con el num1 de la piedra
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * getNum2 para obtener el otro número de la piedra
     * @return un entero, el otro número de la piedra (num2)
     */
    public int getNum2() {
        return num2;
    }

    /**
     * setNum2 setea el num2 de la piedra
     * @param num2, entero con el num2 de la piedra
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * getImagenAbajo para obtener el nombre de la imagen de la piedra invertida (hacia abajo)
     * @return el string, nombre de la imagen invertida (hacia abajo)
     */
    public String getImagenAbajo() {
        return ImagenAbajo;
    }

    /**
     * setImagenAbajo setea la imagen de la piedra invertida
     * @param ImagenAbajo, String con el nombre de la imagen invertida
     */
    public void setImagenAbajo(String ImagenAbajo) {
        this.ImagenAbajo = ImagenAbajo;
    }

    /**
     * getImagenActual para obtener el nombre de la imagen actual de la piedra
     * @return el string, nombre de la imagen
     */
    public String getImagenActual() {
        return ImagenActual;
    }

    /**
     * setImagenActual setea el nombre de la imagen escogida actual de la piedra
     * @param ImagenActual, String con el nombre de la imagen actual
     */
    public void setImagenActual(String ImagenActual) {
        this.ImagenActual = ImagenActual;
    }

    /**
     * getImagenArriba para obtener el nombre de la imagen por defecto de la piedra
     * @return el string, nombre de la imagen
     */
    public String getImagenArriba() {
        return ImagenArriba;
    }

    /**
     * setImagenArriba setea el nombre de la imagen por defecto de la piedra
     * @param ImagenArriba, String con el nombre de la imagen
     */
    public void setImagenArriba(String ImagenArriba) {
        this.ImagenArriba = ImagenArriba;
    }

    /**
     * getImagenDerecha para obtener el nombre de la imagen de la piedra girada a la derecha
     * @return el string, nombre de la imagen
     */
    public String getImagenDerecha() {
        return ImagenDerecha;
    }

    /**
     * setImagenDerecha setea la imagen de la piedra girada a la derecha
     * @param ImagenDerecha, String con el nombre de la imagen
     */
    public void setImagenDerecha(String ImagenDerecha) {
        this.ImagenDerecha = ImagenDerecha;
    }

    /**
     * getImagenIzquierda para obtener el nombre de la imagen de la piedra girada a la izquierda
     * @return el string, nombre de la imagen
     */
    public String getImagenIzquierda() {
        return ImagenIzquierda;
    }

    /**
     * setImagenImagenIzquierda setea la imagen de la piedra girada a la izquierda
     * @param ImagenIzquierda, String con el nombre de la imagen
     */
    public void setImagenIzquierda(String ImagenIzquierda) {
        this.ImagenIzquierda = ImagenIzquierda;
    }

    /**
     * getExtremo para saber cual de los dos números que conforma la piedra es extremo
     * @return un entero, el número extremo
     */
    public int getExtremo() {
        return extremo;
    }

    /**
     * setExtremo setea el número extremo de una piedra
     * @param extremo, int con el número extremo
     */
    public void setExtremo(int extremo) {
        this.extremo = extremo;
    }

    /**
     * getPosicion para obtener la posición de una piedra
     * @return el string, posición de la piedra
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * setPosicion setea la posición de la piedra
     * @param Posicion, string con la posición de la piedra
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * Constructor
     * @param num1 int para asignar el num1 de la piedra
     * @param num2 int para asignar el num2 de la piedra
     * @param posicion string para asignar apellido
     */
    public Piedra(int num1, int num2, String posicion) {
        this.num1 = num1;
        this.num2 = num2;
        this.posicion = posicion;
    }

    /**
     * Constructor
     * @param num1 int para asignar el num1 de la piedra
     * @param num2 int para asignar el num2 de la piedra
     * @param ImagenArriba string para asignar la imagen por defecto(hacia arriba) de la piedra
     * @param ImagenDerecha string para asignar la imagen girada a la derecha de la piedra
     * @param ImagenAbajo string para asignar la imagen girada hacia abajo de la piedra
     * @param ImagenIzquierda string para asignar la imagen girada hacia la izquierda de la piedra
     * @param ImagenActual string para asignar la imagen actual escogida de la piedra
     * @param posicion string para asignar la posición de la piedra
     * @param extremo int para asignar el extremo de la piedra
     */
    public Piedra(int num1, int num2, String ImagenArriba, String ImagenDerecha, String ImagenAbajo, String ImagenIzquierda, String ImagenActual, String posicion, int extremo) {
        this.num1 = num1;
        this.num2 = num2;
        this.ImagenArriba = ImagenArriba;
        this.ImagenDerecha = ImagenDerecha;
        this.ImagenAbajo = ImagenAbajo;
        this.ImagenIzquierda = ImagenIzquierda;
        this.ImagenActual = ImagenArriba;
        this.posicion = posicion;
        this.extremo = extremo;
    }

    /**
     * Constructor
     * @param num1 int para asignar el num1 de la piedra
     * @param num2 int para asignar el num2 de la piedra
     * @param ImagenArriba string para asignar la imagen por defecto(hacia arriba) de la piedra
     * @param ImagenDerecha string para asignar la imagen girada a la derecha de la piedra
     * @param ImagenAbajo string para asignar la imagen girada hacia abajo de la piedra
     * @param ImagenIzquierda string para asignar la imagen girada hacia la izquierda de la piedra
     */
    public Piedra(String ID, int num1, int num2, String ImagenArriba, String ImagenDerecha, String ImagenAbajo, String ImagenIzquierda) {
        this.ID = ID;
        this.num1 = num1;
        this.num2 = num2;
        this.ImagenArriba = ImagenArriba;
        this.ImagenDerecha = ImagenDerecha;
        this.ImagenAbajo = ImagenAbajo;
        this.ImagenIzquierda = ImagenIzquierda;
        this.ImagenActual = ImagenArriba;
    }

    /**
     * Constructor
     * @param num1 int para asignar el num1 de la piedra
     * @param num2 int para asignar el num2 de la piedra
     */
    public Piedra(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Constructor
     * @param num1 int para asignar el num1 de la piedra
     * @param num2 int para asignar el num2 de la piedra
     * @param ImagenActual string para asignar la imagen actual escogida de la piedra
     * @param posicion string para asignar la posición de la piedra
     */
    public Piedra(int num1, int num2, String ImagenActual, int extremo, String posicion) {
        this.num1 = num1;
        this.num2 = num2;
        this.ImagenActual = ImagenActual;
        this.extremo = extremo;
        this.posicion = posicion;
    }

    /**
     * obtenerCadenaPiedraMaquina Obtiene una cadena con información de una piedra de la máquina
     * @return String con la cadena formada por la piedra, la posición, su imagen por defecto, imagen invertida, imagen izquierda, imagen derecha e imagen actual
     */
    public String obtenerCadenaPiedraMaquina() {
        String cadena = "";

        cadena = getNum1() + "-" + getNum2()
                + ":" + getPosicion()
                + ":" + getImagenArriba() + "-" + getImagenAbajo()
                + "-" + getImagenIzquierda() + "-" + getImagenDerecha()
                + ":" + getImagenActual();
        return cadena;
    }

    /**
     * obtenerCadenaPiedraJugador Obtiene una cadena con información de una piedra del jugador
     * @return String con la cadena formada por el ID de la piedra, el valor de la piedra, su imagen por defecto, imagen invertida, imagen rotada a la izquierda e imagen rotada a la derecha
     */
    public String obtenerCadenaPiedraJugador() {
        String cadena = "";

        cadena = getID() + "-" + getNum1() + "-" + getNum2()
                + "-" + getImagenArriba() + "-" + getImagenAbajo()
                + "-" + getImagenIzquierda()
                + "-" + getImagenDerecha();

        return cadena;
    }
}
