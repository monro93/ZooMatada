package zoo;

import java.util.Date;

public class Aranya extends Artropode{
    private String forma;

    public Aranya(String nom, int codi, Date data_naixement, Sexe sexe, boolean verinos, boolean radioactiu, String forma) {
        super(nom, codi, 8, data_naixement, sexe, verinos, 8, radioactiu);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }
    
    
    @Override
    public void posa_ous(){
        System.out.println("L'aranya "+getNom()+" ha posat un ou");
    }
}
