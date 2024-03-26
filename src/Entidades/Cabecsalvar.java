package Entidades;
// Generated 12/02/2015 11:17:20 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cabecsalvar generated by hbm2java
 */
public class Cabecsalvar  implements java.io.Serializable {


     private Integer idsalida;
     private Vendedores vendedores;
     private PuntosVenta puntosventa;
     
     private Sucursales sucursales;
     
     private Cabeces cabeces;
     private Usuarios usuarios;
     private Clientes clientes;
     private String codigosalida;
     
     private String tipotrask;
     private String tipodocsk;
     private String nroseriesk;
     
     private String moneda;
     
     private Date fecha;
     private Double valorventa;
     private Double igv;
     private Double total;
     private String observacion;
     private Set<Detallees> detalleeses = new HashSet<Detallees>(0);
     
     private Set<Pagos> pagoses = new HashSet<Pagos>(0);

    public Cabecsalvar() {
    }

    public Cabecsalvar(String tipotrask, String tipodocsk, String nroseriesk, String moneda, String observacion) {
        this.tipotrask = tipotrask;
        this.tipodocsk = tipodocsk;
        this.nroseriesk = nroseriesk;
        this.moneda = moneda;
        this.observacion = observacion;
    }
    
    public Cabecsalvar(Vendedores vendedores, 
                       Sucursales sucursales, 
                       Cabeces cabeces, Usuarios usuarios, Clientes clientes, String codigosalida, String tipotrask, String tipodocsk, String nroseriesk, 
                       String moneda, Date fecha, Double valorventa, Double igv, Double total, String observacion) {
       this.vendedores = vendedores;
       
       this.sucursales = sucursales;
       
       this.cabeces = cabeces;
       this.clientes = clientes;
       this.usuarios = usuarios;
       this.codigosalida = codigosalida;
       this.tipotrask = tipotrask;
       this.tipodocsk = tipodocsk;
       this.nroseriesk = nroseriesk;
       
       this.moneda = moneda;
       
       this.fecha = fecha;
       this.valorventa = valorventa;
       this.igv = igv;
       this.total = total;
       this.observacion = observacion;
       
//       this.detalleeses = detalleeses;       
//       this.pagoses = pagoses;
    }
    
    public Integer getIdsalida() {
        return this.idsalida;
    }
    
    public void setIdsalida(Integer idsalida) {
        this.idsalida = idsalida;
    }
    public Vendedores getVendedores() {
        return this.vendedores;
    }
    
    public void setVendedores(Vendedores vendedores) {
        this.vendedores = vendedores;
    }
    
    public PuntosVenta getPuntosventa() {
        return puntosventa;
    }

    public void setPuntosventa(PuntosVenta puntosventa) {
        this.puntosventa = puntosventa;
    }
    
    public Cabeces getCabeces() {
        return this.cabeces;
    }
    
    public void setCabeces(Cabeces cabeces) {
        this.cabeces = cabeces;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public String getCodigosalida() {
        return this.codigosalida;
    }
    
    public void setCodigosalida(String codigosalida) {
        this.codigosalida = codigosalida;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Double getValorventa() {
        return this.valorventa;
    }
    
    public void setValorventa(Double valorventa) {
        this.valorventa = valorventa;
    }
    public Double getIgv() {
        return this.igv;
    }
    
    public void setIgv(Double igv) {
        this.igv = igv;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Set<Detallees> getDetalleeses() {
        return this.detalleeses;
    }
    
    public void setDetalleeses(Set<Detallees> detalleeses) {
        this.detalleeses = detalleeses;
    }

    public String getTipotrask() {
        return tipotrask;
    }

    public void setTipotrask(String tipotrask) {
        this.tipotrask = tipotrask;
    }

    public String getTipodocsk() {
        return tipodocsk;
    }

    public void setTipodocsk(String tipodocsk) {
        this.tipodocsk = tipodocsk;
    }

    public String getNroseriesk() {
        return nroseriesk;
    }

    public void setNroseriesk(String nroseriesk) {
        this.nroseriesk = nroseriesk;
    }
 
    public Set<Pagos> getPagoses() {
        return this.pagoses;
    }
    
    public void setPagoses(Set<Pagos> pagoses) {
        this.pagoses = pagoses;
    }
    
    public Sucursales getSucursales() {
        return this.sucursales;
    }
    
    public void setSucursales(Sucursales sucursales) {
        this.sucursales = sucursales;
    }
}