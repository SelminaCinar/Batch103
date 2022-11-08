package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {
        
        String str = "Java is easy";
        //İndexOf() methodu verilen character ve karakterlerin ilk gorunum indexini verir.
        int idxA = str.indexOf("a");
        System.out.println("idxA = " + idxA);
        
        //lastIndexOf() methodu verilen character ve karakterlerin son gorunum indexini verir
        
       int idxB = str.lastIndexOf("a");
        System.out.println("idxB = " + idxB);
        
        
        String s = "Mississippi";
        
       int idxI = s.indexOf('i');//indexOf() hem String hemde char ile kullanılabilir.
        System.out.println("idxI = " + idxI);
        
      int idxIss1 =  s.indexOf("iss");//İlk gorunumun ilk karakterinin indexini verir
        System.out.println("idxIss1 = " + idxIss1);
      int idxIss2 =  s.lastIndexOf("iss");//Son gorunumun ilk karakterinin indexini verir
        System.out.println("idxIss2 = " + idxIss2);

        //Example 1 : Bir Stringdeki bir karakterin tekrarlı veya tekrarsız oup olmadıgını gosteren kodu yaziniz
        //          //Helloooo ==> H>Tekrarsız e>Tekrarsız l>Tekrarlı o>Tekrarlı

        String t = "Helloooo";

        char c = 'H';

        if(t.indexOf(c)==t.lastIndexOf(c )){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";
       //indexOf() iki parametre ile kullanilirsa ikinci parametre verilen sayi kadar karakteri gectikten sonra istenen karakterin
        //ilk gorunumunun indexini return eder.
      int sonuc =  u.indexOf("a",6);
        System.out.println("sonuc = " + sonuc);
        
        
       int sonuc1=  u.lastIndexOf("a",5);
        System.out.println("sonuc1 = " + sonuc1);
        //lastIndexOf() iki parametreyle kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip
        //en bastan bu indexe kadar olan karakterleri bir kutu içerisine alınız ve bu methodu sadece bu kutu içindeki String için kullanınız.
        String m="Hello everyone!";
        int e = m.lastIndexOf("e",7);
        System.out.println("e = " + e);
        

        
        String v = " ";
        
        boolean bosMu = v.isEmpty();
        //isEmpty() methodu bir Stringin bos olup olamdigini kontrol eder.
        //Eger Stringde hic karakter yoksa isEmpty methodu true return eder,herhangi bir karakter varsa false return eder.
        //lenght()==0 demek isEmpty() true verir demektir.
        //Bir Stringin bos olup olmadigini anlamak icin lenght()==0 kullanmayın!
        System.out.println("bosMu = " + bosMu);
        
        String x = "     ";
        boolean blankMi = x.isBlank();
        //isBlank hem bos String icin hemde sadece Space iceren Stringler icin true return eder.
        System.out.println("blankMi = " + blankMi);

        //Example 2 : Kullanicidan alinan isim mutlaka spaceden farklı en az bir karakter icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi giriniz");
        String ilk = input.next();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");
        }else{
            System.out.println(ilk);
        }


        
        
        































    }
    
}
