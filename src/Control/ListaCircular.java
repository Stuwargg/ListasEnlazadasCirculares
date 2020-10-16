package Control;

import Modelo.Empleados;
import java.util.ArrayList;

public class ListaCircular {

    NodoCircular nc;

    public ListaCircular() {
        nc = null;
    }

    public boolean vacio() {
        if (nc == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(Empleados em){
        NodoCircular nuevo = new NodoCircular(em);
        if (!vacio()) {
            nuevo.setEnlace(nc.getEnlace());
            nc.setEnlace(nuevo);
        }
        nc = nuevo;
    }
    
    public ArrayList<Empleados> listar(){
        NodoCircular n;
        ArrayList<Empleados> array = new ArrayList();
        if (!vacio()) {
            n = nc.getEnlace();
            do {
                array.add(n.getInformacion());
                n = n.getEnlace();
            } while (n != nc.getEnlace());
        }
        return array;
    }
    
    public Empleados buscar(String dni){
        NodoCircular actual;
        boolean encontrado = false;
        actual = nc;
        while ((actual.getEnlace() != nc) && (!encontrado)) {            
            encontrado = dni.equals(actual.getInformacion().getDni());
            if (!encontrado) {
                actual = actual.getEnlace();
            }
        }
        encontrado = dni.equals(actual.getInformacion().getDni());
        if (encontrado) {
            return actual.getInformacion();
        }else{
            return null;
        }
    }
    
    public boolean actualizar (Empleados em){
        NodoCircular actual;
        boolean encontraado= false;
        actual = nc;
        while ((actual.getEnlace() != nc) && (!encontraado)) {            
            encontraado = em.getDni().equals(actual.getInformacion().getDni());
            if (!encontraado) {
                actual = actual.getEnlace();
            }
            
        }
        encontraado = em.getDni().equals(actual.getInformacion().getDni());
        if (encontraado) {
            actual.setInformacion(em);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminar(String dni){
        NodoCircular actual  = nc;
        boolean encontrado  = false;
        while ((actual.getEnlace() != nc) && (!encontrado)) {            
            encontrado = actual.getEnlace().getInformacion().getDni().equalsIgnoreCase(dni);
            if (!encontrado) {
                actual = actual.getEnlace();
            }
        }
        encontrado = actual.getEnlace().getInformacion().getDni().equalsIgnoreCase(dni);
        if (encontrado) {
            NodoCircular n = actual.getEnlace();
            if(nc == nc.getEnlace()){
                nc = null;
            }else{
                if (n == nc) {
                    nc = actual;
                }
                actual.setEnlace(n.getEnlace());
            }
            return true;
        }else{
            return false;
        }
    }
    
}
