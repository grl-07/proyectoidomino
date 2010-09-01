package servidor.logica;

import servidor.datos.Archivo;
import servidor.datos.Usuario;
import servidor.datos.Partida;
import servidor.datos.Mesa;
import servidor.datos.Score;

public class Conector {

    /**
     * comprobarDatos obtiene la lista de usuarios registrados en el sistema de la clase Datos y llama a la función que verifica que el nickname y el password ingresado por el cliente son correctos para darle acceso a la aplicación
     * @param nickname nickname a verificar
     * @param password password a verificar
     * @return true si coinciden los datos, false en caso contrario
     */
    public static boolean comprobarDatos(String nickname, String password) {
        boolean confirm;
        confirm = false;
        confirm = Datos.getListaDeUsuarios().comprobarDatos(nickname, password);
        return confirm;
    }

    /**
     * guardarDatos obtiene la lista de usuarios de la clase Datos y llama al método que agrega un usuario a la lista
     * de usuarios,posteriormente llama a una función para que agregue el usuario al archivo Usuarios.xml
     * @param name nombre ingresado por el usuario
     * @param lastName apellido ingresado por el usuario
     * @param nickname nickname ingresado por el usuario
     * @param password password ingresado por el usuario
     * @param avatar avatar escojido por el usuario
     * @param fechaNac fecha de nacimiento ingresado por el usuario
     */
    public static void guardarDatos(String name, String lastName, String nickname, String password, String avatar, String fechaNac) {
        Datos.getListaDeUsuarios().agregarUsuario(new Usuario(name, lastName, password, nickname, avatar, fechaNac));
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * comprobarNickname obtiene la lista de usuarios y llama a la función que pasado un nickname confirme si el usuario está registrado
     * @param nickname a buscar
     * @return true si el usuario está registrado, false en caso contrario
     */
    public static boolean comprobarNickname(String nickname) {
        Usuario elUsuario = new Usuario("", "", "", nickname, "", "");
        if (Datos.getListaDeUsuarios().buscarNickname(elUsuario) == false) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean llamarCliente(Usuario elUsuario) {
        //ClienteTest.main(args, elUsuario);
        return false;
    }

    /**
     * solicitarCargaDatosPiedras llama al método que cargará la información contenida en el archivo Piedras.xml a la lista de piedras
     */
    public static void solicitarCargaDatosPiedras() {
        Archivo.cargarPiedrasArchivo(Datos.getListaDePiedras());
    }

    /**
     * solicitarCargaDatosUsuario llama al método que cargará la información contenida en el archivo Usuarios.xml a la lista de usuarios
     */
    public static void solicitarCargaDatosUsuario() {
        Archivo.cargarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * solicitarCargaDatosPartidas llama al método que cargará la información contenida en el archivo Partidas.xml a la lista de partidas
     */
    public static void solicitarCargaDatosPartidas() {
        Archivo.cargarPartidasArchivo(Datos.getListaDePartidas());
    }

    public static void solicitarImpresionPartidas() {
        Datos.getListaDePartidas().imprimirPartidas();
    }

    public static void solicitarImpresionPiedras() {
        Datos.getListaDePiedras().imprimirListaPiedras();
    }

    /**
     * Obteniene los datos del Usuario
     * @param nickname es el nickname para buscar los datos del usuario
     * @return Retorna los datos del Usuario
     */
    public static Usuario obtenerDatosDeUsuario(String nickname) {
        Usuario auxiliar = new Usuario("", "", "", "", nickname, "", 0, 0, 0, 0);
        return (Datos.getListaDeUsuarios().buscarDatos(auxiliar));

    }

    /**
     * solicitarGuardarDatosPartidas llama a la función encargada de guardar los datos contenida en la lista partidas
     * en el archivo Partidas.xml
     */
    public static void solicitarGuardarDatosPartidas() {
        Archivo.guardarDatosArchivoPartidas(Datos.getListaDePartidas());
    }

    /**
     * Guarda el numero de ingresos en el usuario y actualiza el archivo de Usuarios con ese numero.
     * @param elUsuario es el Usuario que quiero contarle un nuevo ingreso al sistema
     * @param cont contiene el numero de ingresos y aumenta
     */
    public static void guardarNumIngresos(Usuario elUsuario, int cont) {
        cont++;
        elUsuario.setNumIngresos(cont);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * Guarda el nuevo dato dependiendo de la opcion que se modifico
     * @param registro es el usuario actual para sobreescribir
     * @param elUsuario es el Usuario con el nuevo dato (nombre, apellido, avatar, clave o fechaNac)
     * @param op Es la opcion a modificar (1: Nombre, 2: apellido, 3: clave, 4:avatar, 5: fechaNac)
     */
    public static void guardarNuevoDato(Usuario registro, Usuario elUsuario, String op) {
        if (op.equalsIgnoreCase("1")) {
            registro.setNombre(elUsuario.getNombre());
        } else if (op.equalsIgnoreCase("2")) {
            registro.setApellido(elUsuario.getApellido());
        } else if (op.equalsIgnoreCase("3")) {
            registro.setClave(elUsuario.getClave());
        } else if (op.equalsIgnoreCase("4")) {
            registro.setAvatar(elUsuario.getAvatar());
        }

        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static void guardarNumPartidasCreadas(Usuario elUsuario, int cont) {
        cont++;
        elUsuario.setNumPartCreadas(cont);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * guardarNumPartidasGanadas llama al método necesario para incrementar en 1 las partidas ganadas
     * @param elUsuario, el usuario al cual se le va a incrementar las partidas ganadas
     * @param partidasGanadas número de partidas ganadas que tiene el usuario hasta el momento
     */
    public static void guardarNumPartidasGanadas(Usuario elUsuario, int partidasGanadas) {
        partidasGanadas++;
        elUsuario.setNumPartidasGan(partidasGanadas);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * guardarNuevoPuntaje llama al método necesario para ajustar el puntaje cuando el usuario gana una partida
     * @param elUsuario, el usuario al cual se le va a ajustar el puntaje
     */
    public static void guardarNuevoPuntaje(Usuario elUsuario) {
        Score elScore = new Score();
        int puntaje = elScore.ajustarPuntaje(elUsuario);
        elUsuario.setPuntaje(puntaje);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * solicitarGuardarPartidaEnLista llama al método encargado de guardar una partida en la lista partidas
     * @param nickname, usuario al cual se le va a guardar la partida
     * @return true si se guardó la partida, false en caso contrario
     */
    public static boolean solicitarGuardarPartidaEnLista(String nickname) {
        Mesa laMesa = new Mesa();
        Usuario elUsuario = new Usuario("", "", "", "", nickname, "", 0, 0, 0, 0);

        Partida partidaExistente = Datos.obtenerPartidaExistente(nickname);
        partidaExistente.getElJuego().getLaMesa().setPiedrasMesa(laMesa.pasarMatrizPiedrasMesaALista(Datos.getMatrizPiedrasMesa()));

        return (Datos.guardarPartidaEnLista(partidaExistente, elUsuario));
    }
}
