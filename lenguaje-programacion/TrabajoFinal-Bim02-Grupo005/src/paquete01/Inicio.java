package paquete01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete02.PlanCelular;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;

public class Inicio {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        ArrayList<PlanCelular> lista = new ArrayList<>();
        int opcion;
        boolean bandera = true;

        while (bandera) {
            System.out.print("""
                             
                              Sistema de gestion 'Plan Celular'
                              Ingrese que tipo de plan registrar:
                              1. Plan postpago minutos-megas economico.
                              2. Plan postpago minutos.
                              3. Plan postpago megas.
                              4. Plan postpago minutos-megas.
                              5. Salir      
                             
                              """);
            opcion = ent.nextInt();

            switch (opcion) {
                case 1:
                    lista.add(ingreso01());
                    break;
                case 2:
                    lista.add(ingreso02());
                    break;
                case 3:
                    lista.add(ingreso03());
                    break;
                case 4:
                    lista.add(ingreso04());
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Error, esa opción no existe");
            }
        }

        for (PlanCelular p : lista) {
            System.out.println(p);
        }
    }

    public static PlanPostPagoMinutosMegasEconomico ingreso01() {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombresPropietario;
        String apellidosPropietario;
        String pasaportePropietario;
        String ciudadPropietario;
        String barrioPropietario;
        String marcaCelular;
        String modeloCelular;
        int nroCelular;
        double minutos;
        double costoMinutos;
        double megas;
        double costoMegas;
        double porcDesc;

        System.out.print("Ingrese los nombres: ");
        nombresPropietario = ent.nextLine();
        System.out.print("Ingrese los apellidos: ");
        apellidosPropietario = ent.nextLine();
        System.out.print("Ingrese el pasaporte: ");
        pasaportePropietario = ent.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudadPropietario = ent.nextLine();
        System.out.print("Ingrese el barrio: ");
        barrioPropietario = ent.nextLine();
        System.out.print("Ingrese la marca del celular: ");
        marcaCelular = ent.nextLine();
        System.out.print("Ingrese el modelo del celular: ");
        modeloCelular = ent.nextLine();
        System.out.print("Ingrese el numero de celular: ");
        nroCelular = ent.nextInt();
        System.out.print("Ingrese los minutos: ");
        minutos = ent.nextDouble();
        System.out.print("Ingrese el costo de los minutos: ");
        costoMinutos = ent.nextDouble();
        System.out.print("Ingrese los megas: ");
        megas = ent.nextDouble();
        System.out.print("Ingrese el costo de los megas: ");
        costoMegas = ent.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        porcDesc = ent.nextDouble();

        PlanPostPagoMinutosMegasEconomico p01
                = new PlanPostPagoMinutosMegasEconomico(minutos,
                        costoMinutos, megas, costoMegas,
                        porcDesc, nombresPropietario,
                        apellidosPropietario, pasaportePropietario,
                        ciudadPropietario, barrioPropietario,
                        marcaCelular, modeloCelular, nroCelular);
        p01.calcularPagoMensual();

        return p01;
    }

    public static PlanPostPagoMinutos ingreso02() {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombresPropietario;
        String apellidosPropietario;
        String pasaportePropietario;
        String ciudadPropietario;
        String barrioPropietario;
        String marcaCelular;
        String modeloCelular;
        int nroCelular;
        double minutosNac;
        double costoMinutosNac;
        double minutosInt;
        double costoMinutosInt;

        System.out.print("Ingrese los nombres: ");
        nombresPropietario = ent.nextLine();
        System.out.print("Ingrese los apellidos: ");
        apellidosPropietario = ent.nextLine();
        System.out.print("Ingrese el pasaporte: ");
        pasaportePropietario = ent.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudadPropietario = ent.nextLine();
        System.out.print("Ingrese el barrio: ");
        barrioPropietario = ent.nextLine();
        System.out.print("Ingrese la marca del celular: ");
        marcaCelular = ent.nextLine();
        System.out.print("Ingrese el modelo del celular: ");
        modeloCelular = ent.nextLine();
        System.out.print("Ingrese el numero de celular: ");
        nroCelular = ent.nextInt();
        System.out.print("Ingrese los minutos nacionales: ");
        minutosNac = ent.nextDouble();
        System.out.print("Ingrese el costo de los minutos nacionales: ");
        costoMinutosNac = ent.nextDouble();
        System.out.print("Ingrese los minutos internacionales: ");
        minutosInt = ent.nextDouble();
        System.out.print("Ingrese el costo de los minutos internacionales: ");
        costoMinutosInt = ent.nextDouble();

        PlanPostPagoMinutos p02
                = new PlanPostPagoMinutos(minutosNac,
                        costoMinutosNac, minutosInt,
                        costoMinutosInt, nombresPropietario,
                        apellidosPropietario, pasaportePropietario,
                        ciudadPropietario, barrioPropietario,
                        marcaCelular, modeloCelular, nroCelular);
        p02.calcularPagoMensual();

        return p02;
    }

    public static PlanPostPagoMegas ingreso03() {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombresPropietario;
        String apellidosPropietario;
        String pasaportePropietario;
        String ciudadPropietario;
        String barrioPropietario;
        String marcaCelular;
        String modeloCelular;
        int nroCelular;
        double megas;
        double costoMegas;
        double tarBase;

        System.out.print("Ingrese los nombres: ");
        nombresPropietario = ent.nextLine();
        System.out.print("Ingrese los apellidos: ");
        apellidosPropietario = ent.nextLine();
        System.out.print("Ingrese el pasaporte: ");
        pasaportePropietario = ent.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudadPropietario = ent.nextLine();
        System.out.print("Ingrese el barrio: ");
        barrioPropietario = ent.nextLine();
        System.out.print("Ingrese la marca del celular: ");
        marcaCelular = ent.nextLine();
        System.out.print("Ingrese el modelo del celular: ");
        modeloCelular = ent.nextLine();
        System.out.print("Ingrese el numero de celular: ");
        nroCelular = ent.nextInt();
        System.out.print("Ingrese los megas: ");
        megas = ent.nextDouble();
        System.out.print("Ingrese el costo de los megas: ");
        costoMegas = ent.nextDouble();
        System.out.print("Ingrese la tarifa base: ");
        tarBase = ent.nextDouble();

        PlanPostPagoMegas p03
                = new PlanPostPagoMegas(megas,
                        costoMegas, tarBase,
                        nombresPropietario,
                        apellidosPropietario, pasaportePropietario,
                        ciudadPropietario, barrioPropietario,
                        marcaCelular, modeloCelular, nroCelular);
        p03.calcularPagoMensual();

        return p03;
    }

    public static PlanPostPagoMinutosMegas ingreso04() {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombresPropietario;
        String apellidosPropietario;
        String pasaportePropietario;
        String ciudadPropietario;
        String barrioPropietario;
        String marcaCelular;
        String modeloCelular;
        int nroCelular;
        double minutos;
        double costoMinutos;
        double megas;
        double costoMegas;

        System.out.print("Ingrese los nombres: ");
        nombresPropietario = ent.nextLine();
        System.out.print("Ingrese los apellidos: ");
        apellidosPropietario = ent.nextLine();
        System.out.print("Ingrese el pasaporte: ");
        pasaportePropietario = ent.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudadPropietario = ent.nextLine();
        System.out.print("Ingrese el barrio: ");
        barrioPropietario = ent.nextLine();
        System.out.print("Ingrese la marca del celular: ");
        marcaCelular = ent.nextLine();
        System.out.print("Ingrese el modelo del celular: ");
        modeloCelular = ent.nextLine();
        System.out.print("Ingrese el numero de celular: ");
        nroCelular = ent.nextInt();
        System.out.print("Ingrese los minutos: ");
        minutos = ent.nextDouble();
        System.out.print("Ingrese el costo de los minutos: ");
        costoMinutos = ent.nextDouble();
        System.out.print("Ingrese los megas: ");
        megas = ent.nextDouble();
        System.out.print("Ingrese el costo de los megas: ");
        costoMegas = ent.nextDouble();

        PlanPostPagoMinutosMegas p04
                = new PlanPostPagoMinutosMegas(minutos,
                        costoMinutos, megas, costoMegas,
                        nombresPropietario,
                        apellidosPropietario, pasaportePropietario,
                        ciudadPropietario, barrioPropietario,
                        marcaCelular, modeloCelular, nroCelular);
        p04.calcularPagoMensual();

        return p04;
    }

}
