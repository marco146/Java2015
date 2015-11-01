
package litery;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Litery {

    public static void foo(String plik)
    {
         
        try{
            RandomAccessFile raf = new RandomAccessFile("zapis.txt","rw");
            Scanner sc = new Scanner(new File(plik));
          
          while(sc.hasNextInt())
          {
              
               int a=sc.nextInt();
               System.out.println(a);
                raf.writeBytes((char) (a==0?' ':(a+ '`'))+"\r\n");
          }

            System.out.println("Sukces");
           
        }catch(IOException e){System.out.println(e);};
    }
   
    public static void main(String[] args) {

         
        foo("c:/test/liczby.txt");
    }
    
}
