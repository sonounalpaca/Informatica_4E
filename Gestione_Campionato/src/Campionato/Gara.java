package Campionato;

import java.util.ArrayList;
import java.util.Scanner;

public class Gara {
    private String nomeGara;
    private static ArrayList<String> scuderie;
    private ArrayList<String> classificaGara;

    public ArrayList<String> getClassificaGara() {
        return classificaGara;
    }
    public String getNomeGara() {
        return nomeGara;
    }
    public ArrayList<String> getScuderia() {
        return scuderie;
    }

    //Inserisco le scuderie che partecipano alla gara
    public static void scuderieDisponibili(ArrayList<String> scuderie)
    {
        String [] listaScuderie = {"Ferrari", "McLaren", "Mercedes", "RedBull"};
        for (int i = 0; i < listaScuderie.length; i++)
        {
            scuderie.add(listaScuderie[i]);
        }
    }

    public static Gara creaGara (Scanner keyboard)
    {
        Gara gara = new Gara ();

        System.out.println("Inserire il nome della gara: ");
        gara.nomeGara = keyboard.nextLine();

        scuderieDisponibili (scuderie);

        return gara;
    }


}
