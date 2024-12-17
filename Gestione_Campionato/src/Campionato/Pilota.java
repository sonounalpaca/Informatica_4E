package Campionato;

import java.util.Scanner;

import static Campionato.Tools.menu;

public class Pilota {
    private String nome;
    private String cognome;
    private String nazionalità;
    private String scuderia;
    private int punteggio;


    public int getPunteggio() {
        return punteggio;
    }
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }
    public String getNazionalità() {
        return nazionalità;
    }
    public String getScudeira ()
    {
        return scuderia;
    }

    //Inserimento del pilota
    public static Pilota creaPilota(Scanner keyboard)
    {
        Pilota pilota = new Pilota ();

        System.out.println ("Inserire nome pilota: ");
        pilota.nome = keyboard.nextLine();

        System.out.println ("Inserire cognome pilota: ");
        pilota.cognome = keyboard.nextLine();

        System.out.println ("Inserire nazionalità pilota: ");
        pilota.nazionalità = keyboard.nextLine();

        String [] listaScuderie = {"Ferrari", "McLaren", "Mercedes", "RedBull"};
        System.out.println ("Scuderia pilota: ");
        switch (Tools.menu(listaScuderie, keyboard))
        {
            case 1 -> pilota.scuderia = String.valueOf(Scuderie.FERRARI);
            case 2 -> pilota.scuderia = String.valueOf(Scuderie.MCLAREN);
            case 3 -> pilota.scuderia = String.valueOf(Scuderie.MERCEDES);
            case 4 -> pilota.scuderia = String.valueOf(Scuderie.REDBULL);
        }

        return pilota;
    }
}
