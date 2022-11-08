package day20stirngbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*
        1)StringBuilder Javada bir Class'dir.
        2)StringBuilder String olusturmaya yarar.
        3)String Class varken nicin StringBuilder'a ihtiyac duyarız.
          Cunku String Class Immutable Classdir,biz bazen Mutable String'lere ihtiyac duyariz.
          StringBuilder bize Mutable String verir.
        4)Immutable Classlarda var olan degerler degistirilemez.Siz var olan bir degeri degistirmek istediginizde
          i)Memory'de yeni bir variable,yeni degerle olusturulur.
          ii)Eski vaariable'in pointer'i yeni variable'a döndürülür.
          iii)Bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collecter" tarafından silinir.

        **Mutable Classlarda var olan deger degistirilebilir.Orjinal deger korunmaz.
       5)String Classlarin İmmutable yapisi security icin onemlidir.
         Ayni degere sahip birden fazla String oldugunda Java bir tane container olusturur ve ayni degere sahip Stringlerin bu containeri
         kullanmasini temin eder.Bu memoryi korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variablelarin etkilenmesi tehlikesi vardir.
         Bu tehlikeden kurtulmak icin Java Stringleri İmmutable(Degismez)yapmıstır.
         Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
         Degistirmek istediginiz variable icin yeni bir container olusturur ve variablein pointerini bu
         yeni variable'a yonlendirir.Boylelikle hem degisim saglanmis hemde digerleri etkilenmemis olur.

         */

        String str = "Java";
        str = "Super Java ";
        System.out.println(str);//Super Java



        //StringBuilder nasil olusturulur ?

        //1.Yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);//Java

        //2.Yol
        StringBuilder strb2 = new StringBuilder();
        //Yol A:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append(" !!!");
        System.out.println(strb2);//Java is easy !!!

        //Yol B :
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain
        System.out.println(strb2);
        
        //StringBuilder'larda karakter sayisi nasil bulunur?==>length() methodu ile bulunur.
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Car");
        strb3.append("xxxxxxxxxxxxxxxxxxx");
        
       int numOfChar = strb3.length();
        System.out.println("numOfChar = " + numOfChar);//3

        //Capacity asımlarında capacity var olanın iki katının iki fazlasına cikar.
        int capacity = strb3.capacity();
        System.out.println("capacity = " + capacity);//16*2+2

        //setCharAt() ==> indexteki karakteri cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete() ilk index dahil son index haric siler.
        strb3.delete(3,18);
        System.out.println(strb3);//Carxxxx

        //deleteCharAt() belli bir indexi siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Caxxxx

        //reverse() methodu StringBuilderi ters cevirir. ==>Ali==>ilA
        //Mutable'larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.

        strb3.reverse();
        System.out.println(strb3);//xxxxaC

        //İmmutable'larda orjinal degeri degistirmek icin
        // methodu kullanmak yeterli olmaz bide atama islemi yapmalisiniz.
        String abc = "Java";
        abc = abc.replace("a","i");
        System.out.println(abc);//Jivi

        //toString() methodu StringBuilderlari Stringe cevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);//xxxxaC

        //Stringden de StringBuildera asagidaki gibi donebilirsiniz.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        //insert() istediginiz karakterden sonra istediginiz sekli koyar.
        strb4.insert(3,"XXXX");
        System.out.println(strb4);//xxxXXXXxaC

        //.insert(3,"KLMNOPQR",5,8); ==>3. karakterden sonra "KLMNOPQR" Stringinin index 5,6,7 deki characterlerini yerlestirir.
        strb4.insert(3,"KLMNOPQR",5,8);
        System.out.println(strb4);//xxxPQRXXXXxaC

        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        //compareTo methodu i)StringBuilderlar tamamiyla ayni ise 0 verir.
         //                ii)a alfabetik sırada bden sonra gelirse pozitif olarak
        //                    aradaki alfabetik sıralama farkini gosterir.
        //                 iii)a alfabetik sırada bden once gelirse negatif olarak
        //                 aradaki alfabetik sıralama farkini gosterir.
       int sonuc = a.compareTo(b);
        System.out.println(sonuc);//0























    }
}
