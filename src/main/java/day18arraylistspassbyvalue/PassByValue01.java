package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
    1)Java variable'larin orjinal degerlerini korumak ister.
    2)Variable methodlar icinde kullanildiginda Java methodun icine orjinal degeri koymaz,o degerin kopyasini uretir
    ve methoda o kopyayi yollar.Method kopya ustunde degisiklik yapar dolayisiyla variable'nin orjinal degeri korunmus olur.
    Bu sisteme "Pass By Value" denir.
    Note:Java "Pass By Value" kullanir.
    Note:Bazi programlama dilleri orjinal degeri koruma altina almamıstır.Bu isi developerlara birakmistir.
         Bu tarz diller "Pass By Reference" kullanir.
     */


    public static void main(String[] args) {

        int x = 5;//Gomlek
        System.out.println(x);//5

        int ucret =100;

       int kopya = indirim(ucret);
        System.out.println(kopya);//90

        System.out.println(ucret);//100

        //static method olan main methodun icindeki hersey static olmalidir.
        change(x);//Ogrenci gomlegi
        System.out.println(x);//Gomlek

    }

    public static void change(int a) {
        System.out.println(a * 3);

    }
    //void disindaki return typelarda method body'si icinde
    // "return" keyword kullanilmalidir.
    public static int indirim (int gomlekUcreti){
       return gomlekUcreti - 10;

    }

}
