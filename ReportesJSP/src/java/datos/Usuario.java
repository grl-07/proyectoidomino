package datos;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 31-Jul-2010 2:44:00 PM
 */
//import java.util.*;
//import com.toedter.calendar.JCalendar;
public class Usuario {

    protected String apellido;
    protected String avatar;
    protected String clave;
    protected String nickname;
    protected String nombre;
    protected String fechaNac;
    protected int numPartidasGan;
    protected int numIngresos;
    protected int numPartCreadas;
    protected int puntaje;
    protected int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaNac(){
        return fechaNac;
    }

    public int getNumPartCreadas() {
        return numPartCreadas;
    }

    public void setNumPartCreadas(int numPartCreadas) {
        this.numPartCreadas = numPartCreadas;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getNumIngresos() {
        return numIngresos;
    }

    public void setNumIngresos(int numIngresos) {
        this.numIngresos = numIngresos;
    }

    public int getNumPartidasGan() {
        return numPartidasGan;
    }

    public void setNumPartidasGan(int numPartidasGan) {
        this.numPartidasGan = numPartidasGan;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String apellido, String fechaNac, String clave, String nickname, String avatar, int numPartidasGan, int numIngresos, int numPartCreadas, int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.avatar = avatar;
        this.clave = clave;
        this.nickname = nickname;
        this.numPartidasGan = numPartidasGan;
        this.numIngresos = numIngresos;
        this.numPartCreadas = numPartCreadas;
        this.puntaje = puntaje;
    }


     public Usuario(String nombre, String apellido, String clave, String nickname, String avatar, String fechaNac) {
        this.apellido = apellido;
        this.avatar = avatar;
        this.clave = clave;
        this.nickname = nickname;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Usuario(String avatar, String nickname, int numPartidasGan, int numIngresos, int numPartCreadas, int puntaje) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.numPartidasGan = numPartidasGan;
        this.numIngresos = numIngresos;
        this.numPartCreadas = numPartCreadas;
        this.puntaje = puntaje;
    }


    public int hashCode()
    {
       int hash = 0;
       hash += (nickname != null ? nickname.hashCode():0);

       return hash;
    }

    public boolean equals(Object objeto)
    {
        Usuario segundoObjeto;

        if (! (objeto instanceof Usuario))
            return false;

        segundoObjeto = (Usuario) objeto;

        //if (this.nombre.equals(segundoObjeto.nombre) && this.apellido.equals(segundoObjeto.apellido) && this.cargo.equals(segundoObjeto.cargo))
        if (this.nickname.hashCode() == segundoObjeto.nickname.hashCode())
        //if (this.nickname.equals(segundoObjeto.getNickname()))
        {
            return true;
        }

        return false;
    }

    /*public void finalize() throws Throwable {
    }*/
}
