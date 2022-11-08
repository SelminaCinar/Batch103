package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
           Java Primitive'lere methodlar ekleyerek yeni bir yapi olusturdu,
           bu yapiya "Wrapper Class" denir.

           Primitive             Wrapper
           byte          ==>        Byte
           short         ==>        Short
           int           ==>        Integer
           long          ==>        Long
           float         ==>        Float
           double        ==>        Double
           boolean       ==>        Boolean
           char          ==>        Character

        */
        byte primitiveByte = 12;//primitiveByte yazip nokta koydugunuzda hic method goremezsiniz , cunku primitive'ler method icermez sadece deger icerir.

        Byte wrapperByte = 12;//wrapperByte yazip nokta koydugunuzda bir cok method gorursunuz,cunku wrapperlar method icerir.

        //Example 1: byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

         Byte b1 = 13;

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127


        //Example 2: short, int, long en buyuk en kucuk degerleri yazdiriniz.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //YAPTIN BE KIZIM !! :)))

        //"PRİMİTİVE"LER NASIL WRAPPERLARA ÇEVİRİLİR(AUTOBOXİNG)

        float f1 = 13.99F;
        Float wrapperF1 =f1;

        //WRAPPERLAR NASIL "PRİMİTİVE" ÇEVİRİLİR(UNBOXİNG)

        Character w1 = 's';
        char primitiveW1 = w1;

        //Note:Autoboxing ve Unboxing Java tarafindan otomatik yapilir.















    }
}
