import java.util.Scanner;
import Figure.*;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);

        System.out.println(rettangolo.getInformazioni());
        System.out.println(quadrato.getInformazioni());
        System.out.println(triangolo.getInformazioni());

        if (rettangolo.compareTo(quadrato) > 0) {
            System.out.println("Il rettangolo ha un'area maggiore del quadrato.");
        } else {
            System.out.println("Il quadrato ha un'area minore o uguale a quella del rettangolo.");
        }

    }
}



/*
DOMANDA 1
Scrivi il metodo compareTo() per le seguenti classi:
Quadrato
TriangoloRettangolo
Circonferenza
Il metodo deve confrontare l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe e restituire:

1 se l'area dell'oggetto attuale è maggiore.
0 se le aree sono uguali.
-1 se l'area dell'oggetto attuale è minore.



Tutto il codice che scriverete deve essere adeguatamente commentato, specialmente per le parti non banali. In particolare:
Costruttori: spiegate il loro scopo e quali parametri si aspettano.
Metodi di calcolo (ad esempio, calcolaArea o calcolaPerimetro): descrivete brevemente il ragionamento dietro le formule utilizzate.
Metodi complessi (ad esempio, compareTo o distanza): spiegate cosa fanno e perché sono utili.
Evitate commenti superflui per il codice ovvio, come // Imposta la base per un setter, ma concentratevi sul rendere chiaro il funzionamento delle
logiche più articolate. Un codice ben commentato non solo aiuta voi a riprenderlo in futuro,
ma permette anche a chi lo legge di comprenderne facilmente il funzionamento!
*/