package paquete02;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular{
    private double minutos;
    private double costoMinutos;
    private double megas;
    private double costoMegas;
    private double porcDesc;

    public PlanPostPagoMinutosMegasEconomico(double min, double costMin, 
            double megs, double costMegs, double pDes, String nomProp, String apesProp, String pasaProp, String ciuProp, String barProp, String marCel, String modCel, int nCel) {
        super(nomProp, apesProp, pasaProp, ciuProp, barProp, marCel, modCel, nCel);
        minutos = min;
        costoMinutos = costMin;
        megas = megs;
        costoMegas = costMegs;
        porcDesc = pDes;
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

    public double obtenerPorcDesc() {
        return porcDesc;
    }

    public void establecerPorcDesc(double n) {
        porcDesc = n;
    }

    @Override
    public void calcularPagoMensual() {
        double val = (minutos * costoMinutos) + (megas * costoMegas);
        double desc = (val * porcDesc)/100;
        pagoMensual = val - desc;
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 %s
                                 -Plan postpago minutos-megas economico:
                                    Minutos: %.2f
                                    Costo minutos: $%.2f
                                    Megas: %.2f GB
                                    Costo megas: $%.2f
                                    Porcentaje descuento: %.2f
                                    
                                    +Pago mensual: $%.2f
                                    
                                 """,
                super.toString(),
                minutos,
                costoMinutos,
                megas,
                costoMegas,
                porcDesc,
                pagoMensual);
        
        return m;
    } 
}
