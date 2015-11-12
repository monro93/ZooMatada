package zoo;

import java.util.Date;

public class Gorila extends Mamifer{
    protected String color;

    public Gorila( String nom, int codi, Date data_naixement, Sexe sexe,String color) {
        super(nom, codi, 2, data_naixement, sexe, "Peluda", 32, "Casi humans");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    
}
