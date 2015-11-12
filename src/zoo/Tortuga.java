package zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tortuga extends Reptil{
    protected int anys;

    public Tortuga( String nom, int codi, Date data_naixement, Sexe sexe) {
        super(nom, codi, 4, data_naixement, sexe, "Rugosa", 16, false, false);
        Date data_actual = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data_actual);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(data_naixement);
        this.anys=gc2.get(Calendar.YEAR)-gc.get(Calendar.YEAR);
    }

    public int getAnys() {
        actualitzaAnys();
        return anys;
    }

  
    private void actualitzaAnys(){
        Date data_actual = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data_actual);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(data_naixement);
        this.anys=gc2.get(Calendar.YEAR)-gc.get(Calendar.YEAR);
    
    }
    
    @Override
    public void posa_ous() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("La tortuga posa ous.");
    }
    
    
}
