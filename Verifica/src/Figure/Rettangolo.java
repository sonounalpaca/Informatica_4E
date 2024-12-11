/*
DOMANDA 3
Modifica la classe Rettangolo aggiungendo un metodo chiamato calcolaPerimetro() che restituisce il perimetro del rettangolo.
Scrivi il codice per il metodo e spiega il motivo per cui è utile avere metodi di calcolo in una classe.
*/

package Figure;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public double calcolaPerimetro()
    {
        Rettangolo rettangolo = new Rettangolo(base, altezza);
        double perimetro = (rettangolo.base + rettangolo.altezza) * 2;
        return perimetro;
    }

    //Dovendo restituire delle informazione viene utilizzato come un toString
    //Stampando le informazione eriguardanti il poligono
    public String getInformazioni ()
    {
        return String.format ("Base rettangolo: %.2f, Altezza rettangolo: %.2f", base, altezza);
    }
}

