package paquete03;

import java.util.ArrayList;
import paquete02.PlanCelular;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;

public class Enlace {

    private Connection conn;
    private ArrayList<PlanCelular> lista;
    
    public Enlace(){
        
    lista = new ArrayList<>();
    
    }

    public void establecerConexion() {
        try {
            String url = "jdbc:sqlite:bd/PlanCelular.db";
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPostPagoMinMegEcono(PlanPostPagoMinutosMegasEconomico p01) {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = String.format("INSERT INTO "
                    + "PostPagoMinMegEcono (nombres, apellidos, pasaporte, "
                    + "ciudad, barrio, marcaCel, modeloCel, numeroCel, "
                    + "pagoMensual, min, costoMin, megas, costoMegas, "
                    + "desc) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', "
                    + "'%s', %s, %s, %s, %s, %s, %s, %s)",
                    p01.obtenerNombresPropietario(),
                    p01.obtenerApellidosPropietario(),
                    p01.obtenerPasaportePropietario(),
                    p01.obtenerCiudadPropietario(),
                    p01.obtenerBarrioPropietario(),
                    p01.obtenerMarcaCelular(),
                    p01.obtenerModeloCelular(),
                    p01.obtenerNroCelular(),
                    p01.obtenerPagoMensual(),
                    p01.obtenerMinutos(),
                    p01.obtenerCostoMinutos(),
                    p01.obtenerMegas(),
                    p01.obtenerCostoMegas(),
                    p01.obtenerPorcDesc());

            statement.executeUpdate(instruccion);
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertarPostPagoMin(PlanPostPagoMinutos p02) {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = String.format("INSERT INTO "
                    + "PostPagoMin (nombres, apellidos, pasaporte, "
                    + "ciudad, barrio, marcaCel, modeloCel, numeroCel, "
                    + "pagoMensual, minNac, costoMinNac, minInter, costoMinInter) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', "
                    + "'%s', %s, %s, %s, %s, %s, %s)",
                    p02.obtenerNombresPropietario(),
                    p02.obtenerApellidosPropietario(),
                    p02.obtenerPasaportePropietario(),
                    p02.obtenerCiudadPropietario(),
                    p02.obtenerBarrioPropietario(),
                    p02.obtenerMarcaCelular(),
                    p02.obtenerModeloCelular(),
                    p02.obtenerNroCelular(),
                    p02.obtenerPagoMensual(),
                    p02.obtenerMinNacional(),
                    p02.obtenerCostoMinNacional(),
                    p02.obtenerMinInternacional(),
                    p02.obtenerCostoMinInternacional());

            statement.executeUpdate(instruccion);
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertarPostPagoMegas(PlanPostPagoMegas p03) {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = String.format("INSERT INTO "
                    + "PostPagoMegas (nombres, apellidos, pasaporte, "
                    + "ciudad, barrio, marcaCel, modeloCel, numeroCel, "
                    + "pagoMensual, megas, costoMegas, tarBase) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', "
                    + "'%s', %s, %s, %s, %s, %s)",
                    p03.obtenerNombresPropietario(),
                    p03.obtenerApellidosPropietario(),
                    p03.obtenerPasaportePropietario(),
                    p03.obtenerCiudadPropietario(),
                    p03.obtenerBarrioPropietario(),
                    p03.obtenerMarcaCelular(),
                    p03.obtenerModeloCelular(),
                    p03.obtenerNroCelular(),
                    p03.obtenerPagoMensual(),
                    p03.obtenerMegas(),
                    p03.obtenerCostoMegas(),
                    p03.obtenerTarifaBase());

            statement.executeUpdate(instruccion);
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertarPostPagoMinMeg(PlanPostPagoMinutosMegas p04) {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = String.format("INSERT INTO "
                    + "PostPagoMinMeg (nombres, apellidos, pasaporte, "
                    + "ciudad, barrio, marcaCel, modeloCel, numeroCel, "
                    + "pagoMensual, min, costoMin, megas, costoMegas) "
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', "
                    + "'%s', %s, %s, %s, %s, %s, %s)",
                    p04.obtenerNombresPropietario(),
                    p04.obtenerApellidosPropietario(),
                    p04.obtenerPasaportePropietario(),
                    p04.obtenerCiudadPropietario(),
                    p04.obtenerBarrioPropietario(),
                    p04.obtenerMarcaCelular(),
                    p04.obtenerModeloCelular(),
                    p04.obtenerNroCelular(),
                    p04.obtenerPagoMensual(),
                    p04.obtenerMinutos(),
                    p04.obtenerCostoMinutos(),
                    p04.obtenerMegas(),
                    p04.obtenerCostoMegas());

            statement.executeUpdate(instruccion);
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void establecerDataPostPagoMinMegEcono() {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = "SELECT * FROM PostPagoMinMegEcono";
            ResultSet rs = statement.executeQuery(instruccion);

            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico p01 = new PlanPostPagoMinutosMegasEconomico(
                        rs.getDouble("min"),
                        rs.getDouble("costoMin"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"),
                        rs.getDouble("desc"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numeroCel"));
                p01.calcularPagoMensual();
                lista.add(p01);
            }

            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void establecerDataPostPagoMin() {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = "SELECT * FROM PostPagoMin";
            ResultSet rs = statement.executeQuery(instruccion);

            while (rs.next()) {
                PlanPostPagoMinutos p02 = new PlanPostPagoMinutos(
                        rs.getDouble("minNac"),
                        rs.getDouble("costoMinNac"),
                        rs.getDouble("minInter"),
                        rs.getDouble("costoMinInter"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numeroCel"));
                p02.calcularPagoMensual();
                lista.add(p02);
            }

            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void establecerDataPostPagoMegas() {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = "SELECT * FROM PostPagoMegas";
            ResultSet rs = statement.executeQuery(instruccion);

            while (rs.next()) {
                PlanPostPagoMegas p03 = new PlanPostPagoMegas(
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"),
                        rs.getDouble("tarBase"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numeroCel"));
                p03.calcularPagoMensual();
                lista.add(p03);
            }

            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void establecerDataPostPagoMinMeg() {
        try {
            establecerConexion();
            Statement statement = conn.createStatement();

            String instruccion = "SELECT * FROM PostPagoMinMeg";
            ResultSet rs = statement.executeQuery(instruccion);

            while (rs.next()) {
                PlanPostPagoMinutosMegas p04 = new PlanPostPagoMinutosMegas(
                        rs.getDouble("min"),
                        rs.getDouble("costoMin"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numeroCel"));
                p04.calcularPagoMensual();
                lista.add(p04);
            }

            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<PlanCelular> obtenerLista() {
        return lista;
    }
}
