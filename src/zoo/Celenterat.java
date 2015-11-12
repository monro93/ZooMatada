package zoo;

import java.util.Date;

public abstract class Celenterat extends Invertebrat implements IMaritim{
  private String color;

    public Celenterat(String nom, int codi, int potes, Date data_naixement, String color) {
        super(nom, codi, potes, data_naixement, true, 0);
        this.sexe = sexe.INDEFINIT;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public void neda(){
        System.out.println("El celenterat "+getNom()+" neda de banda a banda.");
    }
    
   @Override
    public String toString(){
        return super.toString()+"Sóc de color: "+this.getColor()+".";
    }
  
  
  
}
