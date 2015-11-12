
package zoo;

import java.util.Date;

public abstract class Amfibi extends Vertebrat implements IMaritim, IOvipar{

    protected Boolean es_verinos;

    public Amfibi( String nom, int codi, int potes, Date data_naixement, String pell, int dentadura,Boolean es_verinos) {
        super(nom, codi, potes, data_naixement, pell, "Ous", dentadura);
        this.es_verinos = es_verinos;
    }

    public Boolean es_verinos() {
        return es_verinos;
    }

   public abstract void salta();
    
    @Override
    public void neda(){
      System.out.println("L'Amfibi neda");
    }
    
    @Override
    public void posa_ous(){
        System.out.println("L'Amfibi posa ous");
    }

    
      @Override
    public String toString(){
        String verinos;
        if(es_verinos()){
            verinos= "Sóc verinós";
        }else{
            verinos = "Si et mossego no t'enverino";
        }
        return super.toString()+verinos;
    }
    
    
    
}
