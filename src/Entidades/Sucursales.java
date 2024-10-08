package Entidades;
// Generated 17/09/2013 02:56:16 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursales generated by hbm2java
 */
public class Sucursales  implements java.io.Serializable {


     private Integer idsucursal;
     private Clientes clientes;
     private String direccion;
     private String plaza;
     private Set cabeceses = new HashSet(0);
     
     private Set cabecsalvars = new HashSet(0);

    public Sucursales() {
    }

    public Sucursales(Clientes clientes, String direccion, String plaza, Set cabeceses, Set cabecsalvars) {
       this.clientes = clientes;
       this.direccion = direccion;
       this.plaza = plaza;
       this.cabeceses = cabeceses;
       
       this.cabecsalvars = cabecsalvars;
    }
   
    public Integer getIdsucursal() {
        return this.idsucursal;
    }
    
    public void setIdsucursal(Integer idsucursal) {
        this.idsucursal = idsucursal;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPlaza() {
        return this.plaza;
    }
    
    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public Set getCabeceses() {
        return this.cabeceses;
    }
    
    public void setCabeceses(Set cabeceses) {
        this.cabeceses = cabeceses;
    }

    public String toString(){
        return plaza;
    }

    public Set getCabecsalvars() {
        return this.cabecsalvars;
    }
    
    public void setCabecsalvars(Set cabecsalvars) {
        this.cabecsalvars = cabecsalvars;
    }
}