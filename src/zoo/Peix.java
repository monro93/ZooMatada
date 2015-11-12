
package zoo;

import java.util.Date;


public class Peix extends Vertebrat implements IMaritim {
   
    protected String color;
    protected int num_aletes;

    public Peix( String nom, int codi, Date data_naixement, String pell, int dentadura,String color,int num_aletes) {
        super(nom, codi, 0, data_naixement, pell, "Ous", dentadura);
        this.color = color;
        this.num_aletes=num_aletes;
    }

   
   
    public String getColor() {
        return color;
    }

    public int getNum_aletes() {
        return num_aletes;
    }
    
    
    
    @Override
    public void neda(){
        System.out.println("El peix neda");
    }
    
      @Override
    public String toString(){
        return super.toString()+"Sóc de color: "+this.getColor()+" i tinc "+this.getNum_aletes()+" aletes.";
    }
    
    
}
