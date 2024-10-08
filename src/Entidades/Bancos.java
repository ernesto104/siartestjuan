package Entidades;
// Generated 17/09/2013 02:56:16 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Bancos generated by hbm2java
 */
public class Bancos  implements java.io.Serializable {


     private Integer idbanco;
     private String nombre;
     private String funcionario;
     private String telefono;
     private String celular;
     private String siglas;
     private String banco;
     private Set pagoses = new HashSet(0);
     private Set cabeceses = new HashSet(0);

    public Bancos() {
    }

    public Bancos(String nombre, String funcionario, String telefono, String celular, String siglas, String banco, Set pagoses, Set cabeceses) {
       this.nombre = nombre;
       this.funcionario = funcionario;
       this.telefono = telefono;
       this.celular = celular;
       this.siglas = siglas;
       this.banco = banco;
       this.pagoses = pagoses;
       this.cabeceses = cabeceses;
    }
   
    public Integer getIdbanco() {
        return this.idbanco;
    }
    
    public void setIdbanco(Integer idbanco) {
        this.idbanco = idbanco;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
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
    public String getSiglas() {
        return this.siglas;
    }
    
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    public Set getPagoses() {
        return this.pagoses;
    }
    
    public void setPagoses(Set pagoses) {
        this.pagoses = pagoses;
    }
    public Set getCabeceses() {
        return this.cabeceses;
    }
    
    public void setCabeceses(Set cabeceses) {
        this.cabeceses = cabeceses;
    }

    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }
}