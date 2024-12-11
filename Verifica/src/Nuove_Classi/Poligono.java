/*
DOMANDA 4
Scrivi una classe chiamata Poligono con i seguenti requisiti:
Un attributo privato numeroLati (di tipo int) che rappresenta il numero di lati del poligono.
Un attributo privato lunghezzaLato (di tipo double) che rappresenta la lunghezza di ciascun lato.
Un costruttore che accetta numeroLati e lunghezzaLato come parametri.
Un metodo double calcolaPerimetro() che restituisce il perimetro del poligono.
Scrivi anche un metodo toString() che restituisca una descrizione testuale del poligono, ad esempio:
"Poligono con 5 lati di lunghezza 3.0, perimetro: 15.0"
*/

package Nuove_Classi;

public class Poligono {
    private int numeroLati;
    private double lunghezzaLato;

    public double calcolaPerimetro()
    {
        Poligono poligono = new Poligono();
        double perimetro = poligono.lunghezzaLato * poligono.numeroLati;
        return perimetro;
    }

    public String toString()
    {
        return String.format("Poligono di %d lati di lunghezza %.2f, perimetro: %.2f", numeroLati, lunghezzaLato, calcolaPerimetro());
    }
}
