/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

/**
 *
 * @author Alberly
 */
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getImagenAbajo() {
        return ImagenAbajo;
    }

    public void setImagenAbajo(String ImagenAbajo) {
        this.ImagenAbajo = ImagenAbajo;
    }

    public String getImagenActual() {
        return ImagenActual;
    }

    public void setImagenActual(String ImagenActual) {
        this.ImagenActual = ImagenActual;
    }

    public String getImagenArriba() {
        return ImagenArriba;
    }

    public void setImagenArriba(String ImagenArriba) {
        this.ImagenArriba = ImagenArriba;
    }

    public String getImagenDerecha() {
        return ImagenDerecha;
    }

    public void setImagenDerecha(String ImagenDerecha) {
        this.ImagenDerecha = ImagenDerecha;
    }

    public String getImagenIzquierda() {
        return ImagenIzquierda;
    }

    public void setImagenIzquierda(String ImagenIzquierda) {
        this.ImagenIzquierda = ImagenIzquierda;
    }

    public int getExtremo() {
        return extremo;
    }

    public void setExtremo(int extremo) {
        this.extremo = extremo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    //Constructor
    public Piedra(int num1, int num2, String posicion) {
        this.num1 = num1;
        this.num2 = num2;
        this.posicion = posicion;
    }

    public Piedra(int num1, int num2, String ImagenArriba, String ImagenDerecha, String ImagenAbajo, String ImagenIzquierda, String ImagenActual, String posicion,int extremo) {
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

    public Piedra(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Piedra(int num1, int num2, String ImagenActual, int extremo, String posicion) {
        this.num1 = num1;
        this.num2 = num2;
        this.ImagenActual = ImagenActual;
        this.extremo = extremo;
        this.posicion = posicion;
    }



    public String obtenerCadenaPiedra() {
        String cadena = "";

        cadena = getNum1() + "-" + getNum2()
                + ":" + getPosicion()
                + ":" + getImagenArriba() + "-" + getImagenAbajo()
                + "-" + getImagenIzquierda() + "-" + getImagenDerecha()
                + ":" + getImagenActual();

        return cadena;
    }

    /*public void finalize() throws Throwable {

    }*/
}
