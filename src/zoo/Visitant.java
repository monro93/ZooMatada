package zoo;

import java.util.Date;

public class Visitant extends Persona{
    protected Date data_entrada_parc;

    public Visitant(int dni, String nom, String cognom,Date data_naixement, Date data_entrada) {
        super(dni, nom, cognom);
        this.data_entrada_parc = data_entrada;
        this.data_naixement = data_naixement;
    }

    public Visitant(int dni, String nom, String cognom, int telefon, Date data_naixement, String adreça,Date data_entrada) {
        super(dni, nom, cognom, telefon, data_naixement, adreça);
        this.data_entrada_parc = data_entrada;
    }

    
    
    
}
