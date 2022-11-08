package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

        //                 String Class Methodlari
        /*
           1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                       ii)equals() methodu "boolean" return eder.
           2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                                 ii)equalsIgnoreCase() methodu "boolean" return eder.
           3)toLowerCase() : i)Bir Stringdeki tum harfleri kucuk harfe cevirmek icin kullanilir.
                             ii)Bu method String return eder.
           4)toUpperCase() : i)Bir Stringdeki tum harfleri buyuk harfe cevirmek icin kullanilir.
                             ii)Bu method String return eder.
           5)charAt():       i)Bir Stringden belli bir indexteki karakteri almak icin kullanilir.
                             ii)Bu method char return eder.
           6)lenght() :      i)Bir Stringde kac tane karakter kullanildigini ogrenmek icin kullanilir.
                             ii)Bu method int return eder.
           7)contains():     i)Bir Stringde belli bir karakterin var olup olmadigini anlamak icin kullanilir.
                             ii)Bu method boolean return eder.
           8)split():        i)Bir Stringi istedigimiz karakterden parcalamaya yarar.
                             ii)Bu method array return eder.
         */

        /*
        Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
        --En az 8 karakter icermeli
        --Space karakteri icermemeli
        --İlk harfi "M" veya "m" olmali
        --Son karakteri "?" olmali
         */

        String pwd = "Manisa12?";

        //En az 8 karakter icermeli
        boolean first = pwd.length() > 7;
        //space karakteri icermemeli
        boolean second = !pwd.contains(" ");
        //Ilk harfi "m" veya "M" olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
        //Son karakteri ? olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);


    }
}
