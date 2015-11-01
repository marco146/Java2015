package p_samochód;
/*
Napisać klasę Samochód zawierającą pola:
marka(łańcuch znaków) i 
zużyciePaliwa(liczba rzeczywista) z konstruktorami:
iniciujące dane na wartosci z parametrów i bezparametrowym, "zerującym"
pola, oraz metodami:
Koszt(kilometr, cena), zwracającym koszt paliwa dla podanych danych, 
oraz wypisującą na konsole dane (marka i zużyciePaliwa)
Zdafiniować klasy pochodne:
* Autobus, dodającą pole lMiejsc(liczba całkowita)
* Ciężarówka, dodającą pole nośność(liczba całkowita).
Klasy pochodne powinny zawierać odpowiednie konstruktory oraz metody
wypisujące dane na konsolę, Zastosować pełną hermetyzację.

Hermetyzacja to sposób odizolowania od otoczenia wybranych danych i
funkcji (operujących na tych danych) zgromadzonych w jednej strukturze. 
Widoczne są tylko niezbędne fragmenty programu, natomiast zmienne i
funkcje pomocnicze są ukryte i niedostępne z zewnątrz. Dzięki takiemu
połączeniu programista uwalnia się od pamiętania o wszystkich 
szczegółach implementacyjnych, co zapewnia zmniejszenie liczby 
błędów oraz prostszą strukturę programu końcowego. Ukrywanie 
szczegółów zawiera moja książka w jednym z podrozdziałów Dla 
terminu hermetyzacja spotyka się również określenie enkapsulacja. 
Podobnie jak w innych językach programowania, hermetyzację można
stosować bez klasycznych mechanizmow programowani obiektowego
*/
public class P_samochód {
    String marka;
    double zużyciePaliwa;
    public P_samochód(){
        this.marka = "";
        this.zużyciePaliwa = 0;
    }
    public P_samochód(String marka, double zużyciePaliwa){
        this.marka = marka;
        this.zużyciePaliwa = zużyciePaliwa;
    }
    public double Koszt(int kilometry, double cena){
        
        double kosztPaliwa=0;
        kosztPaliwa = kilometry*cena/100;
        return kosztPaliwa;
    }
    public void Wypisz()
    {
        System.out.println(marka+" "+zużyciePaliwa);
    }
    public static void main(String[] args) {

    }
}
class Autobus extends P_samochód{
    int lMiejsc;
    public Autobus()
    {
        lMiejsc = 0;
    }
    public Autobus(String marka, double zużyciePaliwa, int lMiejsc)
    {
        super(marka, zużyciePaliwa);
        this.lMiejsc = lMiejsc;
    }
    public void Wypisz()
    {
        super.Wypisz();
        System.out.println(lMiejsc);
    }
}
class Ciężarówka extends P_samochód{
    int nośność;
    public Ciężarówka()
    {
        nośność = 0;
    }
    public Ciężarówka(String marka,
            double zużyciePaliwa, int lMiejsc, int nośność)
    {
        super(marka, zużyciePaliwa);
        this.nośność = nośność;
    }
    public void Wypisz()
    {
        super.Wypisz();
        System.out.println(nośność);
    }
}
