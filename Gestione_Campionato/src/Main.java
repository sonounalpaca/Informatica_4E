/*
=== CAMPIONATO ===
- lista di gare
- in ogni gara le scuderie presentano due piloti
- i primi tre classificati ad ogni gara ottengno punti
    - primo classificato:
    - secondo classificato:
    - terzo classificato:
- classifica generale del campionato sommando i punti dei piloti nelle varie gare
 */

import Campionato.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String [] opzioni = {
                "Inserisci pilota",
                "Gara",
                "Classifica Campionato",
                "Fine"
        };
        boolean fine = true;
        ArrayList <Pilota> listaPiloti = new ArrayList<Pilota>();
        Scanner keyboard = new Scanner(System.in);

        do
        {
            switch (Tools.menu(opzioni, keyboard)) {
                case 1 -> {//Inseriemnto Pilota
                    listaPiloti.add(Pilota.creaPilota(keyboard));
                }

                case 2 -> {//Gara
                    //Chiamo un metodo che controlla quanti piloti ci sono in ogni scuderia,
                    //Torno al menù principale se non ci sono almeno due piloti in una scuderia
                    //Assegno in maniera random dei tempi a tutti i piloti
                    //Chiamo un metodo che faccia la classifica
                    //Assegno i punti ai primi 3 classificati
                }

                case 3 -> {//Campionato
                    //Metodo che faccia la classifica 
                }

                default -> {
                    fine = false;
                }
            }
        }while (fine);

    }
}