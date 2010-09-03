package servidor.datos;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import java.util.*;

public class Archivo {

    private static String direccionUsuarios = "src/servidor/datos/Usuarios.xml";
    private static String direccionPiedras = "src/servidor/datos/Piedras.xml";
    private static String direccionPartidas = "src/servidor/datos/Partidas.xml";

    /**
     * guardarDatosArchivoUsuario guarda en el archivo la lista de usuarios
     * @param listaUsuarios
     */
    public static void guardarDatosArchivoUsuario(ListaUsuarios listaUsuarios) {
        Usuario nodoAuxiliar;

        Element root = new Element("Usuarios");

        Iterator iterador = listaUsuarios.getIterator();

        while (iterador.hasNext()) {
            Element usuario = new Element("Usuario");

            nodoAuxiliar = (Usuario) iterador.next();

            Element nombre = new Element("nombre");
            Element apellido = new Element("apellido");
            Element fechaNac = new Element("fechaNac");
            Element nickname = new Element("nickname");
            Element clave = new Element("clave");
            Element avatar = new Element("avatar");
            Element numPartidasGanadas = new Element("numPartGan");
            Element numIngresos = new Element("numIngresos");
            Element numPartidasCreadas = new Element("numPartCreadas");
            Element puntaje = new Element("puntaje");

            String numGan = Integer.toString(nodoAuxiliar.getNumPartidasGan());
            String numDeIngresos = Integer.toString(nodoAuxiliar.getNumIngresos());
            String numCreadas = Integer.toString(nodoAuxiliar.getNumPartCreadas());
            String elPuntaje = Integer.toString(nodoAuxiliar.getPuntaje());

            nombre.setText(nodoAuxiliar.getNombre());
            apellido.setText(nodoAuxiliar.getApellido());
            fechaNac.setText(nodoAuxiliar.getFechaNac());
            nickname.setText(nodoAuxiliar.getNickname());
            clave.setText(nodoAuxiliar.getClave());
            avatar.setText(nodoAuxiliar.getAvatar());
            numPartidasGanadas.setText(numGan);
            numIngresos.setText(numDeIngresos);
            numPartidasCreadas.setText(numCreadas);
            puntaje.setText(elPuntaje);

            usuario.addContent(nombre);
            usuario.addContent(apellido);
            usuario.addContent(fechaNac);
            usuario.addContent(nickname);
            usuario.addContent(clave);
            usuario.addContent(avatar);
            usuario.addContent(numPartidasGanadas);
            usuario.addContent(numIngresos);
            usuario.addContent(numPartidasCreadas);
            usuario.addContent(puntaje);

            root.addContent(usuario);
        }


        Document doc = new Document(root);

        try {

            XMLOutputter out = new XMLOutputter();

            FileOutputStream file = new FileOutputStream(direccionUsuarios);

            out.output(doc, file);

            file.flush();
            file.close();

            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * cargarDatosArchivoUsuario lee el archivo con la informacion de los usuarios
     * @param listaUsuarios
     */
    public static void cargarDatosArchivoUsuario(ListaUsuarios listaUsuarios) {
        try {
            SAXBuilder builder = new SAXBuilder();

            Document doc = builder.build(direccionUsuarios);

            Element raiz = doc.getRootElement();

            List listadoUsuarios = raiz.getChildren("Usuario");

            Iterator i = listadoUsuarios.iterator();

            while (i.hasNext()) {

                Element e = (Element) i.next();

                Element nombre = e.getChild("nombre");
                Element apellido = e.getChild("apellido");
                Element fechaNac = e.getChild("fechaNac");
                Element nickname = e.getChild("nickname");
                Element clave = e.getChild("clave");
                Element avatar = e.getChild("avatar");
                Element numPartidasGan = e.getChild("numPartGan");
                Element numDeIngresos = e.getChild("numIngresos");
                Element numPartidasCreadas = e.getChild("numPartCreadas");
                Element elPuntaje = e.getChild("puntaje");

                int numPartidasGanadas = Integer.parseInt(numPartidasGan.getText());
                int numIngresos = Integer.parseInt(numDeIngresos.getText());
                int numPartCreadas = Integer.parseInt(numPartidasCreadas.getText());
                int puntaje = Integer.parseInt(elPuntaje.getText());

                Usuario elUsuario = new Usuario(nombre.getText(), apellido.getText(), fechaNac.getText(), clave.getText(), nickname.getText(), avatar.getText(), numPartidasGanadas, numIngresos, numPartCreadas, puntaje);
                listaUsuarios.agregarUsuario(elUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * cargarPiedrasArchivo lee el archivo con la información de las piedras y llena la lista de piedras
     * @param listaDePiedras
     */
    public static void cargarPiedrasArchivo(ListaPiedras listaDePiedras) {
        try {
            SAXBuilder builder = new SAXBuilder();


            Document doc = builder.build(direccionPiedras);


            Element raiz = doc.getRootElement();


            List listaPiedras = raiz.getChildren("piedra");


            Iterator i = listaPiedras.iterator();

            while (i.hasNext()) {
                Element e = (Element) i.next();

                Element ID = e.getChild("ID");
                Element num1 = e.getChild("num1");
                Element num2 = e.getChild("num2");
                Element ImagenArriba = e.getChild("ImagenArriba");
                Element ImagenDerecha = e.getChild("ImagenDerecha");
                Element ImagenAbajo = e.getChild("ImagenAbajo");
                Element ImagenIzquierda = e.getChild("ImagenIzquierda");

                int numeroUno = Integer.parseInt(num1.getText());
                int numeroDos = Integer.parseInt(num2.getText());

                Piedra laPiedra = new Piedra(ID.getText(), numeroUno, numeroDos, ImagenArriba.getText(), ImagenDerecha.getText(), ImagenAbajo.getText(), ImagenIzquierda.getText());

                listaDePiedras.agregarPiedra(laPiedra);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * cargarPartidasArchivo lee el archivo que contiene la información de las partidas guardadas
     * @param listaDePartidas la lista donde se guardará la información leida del archivo xml
     * @return un boolean false si se leyó correctamente
     */

    public static boolean cargarPartidasArchivo(ListaPartidas listaDePartidas) {
        try {

            SAXBuilder builder = new SAXBuilder();

            Document doc = builder.build(direccionPartidas);

            Element raiz = doc.getRootElement();

            List listaPartidas = raiz.getChildren("Partida");

            Iterator i = listaPartidas.iterator();

            while (i.hasNext()) {
            ListaPiedras listaPiedrasJugador = new ListaPiedras();
            ListaPiedras listaPiedrasMaquina = new ListaPiedras();
            ListaPiedras listaPiedrasPozo = new ListaPiedras();
            ListaPiedras listaPiedrasMesa = new ListaPiedras();

                Element e = (Element) i.next();

                Element username = e.getChild("nickname");
                Element fechaInicial = e.getChild("fechaIni");
                Element fechaact = e.getChild("fechaactual");
                Element IDPartida = e.getChild("IDPartida");
                int numeroPartida = Integer.parseInt(IDPartida.getText());

                //PIEDRAS JUGADOR

                Element subRaizJugador = e.getChild("PiedrasJugador");
                List piedrasJugador = subRaizJugador.getChildren("Piedra");
                Iterator iteradorJugador = piedrasJugador.iterator();

                while (iteradorJugador.hasNext()) {
                    Element elemento = (Element) iteradorJugador.next();

                    Element num1 = elemento.getChild("num1");
                    Element num2 = elemento.getChild("num2");

                    int numero1 = Integer.parseInt(num1.getText());
                    int numero2 = Integer.parseInt(num2.getText());

                    listaPiedrasJugador.agregarPiedra(new Piedra(numero1, numero2));
                }



                Usuario elUsuario = new Usuario("", "", "", username.getText(), "", "");

                Jugador elJugador = new Jugador(username.getText(), "", 0, 0, 0, 0);
                elJugador.getElJugador().setPiedrasEnMano(listaPiedrasJugador);

                //FIN PIEDRAS JUGADOR


                //PIEDRAS MAQUINA
                Element subRaizMaquina = e.getChild("PiedrasMaquina");
                List piedrasMaquina = subRaizMaquina.getChildren("Piedra");
                Iterator iteradorMaquina = piedrasMaquina.iterator();

                while (iteradorMaquina.hasNext()) {
                    Element elemento = (Element) iteradorMaquina.next();

                    Element num1 = elemento.getChild("num1");
                    Element num2 = elemento.getChild("num2");

                    int numero1 = Integer.parseInt(num1.getText());
                    int numero2 = Integer.parseInt(num2.getText());

                    listaPiedrasMaquina.agregarPiedra(new Piedra(numero1, numero2));
                }
                Maquina laMaquina = new Maquina();
                laMaquina.getLaMaquina().setPiedrasEnMano(listaPiedrasMaquina);

                //FIN PIEDRAS MAQUINA


                //PIEDRAS POZO
                Element subRaizPozo = e.getChild("PiedrasPozo");
                List piedrasPozo = subRaizPozo.getChildren("Piedra");
                Iterator iteradorPozo = piedrasPozo.iterator();

                while (iteradorPozo.hasNext()) {
                    Element elemento = (Element) iteradorPozo.next();

                    Element num1 = elemento.getChild("num1");
                    Element num2 = elemento.getChild("num2");

                    int numero1 = Integer.parseInt(num1.getText());
                    int numero2 = Integer.parseInt(num2.getText());

                    listaPiedrasPozo.agregarPiedra(new Piedra(numero1, numero2));
                }
                Mesa laMesa = new Mesa();
                laMesa.setElPozo(listaPiedrasPozo);
                //FIN PIEDRAS POZO


                //PIEDRAS MESA
                Element subRaizMesa = e.getChild("PiedrasMesa");
                List piedrasMesa = subRaizMesa.getChildren("Piedra");
                Iterator iteradorMesa = piedrasMesa.iterator();

                while (iteradorMesa.hasNext()) {
                    Element elemento = (Element) iteradorMesa.next();

                    Element num1 = elemento.getChild("num1");
                    Element num2 = elemento.getChild("num2");

                    int numero1 = Integer.parseInt(num1.getText());
                    int numero2 = Integer.parseInt(num2.getText());

                    listaPiedrasMesa.agregarPiedra(new Piedra(numero1, numero2));
                }

                laMesa.setPiedrasMesa(listaPiedrasMesa);

                //FIN PIEDRAS MESA

                Juego elJuego = new Juego(elJugador, laMaquina, laMesa);

                Partida laPartida = new Partida(elUsuario, numeroPartida, fechaInicial.getText(), fechaact.getText(), elJuego);

                listaDePartidas.agregarPartida(laPartida);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * guardarDatosArchivoPartidas para guardar en el archivo xml la información de las partidas que han sido guardadas por el usuario
     * @param listaPartidas la lista de partidas que se vaciará en el archivo xml
     */
    public static void guardarDatosArchivoPartidas(ListaPartidas listaPartidas) {

        Partida nodoAuxiliar;

        Element root = new Element("Partidas");

        Iterator iterador = listaPartidas.getIterator();

        while (iterador.hasNext()) {
            Element partida = new Element("Partida");

            nodoAuxiliar = (Partida) iterador.next();

            Element username = new Element("nickname");
            Element fechaactual = new Element("fechaactual");
            Element fechaIni = new Element("fechaIni");
            Element IDPartida = new Element("IDPartida");

            String IDPartidaInt = Integer.toString(nodoAuxiliar.getIDPartida());

            username.setText(nodoAuxiliar.getElUsuario().getNickname());
            fechaactual.setText(nodoAuxiliar.getFechaactual());
            fechaIni.setText(nodoAuxiliar.getFechaIni());
            IDPartida.setText(IDPartidaInt);

            partida.addContent(username);
            partida.addContent(fechaactual);
            partida.addContent(fechaIni);
            partida.addContent(IDPartida);


            Piedra nodoAuxiliarPiedra;
            //PIEDRAS EN MANO DEL JUGADOR
            Element piedraJugador = new Element("PiedrasJugador");

            Iterator iteradorJugador = nodoAuxiliar.getElJuego().getJugador1().getElJugador().getPiedrasEnMano().getIterator();

            while (iteradorJugador.hasNext()) {
                Element piedra = new Element("Piedra");
                nodoAuxiliarPiedra = (Piedra) iteradorJugador.next();

                Element num1 = new Element("num1");
                Element num2 = new Element("num2");

                String num1Str = Integer.toString(nodoAuxiliarPiedra.getNum1());
                String num2Str = Integer.toString(nodoAuxiliarPiedra.getNum2());

                num1.setText(num1Str);
                num2.setText(num2Str);

                piedra.addContent(num1);
                piedra.addContent(num2);

                piedraJugador.addContent(piedra);
            }
            partida.addContent(piedraJugador);


            //PIEDRAS EN MANO DE LA MÁQUINA
            Element piedraMaquina = new Element("PiedrasMaquina");
            Iterator iteradorMaquina = nodoAuxiliar.getElJuego().getJugador2().getLaMaquina().getPiedrasEnMano().getIterator();

            while (iteradorMaquina.hasNext()) {
                Element piedra = new Element("Piedra");
                nodoAuxiliarPiedra = (Piedra) iteradorMaquina.next();

                Element num1 = new Element("num1");
                Element num2 = new Element("num2");

                String num1Str = Integer.toString(nodoAuxiliarPiedra.getNum1());
                String num2Str = Integer.toString(nodoAuxiliarPiedra.getNum2());

                num1.setText(num1Str);
                num2.setText(num2Str);

                piedra.addContent(num1);
                piedra.addContent(num2);

                piedraMaquina.addContent(piedra);
            }

            partida.addContent(piedraMaquina);

            //PIEDRAS DEL POZO
            Element piedraPozo = new Element("PiedrasPozo");
            Iterator iteradorPozo = nodoAuxiliar.getElJuego().getLaMesa().getElPozo().getIterator();

            while (iteradorPozo.hasNext()) {
                Element piedra = new Element("Piedra");
                nodoAuxiliarPiedra = (Piedra) iteradorPozo.next();

                Element num1 = new Element("num1");
                Element num2 = new Element("num2");

                String num1Str = Integer.toString(nodoAuxiliarPiedra.getNum1());
                String num2Str = Integer.toString(nodoAuxiliarPiedra.getNum2());

                num1.setText(num1Str);
                num2.setText(num2Str);

                piedra.addContent(num1);
                piedra.addContent(num2);

                piedraPozo.addContent(piedra);
            }
            partida.addContent(piedraPozo);


            //PIEDRAS DE MESA
            Element piedraMesa = new Element("PiedrasMesa");
            Iterator iteradorMesa = nodoAuxiliar.getElJuego().getLaMesa().getPiedrasMesa().getIterator();

            while (iteradorMesa.hasNext()) {
                Element piedra = new Element("Piedra");
                nodoAuxiliarPiedra = (Piedra) iteradorMesa.next();

                Element num1 = new Element("num1");
                Element num2 = new Element("num2");

                String num1Str = Integer.toString(nodoAuxiliarPiedra.getNum1());
                String num2Str = Integer.toString(nodoAuxiliarPiedra.getNum2());

                num1.setText(num1Str);
                num2.setText(num2Str);

                piedra.addContent(num1);
                piedra.addContent(num2);

                piedraMesa.addContent(piedra);
            }
            partida.addContent(piedraMesa);


            root.addContent(partida);
        }

        Document doc = new Document(root);

        try {

            XMLOutputter out = new XMLOutputter();

            FileOutputStream file = new FileOutputStream(direccionPartidas);

            out.output(doc, file);

            file.flush();
            file.close();

            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
