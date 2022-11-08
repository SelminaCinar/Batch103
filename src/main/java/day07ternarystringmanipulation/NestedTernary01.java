package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
             Verilen yilin "Leap Year"(Artık Yıl) olup olmadigini kontrol eden kodu yaziniz.
             i) Yıl 100 e bolunurse 400 e de bolunmelidir.==> 1600+ 1800-
             ii) Yıl 100 e bolunmezse 4 e bolunmelidir.==> 1996+  2001-

         */

        int year = 1600;

     String leap =  year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil" ) : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);

        /*
           Asagidaki kurallara göre passwordun gecerli olup olmadigini kontrol eden kodu yaziniz.
           --8 karakterden fazla karakter varsa ilk harfi 'i' olmalidir.
           --8 karakterden az karakter varsa ilk harfi 'K' olmalidir.
         */

        String pwd = "i2a3ed54";
         //Lenght methodu kac karakter oldugunu verir.

        char ilkHarf =pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf =='K' ? "Gecerli" : "Gecersiz" ): (ilkHarf =='i' ? "Gecerli" : "Gecersiz") ;

        System.out.println(gecerli);




















    }

}
