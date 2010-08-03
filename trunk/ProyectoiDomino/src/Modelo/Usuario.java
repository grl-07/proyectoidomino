package Modelo;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 31-Jul-2010 2:44:00 PM
 */
//import java.util.*;
import com.toedter.calendar.JCalendar;
public class Usuario {

    protected String apellido;
    protected String avatar;
    protected String clave;
    protected String nickname;
    protected String nombre;
    protected int numPartidasGan;
    protected int numIngresos;
    protected int puntaje;
    protected JCalendar fechaNac;

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

    public Usuario(String nombre, String apellido, String clave, String nickname, String avatar, int numPartidasGan, int numIngresos, int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.avatar = avatar;
        this.clave = clave;
        this.nickname = nickname;
        this.numPartidasGan = numPartidasGan;
        this.numIngresos = numIngresos;
        this.puntaje = puntaje;
    }

    public void finalize() throws Throwable {
    }
}