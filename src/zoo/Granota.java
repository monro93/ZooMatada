
package zoo;

import java.util.Date;


public class Granota extends Amfibi {
    public String color;

    public Granota( String nom, int codi, Date data_naixement,Sexe sexe, Boolean es_verinos,String color) {
        super(nom, codi, 4, data_naixement, "Viscosa", 0, es_verinos);
        this.color = color;
        this.sexe = sexe;
    }

  

  
    public String getColor() {
        return color;
    }

    
    
    @Override
    public void neda(){
      System.out.println("La granota neda");
    }
    
    @Override
    public void posa_ous(){
        System.out.println("La granota posa ous");
    }

    @Override
    public void salta() {
        System.out.println("La granota "+this.getNom() +" salta molt alt! ");
    }
  
    
    
}
