
package zoo;

import java.util.Date;


public class Domador extends Cuidador {

    public Domador(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio) {
        super(dni, nom, cognom, sou, data_alta, titulacio);
    }

    public Domador(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça) {
        super(dni, nom, cognom, sou, data_alta, titulacio, telefon, data_naixement, adreça);
    }
    
    public void doma(Animal a){
        System.out.println("El domador "+getNom()+" doma a "+a.getNom()+", que és un "+a.getClass().getSimpleName()+".");
    }

    
}
