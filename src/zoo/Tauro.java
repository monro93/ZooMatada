
package zoo;

import java.util.Date;


public class Tauro extends Peix {

    private final double pes;

    public Tauro( String nom, int codi, Date data_naixement,String color, double pes) {
        super(nom, codi, data_naixement, "Escames", 200, color, 2);

        this.pes = pes;
    }



    public double getPes() {
        return pes;
    }

    
    @Override
    public void neda() {
        System.out.println("El tauró neda" );
    }
    
}
