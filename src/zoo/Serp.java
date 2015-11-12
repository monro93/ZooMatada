package zoo;

import java.util.Date;

public class Serp extends Reptil{
    protected Date data_muda;
    protected String color;

    public Serp( String nom, int codi, Date data_naixement, Sexe sexe,  boolean es_verinos,Date data_muda, String color) {
        super(nom, codi, 0, data_naixement, sexe, "Escames", 0, es_verinos, true);
        this.data_muda = data_muda;
        this.color = color;
    }

    public Date getData_muda() {
        return data_muda;
    }

    public String getColor() {
        return color;
    }


    @Override
    public void posa_ous() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("La serp posa ous.");
    }
    
    
}
