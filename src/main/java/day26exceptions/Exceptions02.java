package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);//v
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium", 8);
        System.out.println(ch2);//StringIndexOutOfBoundsException
        //Eger bir Stringden bir karakter/ler alirken olmayan bir index kullanilirsa bu
        //exception alınır.


    }

    //Bir stringin istediğimiz herhangi bir karakterini bize veren bir method oluşturun
    public static char getCharFromString(String str, int idx) {
        char c = ' ';
        try {
            str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index ile ilgili bir problem olustu ==>  " + e.getMessage());

            e.printStackTrace();//Detayli "log" icin (akısı takip etmek)


        }

        return c;

    }
}
