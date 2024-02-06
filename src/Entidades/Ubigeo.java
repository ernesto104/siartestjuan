package Entidades;
// Generated 08/09/2016 08:30:14 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Ubigeo generated by hbm2java
 */
public class Ubigeo  implements java.io.Serializable {

    
     private Integer idubigeo;
     private String coddep;
     private String codpro;
     private String coddis;
     private String departamento;
     private String provincia;
     private String distrito;
     private Set cabeceses = new HashSet(0);
     private Set clienteses = new HashSet(0);
     private Set controls = new HashSet(0);

    public Ubigeo() {
    }

	
    public Ubigeo(String coddep, String codpro, String coddis, String departamento, String provincia, String distrito) {
        this.coddep = coddep;
        this.codpro = codpro;
        this.coddis = coddis;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }
    
    public Ubigeo(String coddep, String codpro, String coddis, String departamento, String provincia, String distrito, Set cabeceses, Set clienteses, Set controls) {
       this.coddep = coddep;
       this.codpro = codpro;
       this.coddis = coddis;
       this.departamento = departamento;
       this.provincia = provincia;
       this.distrito = distrito;
       this.cabeceses = cabeceses;
       this.clienteses = clienteses;
       this.controls = controls;
    }
   
    public Integer getIdubigeo() {
        return this.idubigeo;
    }
    
    public void setIdubigeo(Integer idubigeo) {
        this.idubigeo = idubigeo;
    }
    
    public String getCoddep() {
        return this.coddep;
    }
    
    public void setCoddep(String coddep) {
        this.coddep = coddep;
    }
    
    public String getCodpro() {
        return this.codpro;
    }
    
    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }
    
    public String getCoddis() {
        return this.coddis;
    }
    
    public void setCoddis(String coddis) {
        this.coddis = coddis;
    }
    
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String getDistrito() {
        return this.distrito;
    }
    
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    public Set getCabeceses() {
        return this.cabeceses;
    }
    
    public void setCabeceses(Set cabeceses) {
        this.cabeceses = cabeceses;
    }
    
    public Set getClienteses() {
        return this.clienteses;
    }
    
    public void setClienteses(Set clienteses) {
        this.clienteses = clienteses;
    }
    
    public Set getControls() {
        return this.controls;
    }
    
    public void setControls(Set controls) {
        this.controls = controls;
    }
}