
package zoo;

import java.util.Date;
import java.util.Random;


public class Pallasso extends Peix {

    public Pallasso(String nom, int codi, Date data_naixement, String color) {
        super(nom, codi, data_naixement, "Escames de ratlles", 0, color, 3);
    }

    @Override
    public void neda() {
       System.out.println("Els peix pallasso neda");
    }

    public void explicaAcudit(){
        Random r = new Random();
        String acudits[] ={"A la nevera, dues tomaques. Li diu una a l’altra:\n" +
            "\n" +
            "-ui… quin fred fa!!\n" +
            "-caram!! UNA TOMACA QUE PARLA!!!!", "Això van dos olives pel carrer i una es cau, i l’altra li pregunta:\n" +
            "\n" +
            "-estàs bé?\n" +
            "\n" +
            "-Crec que m’he trencat un os...\n" +
            "-calla! Però si ets d’anxova!", 
            "Era un home tan babau, tan babau, tan babau, que es va tallar una Orella per què deia que la tenia repetida…",
            "-El meu fill va amb bicicleta des dels quatre anys...\n" +
            "-ah doncs ja deu estar lluny!!!", "Com s’anomenen els habitats de Betlem? Figuretes.",
            "Què li diu un ull a l’altre?\n"
                    + "Estem separats per nassos...",
            "Hi havia una vegada un acudit tan dolent, tan dolent, tan dolent... que pegava als acudits menuts...",
            "Què li diu una pedra a l’altra? La vida és dura"};
        System.out.println(acudits[r.nextInt(acudits.length)]);
        
        
    }
    
}
