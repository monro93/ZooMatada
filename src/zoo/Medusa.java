package zoo;

import java.util.Date;

public class Medusa extends Celenterat {
    private int num_tentacles;

    public Medusa(String nom, int codi, Date data_naixement, String color, int num_tentacles ) {
        super(nom, codi, 0, data_naixement, color);
        this.num_tentacles = num_tentacles;
    }

    public int getNum_tentacles() {
        return num_tentacles;
    }
    
    public void perdTentacles(int num){
        if((num_tentacles - num) >=0){
            num_tentacles = num_tentacles - num;
            System.out.println("La pobre medusa "+getNom()+"ha perdut "+num+" tentacles, només li queden "+getNum_tentacles()+".");
        }else{
            System.out.println("La medusa "+getNom()+" no pot tindre tentacles negatius.");
        }
    }
    
    
    
    
    @Override
    public void neda(){
        System.out.println("La medusa "+getNom()+" neda de banda a banda.");
    }
    
}
