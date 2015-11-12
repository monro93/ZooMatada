
package zoo;

import java.util.Date;

public class Contable extends Administratiu {
    protected boolean calculadora;

    public Contable( int dni, String nom, String cognom, double sou, Date data_alta, String titulacio,boolean calculadora) {
        super(dni, nom, cognom, sou, data_alta, titulacio);
        this.calculadora = calculadora;
    }

    public Contable( int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça,boolean calculadora) {
        super(dni, nom, cognom, sou, data_alta, titulacio, telefon, data_naixement, adreça);
        this.calculadora = calculadora;
    }

  public void faComptes(){
      System.out.println("El Contable "+this.getNom()+" fa comptes. ");
  }
    
}
