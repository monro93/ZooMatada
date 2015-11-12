/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.Date;

/**
 *
 * @author marc
 */
public class Alimentador extends Cuidador {

    public Alimentador(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio) {
        super(dni, nom, cognom, sou, data_alta, titulacio);
    }

    public Alimentador(int dni, String nom, String cognom, double sou, Date data_alta, String titulacio, int telefon, Date data_naixement, String adreça) {
        super(dni, nom, cognom, sou, data_alta, titulacio, telefon, data_naixement, adreça);
    }
    
    public void alimenta(Animal a){
        System.out.println("El alimentador "+getNom()+" alimenta a "+a.getNom()+", que és un "+a.getClass().getSimpleName()+".");
    }
}
