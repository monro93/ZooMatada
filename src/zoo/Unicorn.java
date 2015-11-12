package zoo;

import java.util.Date;

public class Unicorn extends Mamifer implements IVolador{
    protected double llargada_banya;
    protected boolean coneix_gandalf;

    public Unicorn( String nom, int codi, Date data_naixement, Sexe sexe, double llargada_banya, boolean coneix_gandalf) {
        super(nom, codi, 4, data_naixement, sexe, "Rosa", 300, "Pokemon secret");
        this.llargada_banya = llargada_banya;
        this.coneix_gandalf = coneix_gandalf;
    }

    public double getLlargada_banya() {
        return llargada_banya;
    }

    public boolean coneix_gandalf() {
        return coneix_gandalf;
    }

    public void setConeix_gandalf(boolean coneix_gandalf) {
        this.coneix_gandalf = coneix_gandalf;
    }

    
    
    
    @Override
    public void vola() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("es volador");
    }

    
    
    
}
