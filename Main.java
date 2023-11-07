import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String nr_pi_100 = "3.1415926535897932384626433832795028841971693993" +"751058209749445923078164062862089986280348253421170679";
        System.out.println(nr_pi_100);
        System.out.println("Inceput Task 1.");
        Map<String, Integer> frecventaGrupuri= new HashMap<>(); //structura de date de tip HashMap pentru a memora frecventa grupurilor de 2 cifre
        //chei de tip string, iar valori de tip integer
        for(int i=0; i<nr_pi_100.length()-1; i++){
            char cifra1=nr_pi_100.charAt(i);//prima cifra a perechii de cifre curente
            char cifra2=nr_pi_100.charAt(i+1);//a doua cifra a perechii de cifre curente.
            if(Character.isDigit(cifra1) && Character.isDigit(cifra2)){ //vf ca ambele caractere sunt cifre(nu punct)
                String grup= String.valueOf(cifra1) + String.valueOf(cifra2);//creare sir de caractere din cele doua cifre pt a reprezenta grupul de cifre
                frecventaGrupuri.put(grup, frecventaGrupuri.getOrDefault(grup, 0)+1);
                // adaug grupul de cifre in HashMap
                //incrementez valoarea asociata cu cheia grupului
                //getOrDefault este folosita pentru a obtine valoarea curenta asociata cheii sau 0 dacă cheia nu exista inca in HashMap.
            }
        }//dupa iesirea din bucla, am o harta de tip 'frecventaGrupuri' ce contine frecventa fiecarui grup de doua cifre din pi
        System.out.println("Sfarsit Task 1.");
        System.out.println("Inceput Task 2.");
        String grupareMaxFrec=null;
        int maxFrec=0;
        for(Map.Entry<String, Integer> entry: frecventaGrupuri.entrySet()){//parcurg intrarile (perechi cheie-valoare) din HashMap
            if(entry.getValue()>maxFrec){//val curenta mai mare decat ce am gasit pana acum?
                maxFrec=entry.getValue();//actualizez val maxima
                grupareMaxFrec=entry.getKey();//actualizez grupul cu cea mai mare frecventa
            }
        }
        System.out.println("Grupul cu cea mai mare frecvență este: " + grupareMaxFrec);
        System.out.println("Frecvența sa este: " + maxFrec);
        System.out.println("Sfarsit Task 2.");
    }
}