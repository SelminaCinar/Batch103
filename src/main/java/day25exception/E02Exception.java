package day25exception;

public class E02Exception {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr,2);//Veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//Hata verir.(ArrayIndexOutOfBoundsException)

    }
    //Bir String Arrayden index girerek eleman elde edebilmek icin bir method olusturun.

    public static void getElementFromArray(String arr[], int idx) {
        try{
            System.out.println(arr[idx]);

        }catch(ArrayIndexOutOfBoundsException e){
            //Bu benim teknik olmayan acıklamam
            System.err.println("Array'in index'inde bir problem meydana geldi");

            //Exception ile ilgili detaylica teknik mesaj verir.
            e.printStackTrace();
        }






    }
}
