
package zoo;

import java.util.Date;


public class Venedor extends Administratiu {
    protected String productes[];

    public Venedor(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio,String producte[]) {
        super(dni, nom, cognom, sou, data_alta, titulacio);
        this.productes = producte;
    }

    public Venedor(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça,String producte[] ) {
        super(dni, nom, cognom, sou, data_alta, titulacio, telefon, data_naixement, adreça);
        this.productes = producte;
    }

    public String [] getProducte() {
        return productes;
    }
    
    public void venProducte(String productes[], Visitant visitant){
        String strProducte = "";
        for (String producte : productes) {
           strProducte += producte+", ";
        }
         System.out.println("El venedor ven: "+strProducte+" a "+visitant.getNom());
    }
    
    
    
}
