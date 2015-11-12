
package zoo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class Zoo {

    public static void main(String[] args) {
        final int NUM_ANIMALS_ZOO = 40;
        ArrayList <Animal> animals = new ArrayList();
        Random r = new Random();
	   
        for (int i =0; i<NUM_ANIMALS_ZOO; i++){
            Animal animal = randomAnimal(i);
            animals.add(animal);
            System.out.println("-----------------------------");
            System.out.println(animal);
        }
        //Administratius
        Guardia guardia = new Guardia(41012233, "Adefesio", "Mesas", 845.00, randomDate(), "Técnic Vigilant", "Tirachinas");
        Recepcionista recepcionista = new Recepcionista(41012234, "Joan", "Perés", 1200, randomDate(), "Cap");
        Contable contable = new Contable(41012235, "Jesús", "Solé", 2400, randomDate(), "Economicas", true);
        Venedor venedor = new Venedor(41012236, "Amén", "García", 1000, randomDate(), "Marketing", new String[]{"crispetes", "patates", "coca-cola"} );
        
        //Cuidadors
        Domador domador = new Domador(41012237, "Sergi", "Grau", 9000, randomDate(), "Domador");
        Netejador netejador = new Netejador(41012238, "Héctor", "López", 7000, randomDate(), "Cap");
        Alimentador alimentador = new Alimentador(41012239, "Bond, James", "Bond", 6000, randomDate(), "Nutricionista");
        Veterinari veterinari = new Veterinari(41012240, "Paco", "Arjona", 500, randomDate(), "Veterinaria");
        
        //Visitants
        Visitant visitant1 = new Visitant(41012241, "Luke", "Skywalker", randomDate(), randomDate());
        Visitant visitant2 = new Visitant(41012242, "Homer", "Simpson", randomDate(), randomDate());
        Visitant visitant3 = new Visitant(41012243, "Jordi", "Binefa", randomDate(), randomDate());
        Visitant visitant4 = new Visitant(41012244, "Dexter", "Morgan", randomDate(), randomDate());
        
        for (int i = 0; i < 5; i++){
            domador.doma(animals.get(r.nextInt(animals.size())));
            netejador.neteja(animals.get(r.nextInt(animals.size())));
            alimentador.alimenta(animals.get(r.nextInt(animals.size())));
            veterinari.vacuna(animals.get(r.nextInt(animals.size())));
        }
        System.out.println(new Entrada(10, 3, 2, recepcionista, visitant1));
        System.out.println(new Entrada(10, 1, 1, recepcionista, visitant2));
        System.out.println(new Entrada(10, 5, 2, recepcionista, visitant3));
        System.out.println(new Entrada(10, 7, 3, recepcionista, visitant4));
        
                
    }
    
    public static Animal randomAnimal(int codi){
	final int NUM_TIPUS_ANIMAL = 23;
	Random r = new Random();
	String nomsArray[] = {"Francisco", "Marc", "Albert", "Dumbo", "Rufus", "Pipus",
            "Bonifacio", "Segismundo", "Rufino", "Seberina", "Bombom", "Chewaka", "Ruffy","Luffy",
            "Zoro", "Zen", "Nami", "Sanji", "Kuko88", "trotraran", "Stego", "monro", "Mahaiak",
            "Héctor", "Casper", "Pipi", "Goku", "Uk", "Ricochet", "Flopy", "Tritany",
            "Salamander", "Katana", "MacGuyBird", "Magneto", "Magnum", "Kabutops", "Pai Pai",
            "Carod Rovira", "Xuxa", "Yankee", "Zeus", "Kratos", "Neptuno", "Afrodita",
            "Pluto", "Goofy", "Mickey", "Mouse", "Grau", "Mario", "Luigi", "Jedi",
            "Binefa", "Ubuntu", "Tarzán", "Finestrot", "Collados", "Arjona", "Carreras",
            "Alien", "Predator", "Athos", "Dartanyan", "Portos", "Aramis", "Rafeal", "Donatello",
            "Miquelangelo", "Leonardo", "Estellicó", "Trinxant", "Montana", "Arale","Slump",
            "Hachan", "Krillin", "Vegeta", "Cor petit", "Cellula", "Bond, James", "Yusuke",
            "Ranma", "Skuragi", "Conan", "Sherlock", "Watson", "Inuyasha", "Fraky", "Ussop", "Chopper",
            "Dragon", "Trafalgar", "Luke", "Anakin", "Bobobo", "Doraemon", "Nobita", "Shin-Chan",
            "Sylvan", "Bob", "L", "Kira", "Bulma", "Akira", "Morellonomicón", "Gohan", 
            "Teemo", "Jynx", "Ashe", "Ahri", "Katarina", "Charles Maxon", "Dexter", 
            "Revenant", "Miyamoto", "Hades", "Pan", "Orfeu","Morfeo", "Neo", "Trinity",
            "Lechuga", "Ra", "Osiris", "YsusCrais", "Imhotep", "Kebab", "Ramen", "Pat-tai",
            "Bart", "Homer", "Marge", "Lisa", "Bill", "Nelson", "Moe", "Barney", "Skiner",
            "Nofx", "Hulk", "IronPet"};
	String colorsArray[] = {"Negre", "Blanc", "Marró"};
        String colorsArray2[] = {"Taronja i Blanc", "Blanc i Negre"};
        String colorsArray3[] = {"Verd", "Blau", "Vermell", "Blanc", "Negre", "Marró",
            "Taronja", "Rosa", "Lila", "Groc", "Gris", "Ocre", "Blau Marí", "Magenta"};//omplir
        Animal.Sexe sexe = Animal.Sexe.INDEFINIT;
        switch(r.nextInt(2)){ // sexe random
            case 0: sexe = Animal.Sexe.MASCLE;break;
            case 1: sexe = Animal.Sexe.FEMELLA;break;
        }               
		
        switch(r.nextInt(NUM_TIPUS_ANIMAL)){
                case 0://elefant
                        return new Elefant(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextDouble()*4000+1000, r.nextDouble()*100+10);
                case 1://girafa
                        return new Girafa(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextDouble()*200+30);
                case 2://lleo
                        return new Lleo(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextInt(10)+1);
                case 3://rinoceront
                        return new Rinoceront(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextBoolean(),r.nextDouble()*2000+200); 
                case 4://gorila
                        return new Gorila(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, colorsArray[r.nextInt(colorsArray.length)]); 
                case 5://tigre
                        return new Tigre(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, colorsArray2[r.nextInt(colorsArray2.length)]); 
                case 6://zebra
                        return new Zebra(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextInt(20)+5); 
                case 7://Unicorn
                        return new Unicorn(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextDouble()*40+10, r.nextBoolean()); 
                case 8://Estruç
                        return new Estruç(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextInt(50)+20); 
                case 9://Tucan
                        return new Tucan(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextDouble()*20+5); 
                case 10://Pingüí
                        return new Pingui(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextInt(50)+20); 
                case 11://Lloro
                        return new Lloro(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextBoolean(), r.nextInt(1000)+30); 
                case 12://Cocodril
                        return new Cocodril(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextDouble()*3+0.5, r.nextDouble()*300+50); 
                case 13://Serp
                        Date neixer = randomDate();
                        Date muda;

                        while((muda = randomDate()).compareTo(neixer)<0){}
                        return new Serp(nomsArray[r.nextInt(nomsArray.length)], codi, neixer,
                        sexe,r.nextBoolean(), muda, colorsArray[r.nextInt(colorsArray.length)]); 
                case 14://Llangardaix
                        return new Llangardaix(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, false, true, colorsArray[r.nextInt(colorsArray.length)]); 
                case 15://Tortuga
                        return new Tortuga(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe); 
                case 16://Granota
                        return new Granota(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextBoolean(),colorsArray3[r.nextInt(colorsArray3.length)] ); 
                case 17://Tauro
                        return new Tauro(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        colorsArray[r.nextInt(colorsArray.length)], r.nextDouble()*300+50 ); 
                case 18://Pallasso
                        return new Pallasso(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        colorsArray3[r.nextInt(colorsArray3.length)] ); 
                case 19://Aranya
                     String formaAranya = "rodones";
                        switch(r.nextInt(2)){ // forma random
                            case 0: formaAranya = "rodones"; break;
                            case 1: formaAranya = "ratlles"; break;			
                        }
                        return new Aranya(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, r.nextBoolean(), r.nextBoolean(), formaAranya ); 
                case 20://Cranc
                        return new Cranc(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                        sexe, colorsArray3[r.nextInt(colorsArray3.length)], r.nextInt(45)+5 ); 
                case 21://Medusa
                        return new Medusa(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                         colorsArray3[r.nextInt(colorsArray3.length)],r.nextInt(45)+5 ); 

                case 22://Irukandi
                        return new Irukandi(nomsArray[r.nextInt(nomsArray.length)], codi, randomDate(),
                         colorsArray3[r.nextInt(colorsArray3.length)] );             
        }
        return null;
    }
	
    public static Date randomDate (){
        Random r = new Random();
        int year= r.nextInt(115)+1900;
        int dayOfYear= r.nextInt(365);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR,dayOfYear );               
        
        return calendar.getTime();
    }
}
