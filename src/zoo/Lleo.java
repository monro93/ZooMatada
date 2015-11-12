
package zoo;

import java.util.Date;

public class Lleo extends Mamifer {
    protected int hores_que_dorm;

    public Lleo( String nom, int codi, Date data_naixement, Sexe sexe,int hores_que_dorm) {
        super(nom, codi, 4, data_naixement, sexe, "Clara", 20, "El rei de la selva");
        this.hores_que_dorm = hores_que_dorm;
    }

    public int getHores_que_dorm() {
        return hores_que_dorm;
    }

    public void setHores_que_dorm(int hores_que_dorm) {
        this.hores_que_dorm = hores_que_dorm;
    }

   
    
    
}
