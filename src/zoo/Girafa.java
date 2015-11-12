package zoo;

import java.util.Date;

public class Girafa extends Mamifer{
    protected double mida_coll;

    public Girafa( String nom, int codi, Date data_naixement, Sexe sexe, double mida_coll) {
        super(nom, codi, 4, data_naixement, sexe, "Amb taques", 15, "Girafus cuellus largus");
        this.mida_coll = mida_coll;
    }

    public double getMida_coll() {
        return mida_coll;
    }

    public void setMida_coll(double mida_coll) {
        this.mida_coll = mida_coll;
    }

 
}
