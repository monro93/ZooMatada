
package zoo;


public class Entrada {
    protected double preu;
    protected int num_dies; 
    protected int num_persones;
    protected Recepcionista recepcionista;
    protected Visitant visitant;
    
    public Entrada(double tarifa, int num_dies, int num_persones, Recepcionista r, Visitant v){
        this.num_dies = num_dies;
        this.recepcionista = r;
        this.visitant = v;
        this.num_persones = num_persones;        
        if(v.getEdat()<18 || v.getEdat()>65)
            tarifa = tarifa *0.8;

        this.preu = tarifa*num_dies*num_persones;        
    }

    public double getPreu() {
        return preu;
    }

    public int getNum_dies() {
        return num_dies;
    }

    public int getNum_persones() {
        return num_persones;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public Visitant getVisitant() {
        return visitant;
    }
    
    @Override
    public String toString(){
        return "Entrada de "+getVisitant().getNom()+" per a "+getNum_persones()+
                " persones"+ ". \nVàlida per "+getNum_dies()+" dies."+" Venuda per: "
                +getRecepcionista().getNom()+ " "+getRecepcionista().getCognom()+".\nPreu:"+getPreu();
    }
    
}
