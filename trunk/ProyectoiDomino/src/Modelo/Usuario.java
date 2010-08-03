package Modelo;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 31-Jul-2010 2:44:00 PM
 */
public class Usuario {

	protected String apellido;
	protected String avatar;
	protected String clave;
	protected String nickname;
	protected String nombre;
        protected int numPartidasGan;
        protected int numIngresos;
        //protected Score puntaje;
	//protected JCalendar fechaNac;
        //public Score m_Score;

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

        public Usuario(String nombre,String apellido,String clave,String nickname,String avatar, int numPartidasGan,int numIngresos){
            this.nombre = nombre;
            this.apellido = apellido;
            this.avatar = avatar;
            this.clave = clave;
            this.nickname = nickname;
            this.numPartidasGan = numPartidasGan;
            this.numIngresos = numIngresos;
	}
	/*public void finalize() throws Throwable {

	}*/

}