package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println(r1);//2.0

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Selenium", "");
        System.out.println(r3);

    }
    //Verilen iki String'den birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz.

    public static double compareNumOfCharacters(String s, String t) {
        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("length() methodu null ile kullanilamaz.");
        } catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        } finally {
            System.out.println("Database ile connection kesildi");
        }

        return result;
    }
    /*
    Javada birbirine benzeyen 3 keyword vardir
    "final" , "finally" , "finalize"

    1)"final" bir keyword'dur. Variable,Class ve Methodlar icin kullanilir.
    2)"finally" bir "code block"tur.
      "try-catch" veya sadece "try" ile kullanilir.
      "finally" code block icine yazilan code'lar her halükarda calistirilir.
      Mesela Database ile connection'ı kesmek her halükarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.
    3)"finalize" bir methoddur. Bu method Java tarafindan data'lar imha edilmeden once cagirilir,bu method
      data'lari imha edilecek hale getirir ve daha sonra "Garbage Collector" bu datalari imha eder.

      "finalize" method'unu Java Developerda cagirabilir ama Java kendi bildigini yapar.


     */


}
