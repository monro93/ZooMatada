
package zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class  Persona {
    protected int dni;
    protected String nom;
    protected String cognom;
    protected int telefon;
    protected Date data_naixement;
    protected String adreça;

    public Persona(int dni, String nom, String cognom){
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
    }
    public Persona(int dni, String nom, String cognom, int telefon, Date data_naixement, String adreça) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.telefon = telefon;
        this.data_naixement = data_naixement;
        this.adreça = adreça;
    }
    
    public int getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getAdreça() {
        return adreça;
    }

    public Date getData_naixement() {
        return data_naixement;
    }

    /*public int getEdat(){
        Date data_actual = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data_actual);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(getData_naixement());
        return (gc2.get(Calendar.YEAR)-gc.get(Calendar.YEAR));
    }*/
    public int getEdat(){
        Date data_actual = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data_actual);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(getData_naixement());
        int anys = /*gc2.get(Calendar.YEAR)-*/gc.get(Calendar.YEAR);
        return anys;
    }
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }
    
    
}
