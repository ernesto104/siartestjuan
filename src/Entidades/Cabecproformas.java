package Entidades;
// Generated 02/06/2016 07:13:03 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cabecproformas generated by hbm2java
 */
public class Cabecproformas  implements java.io.Serializable {


     private Integer idcabproforma;
     private Vendedores vendedores;
     private PuntosVenta puntosventa;
     private Cabeces cabeces;
     private Clientes clientes;
     private String codigocabproforma;
     
     private int punterogrupo;
     
     private String referencia;
     private String marca;
     private String observaciones;
     private String modelo;
     private String serie;
     private String motor;
     private Date fecha;
     private String moneda;
     private Double total;
     private String estado;
     private String nrofactura;
     private Date fechafact;
     private String clientefact;
     private Double importebrutofact;
     private Double valorventafact;
     private Double igvfact;
     private Double totalfact;
     private String transportista;
     private String nroguia;
     private Date fechadespacho;

     private Set<Cabeces> cabeceses = new HashSet<Cabeces>(0);
     
    public Cabecproformas() {
    }

	
    public Cabecproformas(String codigocabproforma, int punterogrupo) {
        this.codigocabproforma = codigocabproforma;
        this.punterogrupo = punterogrupo;
    }
    public Cabecproformas(Vendedores vendedores, Cabeces cabeces, Clientes clientes, String codigocabproforma, 
            int punterogrupo, String referencia, String marca, String placa, String modelo, String serie, String motor, Date fecha, String moneda, Double total, String estado, String nrofactura, Date fechafact, String clientefact, Double importebrutofact, Double valorventafact, Double igvfact, Double totalfact, String transportista, String nroguia, Date fechadespacho,
    Set<Cabeces> cabeceses) {
       this.vendedores = vendedores;
       this.cabeces = cabeces;
       this.clientes = clientes;
       this.codigocabproforma = codigocabproforma;
       
       this.punterogrupo = punterogrupo;
       
       this.referencia = referencia;
       this.marca = marca;
       this.observaciones = placa;
       this.modelo = modelo;
       this.serie = serie;
       this.motor = motor;
       this.fecha = fecha;
       this.moneda = moneda;
       this.total = total;
       this.estado = estado;
       this.nrofactura = nrofactura;
       this.fechafact = fechafact;
       this.clientefact = clientefact;
       this.importebrutofact = importebrutofact;
       this.valorventafact = valorventafact;
       this.igvfact = igvfact;
       this.totalfact = totalfact;
       this.transportista = transportista;
       this.nroguia = nroguia;
       this.fechadespacho = fechadespacho;
       
       this.cabeceses = cabeceses;
    }
   
    public Integer getIdcabproforma() {
        return this.idcabproforma;
    }
    
    public void setIdcabproforma(Integer idcabproforma) {
        this.idcabproforma = idcabproforma;
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
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public String getCodigocabproforma() {
        return this.codigocabproforma;
    }
    
    public void setCodigocabproforma(String codigocabproforma) {
        this.codigocabproforma = codigocabproforma;
    }
    
    public int getPunterogrupo() {
        return this.punterogrupo;
    }
    
    public void setPunterogrupo(int punterogrupo) {
        this.punterogrupo = punterogrupo;
    }
    
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public String getMotor() {
        return this.motor;
    }
    
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getNrofactura() {
        return this.nrofactura;
    }
    
    public void setNrofactura(String nrofactura) {
        this.nrofactura = nrofactura;
    }
    public Date getFechafact() {
        return this.fechafact;
    }
    
    public void setFechafact(Date fechafact) {
        this.fechafact = fechafact;
    }
    public String getClientefact() {
        return this.clientefact;
    }
    
    public void setClientefact(String clientefact) {
        this.clientefact = clientefact;
    }
    public Double getImportebrutofact() {
        return this.importebrutofact;
    }
    
    public void setImportebrutofact(Double importebrutofact) {
        this.importebrutofact = importebrutofact;
    }
    public Double getValorventafact() {
        return this.valorventafact;
    }
    
    public void setValorventafact(Double valorventafact) {
        this.valorventafact = valorventafact;
    }
    public Double getIgvfact() {
        return this.igvfact;
    }
    
    public void setIgvfact(Double igvfact) {
        this.igvfact = igvfact;
    }
    public Double getTotalfact() {
        return this.totalfact;
    }
    
    public void setTotalfact(Double totalfact) {
        this.totalfact = totalfact;
    }
    public String getTransportista() {
        return this.transportista;
    }
    
    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }
    public String getNroguia() {
        return this.nroguia;
    }
    
    public void setNroguia(String nroguia) {
        this.nroguia = nroguia;
    }
    public Date getFechadespacho() {
        return this.fechadespacho;
    }
    
    public void setFechadespacho(Date fechadespacho) {
        this.fechadespacho = fechadespacho;
    }

    public Set<Cabeces> getCabeceses() {
        return this.cabeceses;
    }
    
    public void setCabeceses(Set<Cabeces> cabeceses) {
        this.cabeceses = cabeceses;
    }
}