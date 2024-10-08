/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Otros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Prueba {

    static String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tipoLetra = "RN - Renovación".substring(0, 2);
        System.out.println("tipoLetra:" + tipoLetra + ".");
        String cadena = "1,050.75";
        //String cadena = "1 050.75";
        cadena = cadena.replace(",", "");
        
        //String cadena = "1050.75";
        double valor = Double.parseDouble(cadena);
        System.out.println("valor:" + valor);
//        System.out.println("Nro serie:" + formatearNroSerie("1"));
        //jugarFechas();
//        buscarNumMes();
//        formatearAño();
//        separarDireccionEn2Lineas();
//        obtenerPrimeraLetra();
//          String mes = getNroMes2Digitos("Septiembre");
//        String mes = getNroMes2Digitos("Octubre");
//        String mes = getNroMes2Digitos("Noviembre");
//        System.out.println("Mes:" + mes);
    }
    
    private static String getNroMes2Digitos(String mes) {
        String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String numMes = "-1";
        for ( int i = 0; i < Meses.length; i++ ) {
            if ( mes.equals(Meses[i]) ) {
                if ( i < 9 ) {
                    numMes = "0" + (i + 1);
                } else {
                    numMes = "" + (i + 1);
                }
                break;
            }
        }
        return numMes;
    }
    
    private static void obtenerPrimeraLetra() {
//        String tipoDocumento = "Factura";
        String tipoDocumento = "Boleta";
        String tipDoc = tipoDocumento.substring(0,1);
        System.out.println("tipDoc:" + tipDoc);
    }
    
    private static void separarDireccionEn2Lineas() {
        String direccion = "CAL.LOS MELONES NRO. 170 URB. RESIDENCIAL MONTERRICO (ALT. 56 Y 57 DE LA AV. JAVIER PRADO) LIMA - LIMA - LA MOLINA";
        String direccionLinea1 = direccion.substring(0, 53);
        String direccionLinea2 = direccion.substring(53, direccion.length()) + ".";
        System.out.println("Dir. Linea 1:" + direccionLinea1);
        System.out.println("Dir. Linea 2:" + direccionLinea2);
    }
    
    private static void formatearAño() {
        String fechaEmision = "05/09/2016";
        String fe[] = fechaEmision.split("/");
        String dia = fe[0];
        String mesLetras = Fecha.getMesLetras(Integer.parseInt(fe[1]));
        String año2DigUlt = fe[2].substring(2, 4);
        String año4DigUlt = fe[2].substring(0, 4);
        System.out.println("año2DigUlt:" + año2DigUlt);
        System.out.println("año4DigUlt:" + año4DigUlt);
    }
    
    private static void buscarNumMes() {
        String mes = "Septiembre";
        System.out.println("Nro de mes de " + mes + ": " + getNroMes(mes));
    }
    
    public static String getNroMes(String mes) {
        String numMes = "-1";
        for ( int i = 0; i < Meses.length; i++ ) {
            if ( mes.equals(Meses[i]) ) {
                numMes = "" + (i + 1);
                break;
            }
        }
        return numMes;
    }

    private static String formatearNroSerie(String serie) {
        String nroSerie = "";
        int largo = 3 - serie.length();;
        for ( int i = 0; i < largo; i++ ) {
            nroSerie = nroSerie + "0";
        }
        nroSerie = nroSerie + serie;
        return nroSerie;
    }
    
    private static void jugarFechas() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateInString = "04/09/2016";
            Date dateEmision = formatter.parse(dateInString);
            System.out.println(dateEmision);

            String dia2Cifras = Fecha.getDia(dateEmision);
            String mesLetras = Fecha.getMes(dateEmision);
            String año = Fecha.getAnioUltimaCifra(dateEmision);
            String añoCompleto =Fecha.getAnio(dateEmision);

            System.out.println("dia2Cifras:" + dia2Cifras);
            System.out.println("mesLetras:" + mesLetras);
            System.out.println("año(ultima cifra):" + año);
            System.out.println("año completo:" + añoCompleto);

        } catch (ParseException | NumberFormatException ex) {
            System.out.println("Excepcion:" + ex.getMessage());
        }
    }
}
