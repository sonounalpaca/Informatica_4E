/*
DOMANDA 2
Scrivi una classe chiamata Punto con i seguenti attributi e metodi:
Due attributi privati x e y di tipo double, che rappresentano le coordinate del punto.
Un costruttore che accetta come parametri i valori di x e y.
Metodi getter e setter per gli attributi.
Un metodo double distanza(Punto altro) che calcola e restituisce la distanza tra il punto corrente e un altro punto passato come parametro.
 */
package Nuove_Classi;

import java.math.*;
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX (double x)
    {
        return x;
    }

    public double setX (double x)
    {
        return x;
    }

    public double getY (double y)
    {
        return y;
    }

    public double setY (double y)
    {
        return y;
    }

    public double distanza (Punto altro)
    {
        Punto punto = new Punto(x, y);
        //Manca la radice, non mi ricordo il comando ma la libreria l'ho importata
        double distanza = (altro.x - punto.x)*(altro.x - punto.x) + (altro.y - punto.y)*(altro.y - punto.y);
        return distanza;
    }

}
