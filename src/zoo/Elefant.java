package zoo;

import java.text.DecimalFormat;
import java.util.Date;

public class Elefant extends Mamifer {
    protected double pes;
    protected double mida_trompa;

    public Elefant(String nom, int codi, Date data_naixement, Sexe sexe, double pes, double mida_trompa) {
        super(nom, codi, 4, data_naixement, sexe, "rugosa", 2, "Elefantus trompatus");
        this.pes = pes;
        this.mida_trompa = mida_trompa;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public void setMida_trompa(double mida_trompa) {
        this.mida_trompa = mida_trompa;
    }

    public double getPes() {
        return pes;
    }

    public double getMida_trompa() {
        return mida_trompa;
    }

    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return super.toString()+" Peso "+df.format(getPes())+" kg, la meva trompa medeix "+df.format(getMida_trompa())+"m muahahaha.";
    }
    
    
}
