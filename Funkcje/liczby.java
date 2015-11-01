package egz_liczby;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Egz_liczby {

    
    public static void foo(String plik)
    {
       // File plika = File(plik); 
        FileReader plikWE = null;
        try{
            RandomAccessFile raf = new RandomAccessFile("zapis.txt", "rw");
            plikWE = new FileReader(plik);
            
            int c;
            while((c=plikWE.read())!= -1)
              {
                  System.out.println((char) (c+'`'));
                  // operator trójargumentowy 
                  raf.writeBytes((char) (c==32?' ':(c+'`'))+"\r\n");
              }
        }catch(IOException e){e.printStackTrace();};
    }
    
    
    public static void main(String[] args) {
       foo("c:/test/litery.txt");
    }
    
}
