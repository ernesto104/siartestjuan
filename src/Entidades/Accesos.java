package Entidades;
// Generated 22/05/2016 09:39:11 AM by Hibernate Tools 3.6.0



/**
 * Accesos generated by hbm2java
 */
public class Accesos  implements java.io.Serializable {


     private AccesosId id;
     private Programas programas;
     private Roles roles;

    public Accesos() {
    }

	
    public Accesos(AccesosId id) {
        this.id = id;
    }
    public Accesos(AccesosId id, Programas programas, Roles roles) {
       this.id = id;
       this.programas = programas;
       this.roles = roles;
    }
   
    public AccesosId getId() {
        return this.id;
    }
    
    public void setId(AccesosId id) {
        this.id = id;
    }
    public Programas getProgramas() {
        return this.programas;
    }
    
    public void setProgramas(Programas programas) {
        this.programas = programas;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }




}


