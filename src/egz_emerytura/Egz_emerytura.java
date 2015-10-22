package egz_emerytura;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Egz_emerytura {

    /*
    Napisać funkcję Emerytura(plik), która na podstawie pliku 
    o podanej nazwie zawierającego dane pracowników zapisane w kolejnych 
    wierszach w następujący sposób:
    "Imie-Nazwisko-Płeć-Wiek",
    dla każdego pracownika powinna wyznaczyć ile miesięcy posostało mu do 
    emerytury (kobiety do 65, a mężczyźni - do 67 roku życia).
    Wyniki należy zapisać następująco:
    Nazwisko 
    Miesiące
    Wyniki dla kobiet zapisać w pliku danych o nazwie "kobiety.bin", 
    natomiast wyniki dla mężczyzn należy zapisać w pliku "mężczyźni.bin"
    */
    public static void Emertura(String plik)
    {
        try{
            int wiekEmerytalnyKobiet = 65*12;
            int wiekEmerytalnyMezczyzn = 67*12;
            
            DataInputStream data = new
         DataInputStream(new FileInputStream(plik));
            DataOutputStream kobiety = new 
        DataOutputStream(new FileOutputStream("c:/test/kobiety.bin"));
            DataOutputStream mezczyzni = new 
        DataOutputStream(new FileOutputStream("c:/test/mezczyzni.bin"));
            
            String linia;
            while((linia = data.readLine())!= null) 
            {
                String tab[] = linia.split("-");
                int wiekKobiety = 12 * Integer.parseInt(tab[3]);
                int wiekMezczyzny = 12  * Integer.parseInt(tab[3]);
                int wynik = 0;
                //System.out.println(wiekEmerytalnyKobiet);
                if(tab[2].equals("K")||tab[2].equals("k"))
                {
                    wynik = wiekEmerytalnyKobiet - wiekKobiety;
                    kobiety.writeBytes(tab[1]+"\r\n");
                    kobiety.writeBytes(Integer.toString(wynik)+"\r\n");
                }else{
                    wynik = wiekEmerytalnyMezczyzn - wiekMezczyzny;
                    mezczyzni.writeBytes(tab[1]+"\r\n");
                    mezczyzni.writeBytes(Integer.toString(wynik)+"\r\n");
                }
            }
        }catch(IOException e){System.out.println(e);};
    }
    public static void main(String[] args) {
       Emertura("c:/test/emerytura.txt");
    }   
}