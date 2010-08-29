/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.PrintWriter;
import logica.Comunicacion;

/**
 *
 * @author Sheryl
 */
import java.util.*;

public class ListaReportes {

    private List<Usuario> listaOrdenIn;
    private List<Usuario> listaOrdenPartGan;
    private List<Usuario> listaOrdenMayorScore;
    private List<Usuario> listaOrdenCreadas;

    public ListaReportes() {
        listaOrdenIn = new ArrayList();
        listaOrdenPartGan = new ArrayList();
        listaOrdenMayorScore = new ArrayList();
        listaOrdenCreadas = new ArrayList();
    }

    /**
     * agregar Usuario agrega en listas diferentes dependiendo del caso
     * @param elUsuario objeto tipo usuario que tiene toda la informacion del mismo
     * @param i la opcion para agregar en cada una de las 4 listas
     * @return retorna true si agrega
     */
    public boolean agregarUsuario(Usuario elUsuario, int i) {
        switch (i) {
            case 1:
                listaOrdenIn.add(elUsuario);
                Collections.sort(listaOrdenIn, new ComparadorIngresos());
                break;
            case 2:
                listaOrdenCreadas.add(elUsuario);
                Collections.sort(listaOrdenCreadas, new ComparadorPartCreadas());
                break;
            case 3:
                listaOrdenPartGan.add(elUsuario);
                Collections.sort(listaOrdenPartGan, new ComparadorGanadas());
                break;
            case 4:
                listaOrdenMayorScore.add(elUsuario);
                Collections.sort(listaOrdenMayorScore, new ComparadorMayorScore());
        }
        
        return (true);
    }

    /**
     * getIterator1 es el iterador del tipo lista por orden de ingresos
     * @return el iterador de la lista
     */
    public Iterator getIterator1(){
        return listaOrdenIn.iterator();
    }

    /**
     * getIterator2 es el iterador del tipo lista por orden de partidas creadas
     * @return el iterador de la lista
     */
    public Iterator getIterator2(){
        return listaOrdenCreadas.iterator();
    }

    /**
     * getIterator3 es el iterador del tipo lista por orden de partidas ganadas
     * @return el iterador de la lista
     */
    public Iterator getIterator3(){
        return listaOrdenPartGan.iterator();
    }

    /**
     * getIterator4 es el iterador del tipo lista por orden de usuario con mayor score
     * @return el iterador de la lista
     */
    public Iterator getIterator4(){
        return listaOrdenMayorScore.iterator();
    }

    /**
     * obtengo el get de lista orden de ingresos
     * @return
     */
    public List<Usuario> getListaOrdenIn() {
        return listaOrdenIn;
    }

    /**
     * set de lista de orden de ingresos
     * @param listaOrdenIn2
     */
    public void setListaOrdenIn(List<Usuario> listaOrdenIn2) {
        this.listaOrdenIn = listaOrdenIn2;
    }

    /**
     * obtengo el get de lista orden de partidas creadas
     * @return
     */
    public List<Usuario> getListaOrdenCreadas() {
        return listaOrdenCreadas;
    }

    /**
     * set de lista orden de partidas creadas
     * @param listaOrdenCreadas
     */
    public void setListaOrdenCreadas(List<Usuario> listaOrdenCreadas) {
        this.listaOrdenCreadas = listaOrdenCreadas;
    }

    /**
     * obtengo el get de lista orden de usuario con mayor score
     * @return
     */
    public List<Usuario> getListaOrdenMayorScore() {
        return listaOrdenMayorScore;
    }

    /**
     * set de lista de orden de usuarios con mayor score
     * @param listaOrdenMayorScore
     */
    public void setListaOrdenMayorScore(List<Usuario> listaOrdenMayorScore) {
        this.listaOrdenMayorScore = listaOrdenMayorScore;
    }

    /**
     * obtengo el get de lista orden de partidas ganadas
     * @return
     */
    public List<Usuario> getListaOrdenPartGan() {
        return listaOrdenPartGan;
    }

    /**
     * set de lista orden de partidas ganadas
     * @param listaOrdenPartGan
     */
    public void setListaOrdenPartGan(List<Usuario> listaOrdenPartGan) {
        this.listaOrdenPartGan = listaOrdenPartGan;
    }


