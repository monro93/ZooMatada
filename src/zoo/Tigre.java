package zoo;

import java.util.Date;

public class Tigre extends Mamifer{
    protected String color;

    public Tigre( String nom, int codi, Date data_naixement, Sexe sexe,String color) {
        super(nom, codi, 4, data_naixement, sexe, "Ratllada", 16, "Tigreton");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

  
    
}
