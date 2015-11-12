package zoo;

import java.util.Date;

public class Lloro extends Au {
    protected boolean parla;
    protected int num_paraules;

    public Lloro( String nom, int codi, Date data_naixement, Sexe sexe,boolean parla, int num_paraules) {
        super(nom, codi, data_naixement, sexe, "plumes",0);
        this.parla = parla;
        this.num_paraules = num_paraules;
        if(!parla)
            this.num_paraules = 0;
    }

    public boolean parla() {
        return parla;
    }

    public void setParla(boolean parla) {
        this.parla = parla;
    }

    public int getNum_paraules() {
        return num_paraules;
    }

    public void setNum_paraules(int num_paraules) {
        this.num_paraules = num_paraules;
        if(!parla){
            this.num_paraules = 0;
            System.out.println("eeaaahh!!!! No sé parlar. Ensenya'm primer");
        }
    }

    /* public void ensenyaparaules(){
    
    }
    */
    
}
