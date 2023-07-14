package paquete02;

public class PlanPostPagoMegas extends PlanCelular {

    private double megas;
    private double costoMegas;
    private double tarifaBase;

    public PlanPostPagoMegas(double megs, double costmegs, double tarBas,
            String nomProp, String apesProp, String pasaProp, String ciuProp,
            String barProp, String marCel, String modCel, int nCel) {
        super(nomProp, apesProp, pasaProp, ciuProp, barProp, marCel, modCel,
                nCel);
        megas = megs;
        costoMegas = costmegs;
        tarifaBase = tarBas;
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

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megas * costoMegas) + tarifaBase;
    }

    @Override
    public String toString() {
        String m = String.format("""
                         %s
                         -Plan postpago megas:
                            Megas: %.2f GB
                            Costo megas: $%.2f
                            Tarifa base: $%.2f
                                    
                            +Pago mensual: $%.2f
                                    
                            """,
                super.toString(),
                megas,
                costoMegas,
                tarifaBase,
                pagoMensual);

        return m;
    }

}
