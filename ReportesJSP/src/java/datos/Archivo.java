package datos;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import java.util.*;

public class Archivo {
    private static String direccionUsuarios = "C:/Users/Alberly/Documents/NetBeansProjects/ProyectoiDomino/src/servidor/datos/JSPnumIngresos.xml";
    private static String direccionUsuarios2 = "C:/Users/Alberly/Documents/NetBeansProjects/ProyectoiDomino/src/servidor/datos/JSPpartidasCreadas.xml";
    private static String direccionUsuarios3 = "C:/Users/Alberly/Documents/NetBeansProjects/ProyectoiDomino/src/servidor/datos/JSPpartidasGanadas.xml";
    private static String direccionUsuarios4 = "C:/Users/Alberly/Documents/NetBeansProjects/ProyectoiDomino/src/servidor/datos/JSPmayorScore.xml";

    private static String archivoUsuarios = "C:/Users/Alberly/Documents/NetBeansProjects/ProyectoiDomino/src/servidor/datos/Usuarios.xml";

    /**
     * guardarDatosArchivoUsuario guarda en el archivo xml la lista ordenada por numero de ingresos
     * @param listaUsuarios
     */
    public static void guardarDatosArchivoUsuario(ListaReportes listaUsuarios) {
        Usuario nodoAuxiliar;

        Element root = new Element("Usuarios");

        Iterator iterador = listaUsuarios.getIterator1();

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
     * cargar datos archivo usuario, carga el archivo de los usuarios y los agrega a las listas de los ordenes
     * @param listaUsuarios
     */
    public static void cargarDatosArchivoUsuario(ListaReportes listaUsuarios) {
        try {
            SAXBuilder builder = new SAXBuilder();

            Document doc = builder.build(archivoUsuarios);

            Element raiz = doc.getRootElement();

            List listadoUsuarios = raiz.getChildren("Usuario");

            System.out.println("Formada por:" + listadoUsuarios.size() + " usuarios");
            System.out.println("------------------");

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
                listaUsuarios.agregarUsuario(elUsuario, 1);
                listaUsuarios.agregarUsuario(elUsuario, 2);
                listaUsuarios.agregarUsuario(elUsuario, 3);
                listaUsuarios.agregarUsuario(elUsuario, 4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * guardarDatosArchivoUsuario2 guarda en el archivo xml la lista ordenada por numero de partidas creadas
     * @param listaUsuarios
     */
    public static void guardarDatosArchivoUsuario2(ListaReportes listaUsuarios) {
        Usuario nodoAuxiliar;

        Element root = new Element("Usuarios");

        Iterator iterador = listaUsuarios.getIterator2();

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

            FileOutputStream file = new FileOutputStream(direccionUsuarios2);

            out.output(doc, file);

            file.flush();
            file.close();

            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * guardarDatosArchivoUsuario3 guarda en el archivo xml la lista ordenada por numero de partidas ganadas
     * @param listaUsuarios
     */
    public static void guardarDatosArchivoUsuario3(ListaReportes listaUsuarios) {
        Usuario nodoAuxiliar;

        Element root = new Element("Usuarios");

        Iterator iterador = listaUsuarios.getIterator3();

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

            FileOutputStream file = new FileOutputStream(direccionUsuarios3);

            out.output(doc, file);

            file.flush();
            file.close();

            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * guardarDatosArchivoUsuario2 guarda en el archivo xml la lista ordenada por mayor score
     * @param listaUsuarios
     */
    public static void guardarDatosArchivoUsuario4(ListaReportes listaUsuarios) {
        Usuario nodoAuxiliar;

        Element root = new Element("Usuarios");

        Iterator iterador = listaUsuarios.getIterator4();

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

            FileOutputStream file = new FileOutputStream(direccionUsuarios4);

            out.output(doc, file);

            file.flush();
            file.close();

            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
