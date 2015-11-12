package zoo;

import java.util.Date;

public abstract class Invertebrat extends Animal {
    protected Boolean es_verinos;
    protected int ulls;

    public Invertebrat(String nom, int codi, int potes, Date data_naixement, Sexe sexe, Boolean verinos, int ulls) {
        super(nom, codi, potes, data_naixement);
        this.es_verinos = verinos;
        this.ulls = ulls;
        this.setSexe(sexe);
        this.setTipus_sang(tipus_sang.FREDA);
    }
    public Invertebrat(String nom, int codi, int potes, Date data_naixement, Boolean verinos, int ulls) {
        super(nom, codi, potes, data_naixement);
        this.es_verinos = verinos;
        this.ulls = ulls;
        this.setTipus_sang(tipus_sang.FREDA);
    }

    public Boolean es_verinos() {
        return es_verinos;
    }

    public int getUlls() {
        return ulls;
    }
    
     @Override
    public String toString(){
        String verinos;
        if(es_verinos()){
            verinos= "Sóc verinós";
        }else{
            verinos = "Si et mossego no t'enverino";
        }
        return super.toString()+verinos+" tinc "+this.getUlls()+" ulls.";
    }
    
}
