package zoo;

import java.util.Date;

public class Estruç extends Au implements ITerrestre{
    protected int velocitat;

    public Estruç(String nom, int codi, Date data_naixement, Sexe sexe, int velocitat) {
        super(nom, codi, data_naixement, sexe, "plumes", 0);
        this.velocitat = velocitat;
    }

    public int getVelocitat() {
        return velocitat;
    }


    @Override
    public void corre() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("L'estruç corre.");
    }
    
    
    
}
