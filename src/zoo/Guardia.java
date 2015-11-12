
package zoo;

import java.util.Date;


public class Guardia extends Administratiu {
    protected String Arma;

    public Guardia( int dni, String nom, String cognom, double sou, Date data_alta, String titulacio,String Arma) {
        super(dni, nom, cognom, sou, data_alta, titulacio);
        this.Arma = Arma;
    }

    public Guardia( int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça,String Arma) {
        super(dni, nom, cognom, sou, data_alta, titulacio, telefon, data_naixement, adreça);
        this.Arma = Arma;
    }

    public String getArma() {
        return Arma;
    }

  public void vigila(Visitant visitants[]){
      String string = "El Guardia: "+this.getNom()+" està vigilant a: ";
        for (Visitant visitant : visitants) {
            string += visitant.getNom() + " ";
        }
        System.out.println(string+"."); 
    }
    
}