    /**
     * imprimir coleccion JSP imprime en la pag HTML los datos de los usuarios ordenados 
     * @param out objeto del tipo printwriter, para escribir en la pag HTML
     */
    public void imprimirColeccionJSP(PrintWriter out)
    {
        int i;
        Usuario registro;
        Object [] arreglo;

        arreglo = listaOrdenIn.toArray();
        Comunicacion.solicitarGuardadoDeDatos();

        /**** IMPRIME POR ORDEN DE INGRESOS****/
        out.println("<h1><marquee>DATOS POR ORDEN INGRESO</marquee></h1>");
        out.println("<br><br>");

        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Usuario) arreglo[i];
            out.println("<h3><p align=center><font color=red>NUMERO DE INGRESOS: " + registro.getNumIngresos() + "</h3></font></p>");
            out.println("<h3><p align=center>Nombre: " + registro.getNombre() + "</h3></p></p>");
            out.println("<h3><p align=center>Apellido: " + registro.getApellido() + "</h3></p>");
            out.println("<h3><p align=center>Nickname: " + registro.getNickname() + "</h3></p>");
            out.println("<h3><p align=center>Fecha Nacimiento: " + registro.getFechaNac() + "</h3></p>");
            out.println("<h3><p align=center>Avatar: " + registro.getAvatar() + "</h3></p>");
            out.println("<br>");
        }

        /******************************************************************************************/
        /**** IMPRIME POR ORDEN DE PARTIDAS CREADAS ****/
        out.println("<hr>");
        out.println("<h1><marquee>DATOS POR ORDEN PARTIDAS CREADAS</marquee></h1>");
        out.println("<br><br>");

        arreglo = listaOrdenCreadas.toArray();
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Usuario) arreglo[i];
            out.println("<h3><p align=center><font color=red>PARTIDAS CREADAS: " + registro.getNumPartCreadas() + "</h3></font></p>");
            out.println("<h3><p align=center>Nombre: " + registro.getNombre() + "</h3></p>");
            out.println("<h3><p align=center>Apellido: " + registro.getApellido() + "</h3></p>");
            out.println("<h3><p align=center>Nickname: " + registro.getNickname() + "</h3></p>");
            out.println("<h3><p align=center>Fecha Nacimiento: " + registro.getFechaNac() + "</h3></p>");
            out.println("<h3><p align=center>Avatar: " + registro.getAvatar() + "</h3></p>");
            out.println("<br>");
        }

        /******************************************************************************************/
        /**** IMPRIME POR ORDEN DE PARTIDAS GANADAS ****/
        out.println("<hr>");
        out.println("<h1><marquee>DATOS POR ORDEN PARTIDAS GANADAS</marquee></h1>");
        out.println("<br><br>");

        arreglo = listaOrdenPartGan.toArray();
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Usuario) arreglo[i];
            out.println("<h3><p align=center><font color=red>PARTIDAS GANADAS: " + registro.getNumPartidasGan() + "</h3></font></p>");
            out.println("<h3><p align=center>Nombre: " + registro.getNombre() + "</h3></p>");
            out.println("<h3><p align=center>Apellido: " + registro.getApellido() + "</h3></p>");
            out.println("<h3><p align=center>Nickname: " + registro.getNickname() + "</h3></p>");
            out.println("<h3><p align=center>Fecha Nacimiento: " + registro.getFechaNac() + "</h3></p>");
            out.println("<h3><p align=center>Avatar: " + registro.getAvatar() + "</h3></p>");
            out.println("<br>");
        }

        /******************************************************************************************/
        /**** IMPRIME POR ORDEN DE MAYOR SCORE ****/
        out.println("<hr>");
        out.println("<h1><marquee>DATOS POR ORDEN MAYOR SCORE</marquee></h1>");
        out.println("<br><br>");

        int cont = 0;
        arreglo = listaOrdenMayorScore.toArray();
        Usuario auxiliar = (Usuario) arreglo[arreglo.length-1];
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Usuario) arreglo[i];
            if (auxiliar.getPuntaje() == registro.getPuntaje()) {
                out.println("<h3><p align=center><font color=red>MAYOR SCORE: " + registro.getPuntaje() + "</h3></font></p>");
                out.println("<h3><p align=center>Nombre: " + registro.getNombre() + "</h3></p>");
                out.println("<h3><p align=center>Apellido: " + registro.getApellido() + "</h3></p>");
                out.println("<h3><p align=center>Nickname: " + registro.getNickname() + "</h3></p>");
                out.println("<h3><p align=center>Fecha Nacimiento: " + registro.getFechaNac() + "</h3></p>");
                out.println("<h3><p align=center>Avatar: " + registro.getAvatar() + "</h3></p>");
                out.println("<br>");
                cont++;
            }
        }

        if (cont > 1) {
            out.println("<br>");
            out.println("<h3><p align=center>Hay " + cont + " usuarios con el MAYOR SCORE</h3></p>");
        }

        System.out.println("\n\n");
    }

}
