package Entidades;
// Generated 17/09/2013 02:56:16 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tipocambio generated by hbm2java
 */
public class Tipocambio  implements java.io.Serializable {


     private Date fecha;
     private Double valorcompra;
     private Double valorventa;
     private Set cabeceses = new HashSet(0);

    public Tipocambio() {
    }
    public Tipocambio(Double valorcompra, Double valorventa) {      
       this.valorcompra = valorcompra;
       this.valorventa = valorventa;       
    }
	
    public Tipocambio(Date fecha) {
        this.fecha = fecha;
    }
    public Tipocambio(Date fecha, Double valorcompra, Double valorventa, Set cabeceses) {
       this.fecha = fecha;
       this.valorcompra = valorcompra;
       this.valorventa = valorventa;
       this.cabeceses = cabeceses;
    }
   
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Double getValorcompra() {
        return this.valorcompra;
    }
    
    public void setValorcompra(Double valorcompra) {
        this.valorcompra = valorcompra;
    }
    public Double getValorventa() {
        return this.valorventa;
    }
    
    public void setValorventa(Double valorventa) {
        this.valorventa = valorventa;
    }
    public Set getCabeceses() {
        return this.cabeceses;
    }
    
    public void setCabeceses(Set cabeceses) {
        this.cabeceses = cabeceses;
    }




}


