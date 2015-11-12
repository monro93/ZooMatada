
package zoo;
import java.util.Date;

public class Treballador extends Persona {
    
    protected double sou;
    protected Date data_alta ;
    protected String titulacio;

    public Treballador(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio) {
        super(dni, nom, cognom);
        this.sou = sou;
        this.data_alta = data_alta;
        this.titulacio = titulacio;
    }

    public Treballador( int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça) {
        super(dni, nom, cognom, telefon, data_naixement, adreça);
        this.sou = sou;
        this.data_alta = data_alta;
        this.titulacio = titulacio;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    public double getSou() {
        return sou;
    }

}
