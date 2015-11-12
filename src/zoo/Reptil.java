package zoo;

import java.util.Date;

public abstract class Reptil extends Vertebrat implements IOvipar{
    protected boolean es_verinos;
    protected boolean canvi_pell;

    public Reptil( String nom, int codi, int potes, Date data_naixement, Sexe sexe, tipus_sang tipus_sang, String pell, int dentadura,boolean es_verinos, boolean canvi_pell) {
        super(nom, codi, potes, data_naixement, sexe, tipus_sang, pell, "Ous", dentadura);
        this.es_verinos = es_verinos;
        this.canvi_pell = canvi_pell;
    }
    
       public Reptil( String nom, int codi, int potes, Date data_naixement, Sexe sexe, String pell, int dentadura,boolean es_verinos, boolean canvi_pell) {
        super(nom, codi, potes, data_naixement, pell, "Ous", dentadura);
        this.es_verinos = es_verinos;
        this.canvi_pell = canvi_pell;
        this.sexe=sexe;
        this.tipus_sang=tipus_sang.FREDA;
    }
    

    public boolean es_verinos() {
        return es_verinos;
    }

    public boolean faCanvi_pell() {
        return canvi_pell;
    }

    @Override
    public void posa_ous() {
        System.out.println("El rèptil posa ous");
    }

      @Override
    public String toString(){
        String verinos, pell;
        if(es_verinos()){
            verinos= "Sóc verinós";
        }else{
            verinos = "Si et mossego no t'enverino";
        }
        
        if(faCanvi_pell()){
            pell=" mudo de pell.";
        }else{
            pell=" no mudo la pell.";
        }
        
        return super.toString()+verinos+pell;
    }
    
    
}
