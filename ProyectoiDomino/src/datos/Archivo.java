package datos;
import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import java.util.*;
/**
 *
 * @author Alberly
 */
public class Archivo {
 private static String direccionUsuarios = "src/datos/Usuarios.xml";

    public static void guardarDatosArchivo(ListaUsuarios listaUsuarios) {
        Usuario nodoAuxiliar;

        Element root = new Element("Usuarios");

        Iterator iterador = listaUsuarios.getIterator();

        while (iterador.hasNext()) {
            Element usuario = new Element("Usuario");

            nodoAuxiliar = (Usuario) iterador.next();

            Element nombre = new Element("nombre");
            Element apellido = new Element("apellido");
            Element nickname = new Element("nickname");
            Element clave = new Element("clave");
            Element avatar = new Element("avatar");
            Element numPartidasGanadas = new Element("numPartGan");
            Element numIngresos = new Element("numIngresos");
            Element numPartidasCreadas = new Element("numPartCreadas");
            Element puntaje = new Element("puntaje");

            /* Se inicializa cada etiqueta con sus valores de la lista, */
            /*pero primero se deben convertir los numeros a String*/
            String numGan = Integer.toString(nodoAuxiliar.getNumPartidasGan());
            String numDeIngresos = Integer.toString(nodoAuxiliar.getNumIngresos());
            String numCreadas = Integer.toString(nodoAuxiliar.getNumPartCreadas());
            String elPuntaje = Integer.toString(nodoAuxiliar.getPuntaje());

            nombre.setText(nodoAuxiliar.getNombre());
            apellido.setText(nodoAuxiliar.getApellido());
            nickname.setText(nodoAuxiliar.getNickname());
            clave.setText(nodoAuxiliar.getClave());
            avatar.setText(nodoAuxiliar.getAvatar());
            numPartidasGanadas.setText(numGan);
            numIngresos.setText(numDeIngresos);
            numPartidasCreadas.setText(numCreadas);
            puntaje.setText(elPuntaje);

            /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
            usuario.addContent(nombre);
            usuario.addContent(apellido);
            usuario.addContent(nickname);
            usuario.addContent(clave);
            usuario.addContent(avatar);
            usuario.addContent(numPartidasGanadas);
            usuario.addContent(numIngresos);
            usuario.addContent(numPartidasCreadas);
            usuario.addContent(puntaje);

            /* Se añade el nuevo usuario a la estructura XML */
            root.addContent(usuario);
        }

        /* Se crea un documento nuevo */
        Document doc = new Document(root);

        try {
            /* Se genera un flujo de salida de datos XML */
            XMLOutputter out = new XMLOutputter();

            /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
            FileOutputStream file = new FileOutputStream(direccionUsuarios);

            /* Se manda el documento generado hacia el archivo XML */
            out.output(doc, file);

            /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
            file.flush();
            file.close();

            /* En este caso se manda a imprimir el archivo por la consola   */
            /* ESTE PROCESO NO ES OBLIGATORIO PARA PROCESAR EL XML          */
            out.output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cargarDatosArchivo(ListaUsuarios listaUsuarios) {
        try {
            SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            Document doc = builder.build(direccionUsuarios);

            /* Se obtiene la raíz del archivo (la etiqueta inicial) */
            Element raiz = doc.getRootElement();

            /* Se puede obtener el atributo de la raíz (de la etiqueta) */
            //System.out.println(raiz.getAttributeValue("tipo"));

            /* Se obtienen todos los hijos cuya etiqueta esa "usuario"  */
            /* y se asignan esos hijos a un List                        */
            List listadoUsuarios = raiz.getChildren("Usuario");

            System.out.println("Formada por:" + listadoUsuarios.size() + " usuarios");
            System.out.println("------------------");

            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = listadoUsuarios.iterator();

            /* Se recorre el List */
            while (i.hasNext()) {
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

                /* Se obtiene el nombre, apellido y cargo de cada una de las etiquetas  */
                /* hijas de usuario, es decir, nombre, apellido y cargo                 */
                Element nombre = e.getChild("nombre");
                Element apellido = e.getChild("apellido");
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

                /* Se crea un nodo nuevo con la información y se agrega a la lista de usuarios */
                Usuario elUsuario = new Usuario(nombre.getText(), apellido.getText(), clave.getText(), nickname.getText(), avatar.getText(), numPartidasGanadas, numIngresos, numPartCreadas, puntaje);
                listaUsuarios.agregarUsuario(elUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
