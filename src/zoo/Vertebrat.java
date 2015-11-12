package zoo;

import java.util.Date;

public abstract class Vertebrat extends Animal{
    public enum Alimentacio{
        HERBIVORS,
        CARNIVORS,
        OMNIVORS
    };
    
    protected String pell;
    protected String tipus_naixement;
    protected int dentadura;

    public Vertebrat( String nom, int codi, int potes, Date data_naixement, Sexe sexe, tipus_sang tipus_sang,String pell, String tipus_naixement, int dentadura) {
        super(nom, codi, potes, data_naixement, sexe, tipus_sang);
        this.pell = pell;
        this.tipus_naixement = tipus_naixement;
        this.dentadura = dentadura;
    }

    public Vertebrat( String nom, int codi, int potes, Date data_naixement,String pell, String tipus_naixement, int dentadura) {
        super(nom, codi, potes, data_naixement);
        this.pell = pell;
        this.tipus_naixement = tipus_naixement;
        this.dentadura = dentadura;
    }

    public String getPell() {
        return pell;
    }

    public String getTipus_naixement() {
        return tipus_naixement;
    }

    public int getDentadura() {
        return dentadura;
    }

    @Override
    public String toString(){
        return super.toString()+"La meva pell és "+getPell()+
                ", neixo per "+getTipus_naixement()+", tinc "+getDentadura()+" dents.";
    }
 
 
    
}
