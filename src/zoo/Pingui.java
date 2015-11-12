package zoo;

import java.util.Date;

public class Pingui extends Au implements IMaritim{
    protected int velocitat_nedant;

    public Pingui( String nom, int codi, Date data_naixement, Sexe sexe,int velocitat_nedant) {
        super(nom, codi, data_naixement, sexe, "Adaptada a l'aigua", 50);
        this.velocitat_nedant = velocitat_nedant;
    }


    @Override
    public void neda() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("El pingüí neda.");
    }

    @Override
    public void vola() {
        System.out.println("El pingüí és torpe i no sap volar, però el de happy feet sap ballar :) ."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
