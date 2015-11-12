package zoo;

import java.util.Date;

public class Irukandi extends Celenterat{
    private int gent_morta;

    public Irukandi(String nom, int codi, Date data_naixement, String color) {
        super(nom, codi, 0, data_naixement, color);
    }

    public int getGent_morta() {
        return gent_morta;
    }
    
    public void haMatat(int numPersones){
        gent_morta= gent_morta + numPersones;
        System.out.println("El irukandi "+getNom()+ "ha matat "+numPersones+".Número total morts "+getGent_morta());
    }
    
    @Override
    public void neda(){
        System.out.println("El irukandi "+getNom()+" neda de banda a banda.");
    }
    
    
    
}
