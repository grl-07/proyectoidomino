/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberly
 */
public class Alumno {
private String nombre;
private String apellido;

public Alumno()  //constructor, se inicializan los atributos de la clase. Siempre se llama igual que la clase. No devuelve nada.
{
    nombre = "Daniel";
    apellido = "Sierra";
}

public void funcion()
{
    System.out.println("El nombre es " + nombre + " El apellido es " + apellido);
}

}
