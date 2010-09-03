package servidor.datos;

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

    /**
     * set fechaNac establece la fecha de nacimiento
     * @param fechaNac string con la fecha de nacimiento
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * get fechaNac para saber cual es la fecha de nacimiento
     * @return retorna el valo de fecha de nacimiento
     */
    public String getFechaNac(){
        return fechaNac;
    }

    /**
     * getNumPartCreadas para saber cual es el numero de las partidas creadas
     * @return
     */
    public int getNumPartCreadas() {
        return numPartCreadas;
    }

    /**
     * setNumPartCreadas establece el numero de partidas creadas
     * @param numPartCreadas entero para asignar el numero de partidas creadas
     */
    public void setNumPartCreadas(int numPartCreadas) {
        this.numPartCreadas = numPartCreadas;
    }

  

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }




    /**
     * setPuntaje establece el puntaje del usuario
     * @param puntaje entero para asignar el puntaje
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public int getNumIngresos() {
        return numIngresos;
    }

    /**
     * setNumIngresos establece el numero de ingresos a la aplicacion
     * @param numIngresos entero para asignar el numero de ingresos
     */
    public void setNumIngresos(int numIngresos) {
        this.numIngresos = numIngresos;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public int getNumPartidasGan() {
        return numPartidasGan;
    }

    /**
     * setNumPartidasGan estable el numero de partidas ganadas
     * @param numPartidasGan entero para asignar el numero de las partidas ganadas
     */
    public void setNumPartidasGan(int numPartidasGan) {
        this.numPartidasGan = numPartidasGan;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * setApellido estable el apellido del usuario
     * @param apellido string para asignar el apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * setAvatar establece el avatar del usuario
     * @param avatar string para asignar el avatar asociado al usuario
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public String getClave() {
        return clave;
    }

    /**
     * setClave establece la clave el usuario
     * @param clave string para asignar la clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * getPuntaje para saber el valor del puntaje del usuario
     * @return un entero con el puntaje
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * setNickname establece el nickname del usuario
     * @param nickname string para asignar el nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * getNombre para saber el nombre del usuario
     * @return un string con el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre establece el nombre del usuario
     * @param nombre string para asignar el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor
     * @param nombre string para asignar nombre
     * @param apellido string para asignar apellido
     * @param fechaNac string para asignar la fecha de nacimiento
     * @param clave string para asignar la clave
     * @param nickname string para asignar el nickname
     * @param avatar string para asignar el avatar
     * @param numPartidasGan entero para asignar el numero de partidas ganadas
     * @param numIngresos entero para asignar el numero de ingresos
     * @param numPartCreadas entero para asignar el numero de partidas creadas
     * @param puntaje entero para asignar el puntaje
     */
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


    /**
     *
     * @param nombre string para asignar nombre
     * @param apellido string para asignar apellido
     * @param clave string para asignar la clave
     * @param nickname string para asignar el nickname
     * @param avatar string para asignar el avatar
     * @param fechaNac string para asignar la fecha de nacimiento
     */
     public Usuario(String nombre, String apellido, String clave, String nickname, String avatar, String fechaNac) {
        this.apellido = apellido;
        this.avatar = avatar;
        this.clave = clave;
        this.nickname = nickname;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

     /**
      *
      * @param avatar string para asignar el avatar
      * @param nickname string para asignar el nickname
      * @param numPartidasGan entero para asignar el numero de partidas ganadas
      * @param numIngresos entero para asignar el numero de ingresos
      * @param numPartCreadas entero para asignar el numero de partidas creadas
      * @param puntaje entero para asignar el puntaje
      */
    public Usuario(String avatar, String nickname, int numPartidasGan, int numIngresos, int numPartCreadas, int puntaje) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.numPartidasGan = numPartidasGan;
        this.numIngresos = numIngresos;
        this.numPartCreadas = numPartCreadas;
        this.puntaje = puntaje;
    }


    /**
     * modificado el hash code para comparar por nickname
     * @return el hash
     */
    public int hashCode()
    {
       int hash = 0;
       hash += (nickname != null ? nickname.hashCode():0);

       return hash;
    }

    /**
     * equals modificado para que compare por nickname
     * @param objeto tipo object para que sea mas general
     * @return true o false, dependiendo si encontro o no el elemento
     */
    public boolean equals(Object objeto)
    {
        Usuario segundoObjeto;

        if (! (objeto instanceof Usuario))
            return false;

        segundoObjeto = (Usuario) objeto;

        if (this.nickname.hashCode() == segundoObjeto.nickname.hashCode())  {
            return true;
        }

        return false;
    }

}
