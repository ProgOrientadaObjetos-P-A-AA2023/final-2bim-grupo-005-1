package paquete02;

public class PlanPostPagoMinutos extends PlanCelular{
    private double minNacional;
    private double costoMinNacional;
    private double minInternacional;
    private double costoMinInternacional;

    public PlanPostPagoMinutos(double mNac, double costMNac, double mInt,
            double costMInt, String nomProp, String apesProp, String pasaProp,
            String ciuProp, String barProp, String marCel, String modCel,
            int nCel) {
        super(nomProp, apesProp, pasaProp, ciuProp, barProp, marCel, modCel
                , nCel);
        minNacional = mNac;
        costoMinNacional = costMNac;
        minInternacional = mInt;
        costoMinInternacional = costMInt;
    }

    public double obtenerMinNacional() {
        return minNacional;
    }

    public void establecerMinNacional(double n) {
        minNacional = n;
    }

    public double obtenerCostoMinNacional() {
        return costoMinNacional;
    }

    public void establecerCostoMinNacional(double n) {
        costoMinNacional = n;
    }

    public double obtenerMinInternacional() {
        return minInternacional;
    }

    public void establecerMinInternacional(double n) {
        minInternacional = n;
    }

    public double obtenerCostoMinInternacional() {
        return costoMinInternacional;
    }

    public void establecerCostoMinInternacional(double n) {
        costoMinInternacional = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minNacional * costoMinNacional) + 
                (minInternacional * costoMinInternacional);
    }

    @Override
    public String toString() {
        String m = String.format("""
                         %s
                         -Plan postpago minutos:
                            Minutos nacionales: %.2f
                            Costo minutos nacionales: $%.2f
                            Minutos internacionales: %.2f 
                            Costo minutos internacionales: $%.2f
                             
                            +Pago mensual: $%.2f
                                    
                         """,
                super.toString(),
                minNacional,
                costoMinNacional,
                minInternacional,
                costoMinInternacional,
                pagoMensual);
                
                return m;
    }
    
    
}
