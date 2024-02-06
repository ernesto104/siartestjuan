/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.CuentasxCobrar;

import Entidades.Cabeces;
import Entidades.Cabecsalvar;
import Mantenimiento.CuentasxCobrar.SalidasVariasDAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author keily
 */
public class Servicio_CobrarSalidasVarias {

    SalidasVariasDAO dao;
    
    
    public Servicio_CobrarSalidasVarias() {
        dao = new SalidasVariasDAO();
    }    
    
    public List Listar_Cuentas_x_Cobrar() {
        List dd= dao.Listar_Cuentas_x_Cobrar();
        return dao.Listar_Cuentas_x_Cobrar();
    }    
    
     public Cabecsalvar obtenerPorCodSal(int codSalida){
        return dao.obtenerSalVarCodSalida(codSalida);
    }
    
    public List<Cabeces> Listar_Cuentas_General() {
        return dao.Listar_Cuentas_General();
    }
    
    public List Listar_Cuentas_xCobrar_Cliente(int id) {
        return dao.Listar_Cuentas_xCobrar_Cliente(id);
    }
    
    public List Listar_Cuentas_General_Cliente(int id) {
        return dao.Listar_Cuentas_General_Cliente(id);
    }
    
    public List Listar_Cuentas_xCobrar_Plaza(String plaza) {
        return dao.Listar_Cuentas_xCobrar_Plaza(plaza);
    }
    
    public List Listar_Cuentas_General_Plaza(String plaza) {
        return dao.Listar_Cuentas_General_Plaza(plaza);
    }
    
    public List Listar_Cuentas_xCobrar_Vendedor(String vendedor) {
        return dao.Listar_Cuentas_xCobrar_Vendedor(vendedor);
    }
    
    public List Listar_Cuentas_General_Vendedor(String vendedor) {
        return dao.Listar_Cuentas_General_Vendedor(vendedor);
    }
    
    public List Listar_Cuentas_xCobrar_Factura(String fac) {
        return dao.Listar_Cuentas_xCobrar_Factura(fac);
    }
    
    public List Listar_Cuentas_General_Factura(String fac) {
        return dao.Listar_Cuentas_General_Factura(fac);
    }
    
    public List Listar_Cuentas_xCobrar_Fecha(Date fecha) {
        return dao.Listar_Cuentas_xCobrar_Fecha(fecha);
    }
    
    public List Listar_Cuentas_General_Fecha(Date fecha) {
        return dao.Listar_Cuentas_General_Fecha(fecha);
    }
    
    public List Listar_Cuentas_xCobrar_Monto(String monto) {
        return dao.Listar_Cuentas_xCobrar_Monto(monto);
    }
    
    public List Listar_Cuentas_General_Monto(String monto) {
        return dao.Listar_Cuentas_General_Monto(monto);
    }
    
    
}
