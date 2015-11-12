package zoo;

import java.util.Date;

public class Zebra extends Mamifer{
    protected int num_lines;

    public Zebra( String nom, int codi, Date data_naixement, Sexe sexe,  int num_lines) {
        super(nom, codi, 4, data_naixement, sexe, "Blanc i negre", 25, "Pas de zebra");
        this.num_lines = num_lines;
    }

    public int getNum_lines() {
        return num_lines;
    }

  
    
}
