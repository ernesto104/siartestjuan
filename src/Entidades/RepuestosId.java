package Entidades;
// Generated 17/09/2013 02:56:16 PM by Hibernate Tools 3.2.1.GA



/**
 * RepuestosId generated by hbm2java
 */
public class RepuestosId  implements java.io.Serializable {

    private int idrepuesto;
    private int idequipo;

    public RepuestosId() {
    }
    
    public RepuestosId(int idrepuesto) {
       this.idrepuesto = idrepuesto;       
    }
    
    public RepuestosId(int idrepuesto, int idlinea) {
       this.idrepuesto = idrepuesto;
       this.idequipo = idlinea;
    }
   
    public int getIdrepuesto() {
        return this.idrepuesto;
    }
    
    public void setIdrepuesto(int idrepuesto) {
        this.idrepuesto = idrepuesto;
    }
    
    public int getIdequipo() {
        return this.idequipo;
    }
    
    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof RepuestosId) ) return false;
         RepuestosId castOther = ( RepuestosId ) other; 
         
         return (this.getIdrepuesto()==castOther.getIdrepuesto())
                 && (this.getIdequipo()==castOther.getIdequipo());
    }
   
    public int hashCode() {
         int result = 17;     
         result = 37 * result + this.getIdrepuesto();
         result = 37 * result + this.getIdequipo();
         return result;
    }
}