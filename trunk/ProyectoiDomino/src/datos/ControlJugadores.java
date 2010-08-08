/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Alberly
 */
public class ControlJugadores {

    private boolean estado;
    private boolean pass;
    private ListaPiedras piedrasEnMano;

    public ListaPiedras getPiedrasEnMano() {
        return piedrasEnMano;
    }

    public void setPiedrasEnMano(ListaPiedras PiedrasEnMano) {
        this.piedrasEnMano = PiedrasEnMano;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    //Constructor
    public ControlJugadores() {
        pass = false;
        estado = false;
        piedrasEnMano = new ListaPiedras();
        /*this.estado = estado;
        this.pass = pass;
        this.PiedrasEnMano = PiedrasEnMano;*/
    }

    /*public void finalize() throws Throwable {

    }*/
    public boolean cambiarEstado() {
        return false;
    }

    public boolean pasarTurno() {
        return false;
    }

    /**
     *
     * @param laMesa
     * @param laPiedra
     */
/*    public boolean ponerPieza(Mesa laMesa, Piedra laPiedra) {

        ListaPiedras listaMesa;
        listaMesa = new ListaPiedras();

        boolean confirm;
        confirm = laMesa.aprobarPiedra(laPiedra);

        if (confirm==true){
            listaMesa.agregarPiedra(laPiedra);  //PROVICIONAL, IMPLEMENTAR EL AGREGAR AL PRINCIPIO O FINAL DE LA LISTA
            return true;
        }
        else{
            System.out.println("La piedra que intenta jugar no es válida");
            return false;
        }
    }*/

    /**
     *
     * @param laMesa
     */
    public Piedra tomarDelPozo(Mesa laMesa) {
        return null;
    }



/*    public boolean jugarPiedra(){


        
        Mesa laMesa;
        laMesa = new Mesa();

           try {


                System.out.println("Ingrese num1 de ficha: ");
            String numero1=br.readLine();
            int num1 = Integer.parseInt(numero1);

        System.out.println("Ingrese num2 de ficha: ");
        String numero2=br.readLine();
        int num2 = Integer.parseInt(numero2);

        ponerPieza(laMesa.getPiedrasMesa(), new Piedra(num1,num2));


            } catch (Exception e) {
            }
        }
        listadoUsuarios.mostrarUsuario();




    }*/

}
