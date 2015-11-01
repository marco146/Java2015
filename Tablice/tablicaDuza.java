package egz_tabwieksza;
/*
Napisać program, który tworzy dwuwymiarową tablicę liczb 
całkowitych o losowej wielkości wymiaru(wylosowanej z zakresu [20 , 120])
i podzielnej prez 4), gdzie lizczba wierzszy jest równa liczbie kolum.
Następnie tablica zostaje wypełnona liczbami lozowymi z wyjątkiem elementów
znajdujących się na przekątnej. Liczby mają być losowane z zakresu [a, b),
gdzie liczby a i b podawane są  przez użytkownika. Wartości na przekątnej 
mają być wypełnione w losowym układzie w 50% przypadków cyfrą 1, a w 
pozostałych 50% przypadków wartością -1.
Progrmam powinien wyświetlićna ekran licbę komórek, 
których wartoścjest większa
od iloczynu indeksu wiersza i kolumny tej komórki.
 */
import java.util.Random;
import java.util.Scanner;
public class Egz_tabWieksza {

    public static void main(String[] args) {
        
        int [][] tablica;
        Random r = new Random();
        int rozmiar = r.nextInt(20)+4*26;
        tablica  = new int[rozmiar][rozmiar];
        int a=0, b=0;
        int los=0;
        int liczbaKomorek = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("podaj liczbę a:");
        a = sc.nextInt();
        System.out.println("podaj liczbę b:");
        b = sc.nextInt();
        
        for(int i=0; i<tablica.length; i++)
        {
            for(int j=0; j<tablica.length; j++)
            {
               tablica [i][j] = r.nextInt(a)+b;
              
               los = r.nextInt(2);
                if(i==j&&i+1+j==rozmiar)
                {
                    if(los==0)
                    {
                        tablica [i][j] = -1;
                    }else if(los==1)
                    {
                        tablica [i][j] = 1;
                    }
                }
                if(i*j>tablica[i][j])
                {
                    liczbaKomorek++;
                }
            }
        }
        System.out.println(liczbaKomorek);   
    }   
}
