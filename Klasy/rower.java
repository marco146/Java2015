package egz_rower;
public class Egz_rower {
    /*
    Zaimplementuj klasy:
    Rower:
    lBiegów - int
    prędkoścMax - int 
    * metody
    RowerGórski:
    zawieszenie - String
    * metody
    RowerSzosowy
    szerOpon - double
    * metody
    Dla każdej klasy zdefiniuj:
    * Konstruktor bezparametrowy zerujący wszystkie pola
    * konstruktor iniciujący wszystkie pola wartościami
    swoich parametrów,
    * metody Daj() i Wpisz(*)  dla każdego pola
    *metodę PiszDane(), zwracającą łańcuch zawierający
    wartości wszystkich pól jrozdzielone przecinkami
    */
    
    // pola w klasie 
    int lBiegów;
    int prędkośćMax;
    
    // konstruktor bezparametrowy
    public Egz_rower()
    {
        this.lBiegów = 0;
        this.prędkośćMax = 0;
    }
    
    // konstruktor parametrowy
    public Egz_rower(int lBiegów, int prędkośćMax)
    {
        this.lBiegów = lBiegów;
        this.prędkośćMax = prędkośćMax;
    }
    // metoda  getter
    int DajprędkośćMax()
    {
        return prędkośćMax;
    }
    // metoda setter
    void WpiszprędkośćMax(int prędkośćMax)
    {
        this.prędkośćMax += prędkośćMax;
    }
    void WpiszPredkośćMaxzmniejsz(int prędkośćMax)
    {
       this.prędkośćMax -= prędkośćMax;
    }
    
    int DajlBiegów()
    {
        return this.lBiegów;
    }
    void WpiszlBiegów(int lBiegów)
    {
        this.lBiegów = lBiegów;
    }
    // zwracanie łańcucha zanków 
    String PiszDane()
    {
        return DajprędkośćMax() + "," + DajlBiegów();
    }
}
// klasa dziedzicząca z klasy Rower
class RowerGorski extends Egz_rower
{
    // pole w klasie RowerGórski
    String zawieszenie;
    
    // konstruktor bezparametrowy
    public RowerGorski()
    {
        this.zawieszenie = "";
    }
    
    // konstruktor parametrowy
    public RowerGorski(int lBiegów, int prędkośćMax, String zawieszenie)
    {
        super(lBiegów, prędkośćMax);
        this.zawieszenie= zawieszenie;
    }
    
    // metoda setter
    void Wpiszzawieszenie(String zawieszenie)
    {
        this.zawieszenie = zawieszenie;
    }
    
    // metoda getter
    String Dajzzawieszenie()
    {
        return this.zawieszenie;
    }
    
    String PiszDane()
    {
        return DajprędkośćMax() + "," +
                DajlBiegów() + "" + Dajzzawieszenie();
    }
}
// klasa RowerSzosowy dziedzicząca po klasie rower
class RowerSzosowy extends Egz_rower
{
    // pole w klasie RowerSzosowy
    double szerOpon;
    
    public RowerSzosowy()
    {
        this.szerOpon = 0;
    }
    
    // konstruktor parametrowy z dziedziczenie pól po klasie Rower
    public RowerSzosowy(int lBiegów, int 
            prędkośćMax, String zawieszenie, double szerOpon)
    {
        super(lBiegów, prędkośćMax);
        this.szerOpon = szerOpon;
    }
    
    // getter dla klasy RowerSzosowy
    double DajszerOpon()
    {
        return this.szerOpon;
    }
    
    // setter w klasie RowerSzosowy
    void WpiszszerOpon(int szerOpon)
    {
        this.szerOpon = szerOpon;
    }
    
    // Zwracanie łańcucha zanków z klasy RowerSzosowy
    String PiszDane()
    {
        return DajprędkośćMax() + "," + DajlBiegów() + "," + DajszerOpon();
    }   
}
