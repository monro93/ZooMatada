package zoo;

import java.util.Date;

public abstract class  Artropode extends Invertebrat implements IOvipar{
    
   private boolean es_radioactiu;

    public Artropode(String nom, int codi, int potes, Date data_naixement, Sexe sexe, Boolean verinos, int ulls, boolean radioactiu) {
        super(nom, codi, potes, data_naixement, sexe, verinos, ulls);
        this.es_radioactiu = radioactiu;
    }

    public boolean es_radioactiu() {
        return es_radioactiu;
    }
   
    
    
      @Override
      public void posa_ous(){
          System.out.println("L'artropode "+getNom()+" ha posat un ou.");
      }
   
       @Override
    public String toString(){
        String radioactiu;
        if(es_radioactiu()){
            radioactiu= "Sóc radioactiu.";
        }else{
            radioactiu = "No sóc radioactiu.";
        }
        return super.toString()+radioactiu;
    }
}
