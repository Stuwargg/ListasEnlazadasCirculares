package Control;

import Modelo.Empleados;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Proceso {

    String ruta = "F:\\Estructura de datos\\07_Laboratorio\\laboratorio07.txt";
    Empleados objEmp;
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;

    public ArrayList<Empleados> lista = new ArrayList();

    public void insertar(Empleados em) throws IOException {
        fw = new FileWriter(ruta, true);
        fw.write(em.getNombre() + "-" + em.getApaterno() + "-" + em.getAmaterno() + "-" + em.getEcivil() + "-" + em.getSueldoBase()
                + "-" + em.getDni() + "-" + em.getVRealizadas() + "-" + em.getNHijos() + "-" + em.SueldoNeto() + "\n");
        fw.close();
    }

    public void leer() throws FileNotFoundException, IOException {
        lista.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {
            vec = cad.split("-");
//            Object[] fila = {vec[0], vec[1], vec[2], vec[3], Double.parseDouble(vec[4]), vec[5], Integer.parseInt(vec[6]), Integer.parseInt(vec[7])};
            lista.add(new Empleados(vec[0], vec[1], vec[2], vec[3], Double.parseDouble(vec[4]), vec[5], Integer.parseInt(vec[6]), Integer.parseInt(vec[7])));
            cad = br.readLine();
        }
        fr.close();

    }

    public void actualizar(ArrayList<Empleados> array) throws IOException {
        f = new File(ruta);
        fw = new FileWriter(ruta, true);
        //BORRAR EL ARCHIVO
        fw.close();
        f.delete();

        //CREAR UN NUEVO ARCHIVO
        f = new File(ruta);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        fw = new FileWriter(f, true);
        for (Empleados em : array) {
            fw.write(em.getNombre() + "-" + em.getApaterno() + "-" + em.getAmaterno() + "-" + em.getEcivil() + "-" + em.getSueldoBase()
                + "-" + em.getDni() + "-" + em.getVRealizadas() + "-" + em.getNHijos() + "-" + em.SueldoNeto() + "\n");
        }
        
        fw.close();
    }
}
