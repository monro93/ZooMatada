package zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Animal {
    static public enum Sexe{
        MASCLE ,
        FEMELLA,
        INDEFINIT
    }
    static public enum tipus_sang{
        CALENTA,
        FREDA
    }
    
    protected String nom;
    protected int codi;
    protected int potes;
    protected Date data_naixement;
    protected Date data_mort;
    protected Sexe sexe;
    protected tipus_sang tipus_sang;

    public Animal(String nom, int codi, int potes, Date data_naixement, Sexe sexe, tipus_sang tipus_sang) {
        this.nom = nom;
        this.codi = codi;
        this.potes = potes;
        this.data_naixement = data_naixement;
        this.sexe = sexe;
        this.tipus_sang = tipus_sang;
    }

    public Animal(String nom, int codi, int potes, Date data_naixement) {
        this.nom = nom;
        this.codi = codi;
        this.potes = potes;
        this.data_naixement = data_naixement;
    }

    public void setData_mort(Date data_mort) {
        this.data_mort = data_mort;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public void setTipus_sang(tipus_sang tipus_sang) {
        this.tipus_sang = tipus_sang;
    }
    

    public String getNom() {
        return nom;
    }

    public int getCodi() {
        return codi;
    }

    public int getPotes() {
        return potes;
    }

    public String getData_naixement() {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data_naixement);
        return "el "+gc.get(Calendar.DAY_OF_MONTH)+"/"+gc.get(Calendar.MONTH)+"/"+gc.get(Calendar.YEAR);
    }

    public Date getData_mort() {
        return data_mort;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public tipus_sang getTipus_sang() {
        return tipus_sang;
    }
    
    @Override
    public String toString(){
        String sexe, sexe2, sang, viu, tipus_animal;
        if(getSexe() == Sexe.MASCLE){
            sexe2 = "un";
            sexe = "sóc un mascle";
        }
        else if(getSexe() == Sexe.FEMELLA){
            sexe2 = "una";
            sexe = "sóc una femella";
        }
        else{
            sexe = "no sé de quin sexe sóc";
            sexe2 = "un";
        }
        
        if(getTipus_sang()==tipus_sang.CALENTA)
            sang = "sóc de sang calenta";
        else
            sang = "sóc de sang freda";
        
        if(getData_mort() == null){
            viu = " i estic al zoo.";
        }else
            viu = " i et parlo desde la ultratumba.";
        
        tipus_animal = this.getClass().getSimpleName();
        
        return "Sóc "+sexe2+" "+tipus_animal+" "+sang+" tinc "+this.getPotes()+" potes, em dic "
                +this.getNom()+" tinc el codi "+this.getCodi()+" i vaig neixer "
                +getData_naixement()+" "+sexe+viu+"\n";
    }
   
   
}

