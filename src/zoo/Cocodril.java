package zoo;

import java.util.Date;

public class Cocodril extends Reptil implements IMaritim{
    protected double llargada; //metres!!
    protected double pes;

    public Cocodril( String nom, int codi, Date data_naixement, Sexe sexe,double llargada, double pes) {
        super(nom, codi, 4, data_naixement, sexe,"Escames", 80, false, false);
        this.llargada = llargada;
        this.pes = pes;
    }

    public double getLlargada() {
        return llargada;
    }

    public double getPes() {
        return pes;
    }

   

    @Override
    public void posa_ous() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("El cocodril posa ous");
    }

    @Override
    public void neda() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("El cocodril neda com un tronc ");
    }
    
    
}
