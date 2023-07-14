package paquete02;

public abstract class PlanCelular {
    protected String nombresPropietario;
    protected String apellidosPropietario;
    protected String pasaportePropietario;
    protected String ciudadPropietario;
    protected String barrioPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int nroCelular;
    protected double pagoMensual;

    public PlanCelular(String nomProp, String apesProp,
            String pasaProp, String ciuProp,
            String barProp, String marCel,
            String modCel, int nCel) {
        nombresPropietario = nomProp;
        apellidosPropietario = apesProp;
        pasaportePropietario = pasaProp;
        ciudadPropietario = ciuProp;
        barrioPropietario = barProp;
        marcaCelular = marCel;
        modeloCelular = modCel;
        nroCelular = nCel;
    }

    public String obtenerNombresPropietario() {
        return nombresPropietario;
    }

    public void establecerNombresPropietario(String n) {
        nombresPropietario = n;
    }

    public String obtenerApellidosPropietario() {
        return apellidosPropietario;
    }

    public void establecerApellidosPropietario(String n) {
        apellidosPropietario = n;
    }

    public String obtenerPasaportePropietario() {
        return pasaportePropietario;
    }

    public void establecerPasaportePropietario(String n) {
        pasaportePropietario = n;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }

    public void establecerCiudadPropietario(String n) {
        ciudadPropietario = n;
    }

    public String obtenerBarrioPropietario() {
        return barrioPropietario;
    }

    public void establecerBarrioPropietario(String n) {
        barrioPropietario = n;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public void establecerMarcaCelular(String n) {
        marcaCelular = n;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public void establecerModeloCelular(String n) {
        modeloCelular = n;
    }

    public int obtenerNroCelular() {
        return nroCelular;
    }

    public void establecerNroCelular(int n) {
        nroCelular = n;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public abstract void calcularPagoMensual();

    @Override
    public String toString() {
        String m = String.format("""
                                 ******Plan Celular*****
                                 -Propietario:
                                    Nombres: %s
                                    Apellidos: %s
                                    Pasaporte: %s
                                    Ciudad: %s
                                    Barrio: %s
                                    Marca celular: %s
                                    Modelo celular: %s
                                    Numero celular: %d
                                    
                                 """,
                nombresPropietario,
                apellidosPropietario,
                pasaportePropietario,
                ciudadPropietario,
                barrioPropietario,
                marcaCelular,
                modeloCelular,
                nroCelular);
        
        return m;
    }
    
    
}
