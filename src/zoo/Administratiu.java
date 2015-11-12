
package zoo;

import java.util.Date;

public class Administratiu extends Treballador {

    public Administratiu(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio) {
        super(dni, nom, cognom, sou, data_alta, titulacio);
    }

    public Administratiu(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça) {
        super(dni, nom, cognom, sou, data_alta, titulacio, telefon, data_naixement, adreça);
    }

   

   
}
