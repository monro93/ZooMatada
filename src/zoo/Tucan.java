package zoo;

import java.util.Date;

public class Tucan extends Au{
    protected double mida_vec;

    public Tucan( String nom, int codi, Date data_naixement, Sexe sexe,double mida_vec) {
        super(nom, codi, data_naixement, sexe, "negre", 0);
        this.mida_vec = mida_vec;
    }

    public double getMida_vec() {
        return mida_vec;
    }
    
  
}
