package Modelo;

public class Empleados {

    String nombre, apaterno, amaterno, ecivil;
    double SueldoBase;
    String dni;
    int VRealizadas, NHijos;

    public Empleados() {
    }

    public Empleados(String nombre, String apaterno, String amaterno, String ecivil, double SueldoBase, String dni, int VRealizadas, int NHijos) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.ecivil = ecivil;
        this.SueldoBase = SueldoBase;
        this.dni = dni;
        this.VRealizadas = VRealizadas;
        this.NHijos = NHijos;
    }
    public Empleados(Object[] arreglo) {
        this.nombre = arreglo[0].toString();
        this.apaterno = arreglo[1].toString();
        this.amaterno = arreglo[2].toString();
        this.ecivil = arreglo[3].toString();
        this.SueldoBase = Double.parseDouble(arreglo[4].toString());
        this.dni = arreglo[5].toString();
        this.VRealizadas = Integer.parseInt(arreglo[6].toString());
        this.NHijos = Integer.parseInt(arreglo[7].toString());

    }

    public Object[] getInfo() {
        Object[] fila = {getNombre(), getApaterno(), getAmaterno(), getEcivil(), getSueldoBase(), getDni(), getVRealizadas(), getNHijos(), SueldoNeto()};
        return fila;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getEcivil() {
        return ecivil;
    }

    public void setEcivil(String ecivil) {
        this.ecivil = ecivil;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getVRealizadas() {
        return VRealizadas;
    }

    public void setVRealizadas(int VRealizadas) {
        this.VRealizadas = VRealizadas;
    }

    public int getNHijos() {
        return NHijos;
    }

    public void setNHijos(int NHijos) {
        this.NHijos = NHijos;
    }

    /* ------------ Calculos -------------*/
    public double ComisionPorVenta() {
        if (getVRealizadas() == 0) {
            return getVRealizadas();
        } else {
            return getVRealizadas() * 0.05;
        }

    }

    /*SOLTERO
CASADO
HIJOS*/
    public double DescuentoPorSeguro() {
        switch (getEcivil()) {
            case "SOLTERO":
                return 100;
            case "CASADO":
                return 120;
            case "HIJOS":
                return 50 + (70 * getNHijos());
        }
        /*SOLTERO
CASADO
HIJOS*/
        return 0;
    }

    public double TA() {
        return getSueldoBase() + ComisionPorVenta();
    }

    public double DescuentoPorImpuesto() {
        if (TA() >= 0 && TA() <= 1500) {
            return TA();
        } else if (TA() > 1500 && TA() <= 2300) {
            return 0.03 * TA();
        } else if (TA() >= 2301 && TA() <= 3000) {
            return 0.04 * TA();
        } else if (TA() > 3001) {
            return 0.06 * TA();
        }
        return 0;

    }

    public double SueldoNeto() {
        return getSueldoBase() + ComisionPorVenta() - DescuentoPorImpuesto() - DescuentoPorSeguro();
    }

}
