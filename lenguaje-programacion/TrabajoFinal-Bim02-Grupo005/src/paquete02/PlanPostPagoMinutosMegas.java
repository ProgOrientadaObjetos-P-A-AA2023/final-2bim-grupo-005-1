package paquete02;

public class PlanPostPagoMinutosMegas extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double megas;
    private double costoMegas;

    public PlanPostPagoMinutosMegas(double min, double costMin, double megs,
            double costMegs, String nomProp, String apesProp, String pasaProp,
            String ciuProp, String barProp, String marCel, String modCel,
            int nCel) {
        super(nomProp, apesProp, pasaProp, ciuProp, barProp, marCel, modCel,
                nCel);
        minutos = min;
        costoMinutos = costMin;
        megas = megs;
        costoMegas = costMegs;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public void establecerMinutos(double n) {
        minutos = n;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public void establecerCostoMinutos(double n) {
        costoMinutos = n;
    }

    public double obtenerMegas() {
        return megas;
    }

    public void establecerMegas(double n) {
        megas = n;
    }

    public double obtenerCostoMegas() {
        return costoMegas;
    }

    public void establecerCostoMegas(double n) {
        costoMegas = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (megas * costoMegas);
    }

    @Override
    public String toString() {
        String m = String.format("""
                         %s
                         -Plan postpago minutos-megas:
                            Minutos: %.2f
                            Costo minutos: $%.2f     
                            Megas: %.2f GB
                            Costo megas: $%.2f
                                    
                            +Pago mensual: $%.2f
                                    
                            """,
                super.toString(),
                minutos,
                costoMinutos,
                megas,
                costoMegas,
                pagoMensual);

        return m;
    }
}
