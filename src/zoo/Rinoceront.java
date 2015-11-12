package zoo;

import java.util.Date;

public class Rinoceront extends Mamifer{
    protected boolean corn;
    protected double pes;

    public Rinoceront( String nom, int codi, Date data_naixement, Sexe sexe,boolean corn, double pes) {
        super(nom, codi, 4, data_naixement, sexe, "Gris", 21, "Cornuts");
        this.corn = corn;
        this.pes = pes;
    }

    public boolean teCorn() {
        return corn;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

  
    
    
}
