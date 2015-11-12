package zoo;

import java.util.Date;

public abstract class Mamifer extends Vertebrat implements ITerrestre{
    protected String familia;


    public Mamifer( String nom, int codi, int potes, Date data_naixement,Sexe sexe, String pell, int dentadura,String familia) {
        super(nom, codi, potes, data_naixement, pell, "Part", dentadura);
        this.familia = familia;
        this.sexe= sexe;
        this.tipus_sang=tipus_sang.CALENTA;
        
    }

    public String getFamilia() {
        return familia;
    }
    
    
    
    @Override
    public void corre() {
        System.out.println("El mamifer corre.");
    }
    
    @Override
    public String toString(){
        return super.toString()+" Sóc de la familia dels \""+getFamilia()+"\".";
    }
    
}
