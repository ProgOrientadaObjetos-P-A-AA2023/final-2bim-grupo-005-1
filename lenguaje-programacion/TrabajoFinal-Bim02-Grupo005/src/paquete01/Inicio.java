package paquete01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete02.PlanCelular;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;
import paquete03.Enlace;

public class Inicio {
    private static Enlace en;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        ArrayList<PlanCelular> lista;
        int opcion;
        boolean bandera = true;
        en = new Enlace();

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
                    ingreso01();
                    break;
                case 2:
                    ingreso02();
                    break;
                case 3:
                    ingreso03();
                    break;
                case 4:
                    ingreso04();
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Error, esa opción no existe");
            }
        }

        en.establecerDataPostPagoMinMegEcono();
        en.establecerDataPostPagoMinMeg();
        en.establecerDataPostPagoMin();
        en.establecerDataPostPagoMegas();
        
        lista = en.obtenerLista();
        
        for (PlanCelular p : lista) {
            System.out.println(p);
        }
    }

    public static void ingreso01() {
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
        System.out.print("Ingrese los megas (EN GB): ");
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
        
        en.insertarPostPagoMinMegEcono(p01);
    }

    public static void ingreso02() {
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

        en.insertarPostPagoMin(p02);
    }

    public static void ingreso03() {
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
        System.out.print("Ingrese los megas (En GB): ");
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

        en.insertarPostPagoMegas(p03);
    }

    public static void ingreso04() {
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
        System.out.print("Ingrese los megas (en GB): ");
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

        en.insertarPostPagoMinMeg(p04);
    }

}
