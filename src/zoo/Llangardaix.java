package zoo;

import java.util.Date;

public class Llangardaix extends Reptil{
    protected boolean te_foc;
    protected String color;

    public Llangardaix( String nom, int codi, Date data_naixement, Sexe sexe, boolean es_verinos,boolean te_foc, String color) {
        super(nom, codi, 4, data_naixement, sexe, "Rugosa",11, es_verinos, false);
        this.color = color;
        this.te_foc = te_foc;
        if(te_foc){
            this.color="Vermell";
            this.nom="Charmander";
        }
        
    }

    public boolean te_foc() {
        return te_foc;
    }

    public String getColor() {
        return color;
    }

 
   @Override
    public void posa_ous() {
        System.out.println("El Llangardaix posa ous");
    }
    
}
