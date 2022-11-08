package day26exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d);//41.0


    }

    //Stringdeki karakter sayisini bulunuz.String'i Integer'a ceviriniz.Integeri karakter sayisina bolunuz.
    //1.Yol
    public static double divideStringByTheNumOfTheChar(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;


        try {
            str.length();//NullPointerExpection : "null" String ile length method kullanildiginda alinir.
            Integer.valueOf(str);//NumberFormatException : Icinde rakamdan farkli karakter olan Stringler valueOf ile kullanildiginda alinir.

            sonuc = i / length;//ArithmeticException : Bolen sayi sifir oldugunda alinir.
        } catch (NullPointerException e) {

            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        return sonuc;
    }

    //2.Yol
    public static double divideStringByTheNumOfTheCharacter(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;


        try {

            str.length();//NullPointerExpection : "null" String ile length method kullanildiginda alinir.
            Integer.valueOf(str);//NumberFormatException : Icinde rakamdan farkli karakter olan Stringler valueOf ile kullanildiginda alinir.
            sonuc = i / length;//ArithmeticException : Bolen sayi sifir oldugunda alinir.

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        return sonuc;
    }

    //3.Yol
    public static double divideStringByTheNumOfTheCharacters(String str) {
        int length = 0;
        int i = 0;
        double sonuc = 0;


        try {

            str.length();//NullPointerExpection : "null" String ile length method kullanildiginda alinir.
            Integer.valueOf(str);//NumberFormatException : Icinde rakamdan farkli karakter olan Stringler valueOf ile kullanildiginda alinir.
            sonuc = i / length;//ArithmeticException : Bolen sayi sifir oldugunda alinir.

        }catch(NullPointerException e){
            System.out.println("NullPointere ozel");
        }

        catch (Exception e) {

            System.out.println("Diger tum Exceptionlar icin ==>" + e.getMessage());

        }
        return sonuc;
    }
    /*
    Note :
    1)Aralarinda "parent-child" relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz
      "child" olan once kullanilmalidir,aksi taktirde hata verir.
    2)Aralarinda "parent-child" relationship olmayan Exception Class'lari multiple catch'lerde kullanmak isterseniz
      siralamanin bir onemi yoktur.
     */
}




