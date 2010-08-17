package servidor.datos;
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
 private static String direccionUsuarios = "src/servidor/datos/Usuarios.xml";
 private static String nombreArchivo = "src/servidor/datos/Piedras.xml";
      //private static String nombreArchivo2 = "src/datos/Piedras2.xml";

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

            usuario.addContent(nombre);
            usuario.addContent(apellido);
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

    public static void cargarDatosArchivo(ListaUsuarios listaUsuarios) {
        try {
            SAXBuilder builder = new SAXBuilder();

            Document doc = builder.build(direccionUsuarios);

            Element raiz = doc.getRootElement();

            List listadoUsuarios = raiz.getChildren("Usuario");

            System.out.println("Formada por:" + listadoUsuarios.size() + " usuarios");
            System.out.println("------------------");

            Iterator i = listadoUsuarios.iterator();

            while (i.hasNext()) {

                Element e = (Element) i.next();

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

                Usuario elUsuario = new Usuario(nombre.getText(), apellido.getText(), clave.getText(), nickname.getText(), avatar.getText(), numPartidasGanadas, numIngresos, numPartCreadas, puntaje);
                listaUsuarios.agregarUsuario(elUsuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


////////////////////////////////ABE///////////////////////////


    public static void cargarPiedrasArchivo(ListaPiedras listaDePiedras)
    {
        try
        {
            SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            Document doc = builder.build(nombreArchivo);

            /* Se obtiene la raíz del archivo (la etiqueta inicial) */
            Element raiz = doc.getRootElement(); //comienzo del archivo. Usuario.

            /* Se puede obtener el atributo de la raíz (de la etiqueta) */
            System.out.println(raiz.getAttributeValue("tipo"));

            /* Se obtienen todos los hijos cuya etiqueta esa "usuario"  */
            /* y se asignan esos hijos a un List                        */
            List listaPiedras = raiz.getChildren("piedra"); //cada usuario.

            System.out.println("Formada por:" + listaPiedras.size() + " piedras");
            System.out.println("------------------");

            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = listaPiedras.iterator();

            /* Se recorre el List */
            while (i.hasNext())
            {
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

                /* Se obtiene el nombre, apellido y cargo de cada una de las etiquetas  */
                /* hijas de usuario, es decir, nombre, apellido y cargo                 */
                Element num1 = e.getChild("num1");
                Element num2 = e.getChild("num2");

                int numeroUno = Integer.parseInt(num1.getText());
                int numeroDos = Integer.parseInt(num2.getText());

                Piedra laPiedra = new Piedra(numeroUno, numeroDos);
                listaDePiedras.agregarPiedra(laPiedra);


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



      /*public static void guardarArchivoXML(ListaPiedras listaDePiedras)
    {
        Piedra nodoAuxiliar;

        Element root = new Element("piedras");

        root.setAttribute("tipo","lista de piedras");

        Iterator iterador = listaDePiedras.getIterator();

        while (iterador.hasNext())
        {

            Element piedra = new Element ("piedra");

            nodoAuxiliar = (Piedra) iterador.next();


            Element num1 = new Element("num1");
            Element num2 = new Element("num2");



            int numero1Int = nodoAuxiliar.getNum1();
            int numero2Int = nodoAuxiliar.getNum2();

            String numero1Str= String.valueOf(numero1Int);
            String numero2Str= String.valueOf(numero2Int);

            num1.setText(numero1Str);
            num2.setText(numero2Str);

            piedra.addContent(num1);
            piedra.addContent(num2);


            root.addContent(piedra);


        }


        Document doc = new Document(root);

        try
        {

            XMLOutputter out = new XMLOutputter();

            FileOutputStream file = new FileOutputStream(nombreArchivo);

            out.output(doc,file);

            file.flush();
            file.close();

            out.output(doc,System.out);
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
}*/


////////////////////////////////ABE///////////////////////////








}
