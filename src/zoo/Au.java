package zoo;

import java.util.Date;

public abstract class Au extends Vertebrat implements IVolador {


    public Au(String nom, int codi, Date data_naixement, Sexe sexe, String pell, int dentadura) {
        super(nom, codi, 2, data_naixement, pell, "ous", dentadura);
        this.sexe=sexe;
        this.tipus_sang=tipus_sang.CALENTA;
    }

   

    @Override
    public void vola() {
        System.out.println("L'Au vola.");
    }
    
  
    
}

