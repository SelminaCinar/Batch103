package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";
       int result = convertStringToInteger(str);
        System.out.println(result + 5 );//128

        String st ="1a2b";
       int r = convertStringToInteger(st);
        System.out.println(r + 10);//Number Format Exception
        //Eger icinde rakamdan farkli karakter barindiran bir Stringi Integera cevirmek isterseniz bu hatayi alirsiniz.

    }

    public static int convertStringToInteger (String str){

        int i = 0;
        try{
            //herhangi bir satirda "Exception" atilirsa Java direkt "catch"bolumune gecer try icindeki sonraki kodlari calistirmaz.
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");

        }catch(NumberFormatException e){

            System.err.println("Rakam olmayan karakter iceren Stringler Integer'a cevrilemez.");

        }
        return i;

    }
}
