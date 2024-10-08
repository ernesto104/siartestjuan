package Entidades;
// Generated 02/06/2016 07:13:03 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Vendedores generated by hbm2java
 */
public class Vendedores  implements java.io.Serializable {


     private Integer idvendedor;
     private String nombre;
     private String direccion;
     private String telefono;
     private String celular;
     private String documento;
     private String email;
     private double porcentajelima;
     private double porcentajeprov;
     private Set<Cabeces> cabeceses = new HashSet<Cabeces>(0);
     private Set<Cabecproformas> cabecproformases = new HashSet<Cabecproformas>(0);
     private Set<Cabecsalvar> cabecsalvars = new HashSet<Cabecsalvar>(0);

    public Vendedores() {
    }

	
    public Vendedores(double porcentajelima, double porcentajeprov) {
        this.porcentajelima = porcentajelima;
        this.porcentajeprov = porcentajeprov;
    }
    public Vendedores(String nombre, String direccion, String telefono, String celular, String documento, String email, double porcentajelima, double porcentajeprov, Set<Cabeces> cabeceses, Set<Cabecproformas> cabecproformases, Set<Cabecsalvar> cabecsalvars) {
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.celular = celular;
       this.documento = documento;
       this.email = email;
       this.porcentajelima = porcentajelima;
       this.porcentajeprov = porcentajeprov;
       this.cabeceses = cabeceses;
       this.cabecproformases = cabecproformases;
       this.cabecsalvars = cabecsalvars;
    }
   
    public Integer getIdvendedor() {
        return this.idvendedor;
    }
    
    public void setIdvendedor(Integer idvendedor) {
        this.idvendedor = idvendedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public double getPorcentajelima() {
        return this.porcentajelima;
    }
    
    public void setPorcentajelima(double porcentajelima) {
        this.porcentajelima = porcentajelima;
    }
    public double getPorcentajeprov() {
        return this.porcentajeprov;
    }
    
    public void setPorcentajeprov(double porcentajeprov) {
        this.porcentajeprov = porcentajeprov;
    }
    public Set<Cabeces> getCabeceses() {
        return this.cabeceses;
    }
    
    public void setCabeceses(Set<Cabeces> cabeceses) {
        this.cabeceses = cabeceses;
    }
    public Set<Cabecproformas> getCabecproformases() {
        return this.cabecproformases;
    }
    
    public void setCabecproformases(Set<Cabecproformas> cabecproformases) {
        this.cabecproformases = cabecproformases;
    }
    public Set<Cabecsalvar> getCabecsalvars() {
        return this.cabecsalvars;
    }
    
    public void setCabecsalvars(Set<Cabecsalvar> cabecsalvars) {
        this.cabecsalvars = cabecsalvars;
    }




}


