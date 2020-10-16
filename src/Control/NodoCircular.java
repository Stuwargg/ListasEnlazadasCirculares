
package Control;

import Modelo.Empleados;


public class NodoCircular {
    Empleados informacion;
    NodoCircular enlace;

    public NodoCircular(Empleados informacion) {
        this.informacion = informacion;
        this.enlace = this;
    }

    public Empleados getInformacion() {
        return informacion;
    }

    public void setInformacion(Empleados informacion) {
        this.informacion = informacion;
    }

    public NodoCircular getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoCircular enlace) {
        this.enlace = enlace;
    }
    
    
}
