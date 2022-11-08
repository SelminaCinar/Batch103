package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
    1)FileInputStream fis = new FileInputStream("src//main//java//day27exceptions//File1.txt");
      "new"den sonraki "FileInputStream" hata verir. Cunku biz Javaya verilen adresteki dosyaya git dedik,Java
      iki endiseye kapildi i)Ya adres yanlissa  ii)Ya verilen adreste dosya yoksa.
      Biz method isminden sonra "throws FileNotFoundException" yazarak , Java'ya bu iki endise duydugun durum olusursa
      "Exception At" dedik.

   2)while((k = fis.read()) != -1 ) yazdigimizda "read()" methodu hata verir. Cunku biz JAvaya dosyadaki karakterleri
     oku dedik.Java bir endiseye kapildi i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
     Biz method isminden sonra "throws IOException" yazarak Java'ya bu durumla karsilastiginda "Exception At" dedik.

   3)Method isminden sonra "throws IOException" yazarsaniz Java "throws FileNotException" i siler.
     Cunku "IOException" ,"FileNotException" i kapsar. "IOException","FileNotException" in parent'idir, onun yaptigi
     herseyi yapabilir o yuzden "IOException" varken "FileNotException" a gerek yoktur.

     "IOException" ==> "Input Output Exception" demektir.

   4)Gordugunuz gibi "IOException" ve"FileNotException" biz kod yazarken daha "run" butonuna basmadan ortaya cikti.
     Bu tarz exception'lara "Compile Time Exception" denir,diger adlari "Checked Exception"denir.

     "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling),halletmeden kod yazmaya devam etmeyiniz.

     */


    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();
        readTheText();

    }

    //Bir text file'daki text'i okuyan kodu yaziniz.

     //1.Yol
     public static void readTheTextFromTheFile () throws IOException {

         FileInputStream fis = new FileInputStream("src//main//java//day27exceptions//File1.txt");

         int k = 0;
         while((k = fis.read()) != -1 ) {
             System.out.print((char)k);
         }
     }

     //2.Yol

    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src//main//java//day27exceptions//File1.txt");

            int k = 0;
            while((k = fis.read()) != -1 ) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var ");
        }
    }
}
