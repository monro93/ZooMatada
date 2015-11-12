package zoo;

import java.util.Date;

public class Cranc extends Artropode implements IMaritim {
    private String color;
    private int força_pinça;

    public Cranc(String nom, int codi, Date data_naixement, Sexe sexe, String color, int força_pinça) {
        super(nom, codi, 10, data_naixement, sexe, false, 2, false);
        this.color = color;
        this.força_pinça = força_pinça;
    }
    
    @Override
    public void neda(){
        System.out.println("El cranc "+getNom()+"comença a caminar sota l'aigua i a cantar \"Debajo del mar\"");
    }
    
    @Override
    public void posa_ous(){
        System.out.println("El cranc "+getNom()+" ha posat un ou");
    }
    
    
}
