package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    /*
    Ilk giren elemani ilk kullanmaniz(First in-First Out==>FIFO) gerektiginde Queue en iyi secimdir.
    Queue 'da peek(),poll(),element(),remove() gibi ilk elemani ilgilendiren bir cok methodlar vardir.
    offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
     */

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);
        //[Milk, Meat, Bread, Honey, Tomatoes]


        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions,
        returning true upon success and throwing an IllegalStateException if no space is currently available.

         Returns: true (as specified by Collection.add)
         Throws:
         IllegalStateException – if the element cannot be added at this time due to capacity restrictions
         ClassCastException – if the class of the specified element prevents it from being added to this queue
         NullPointerException – if the specified element is null and this queue does not permit null elements
         IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */

        /*

          Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse,
      belirtilen öğeyi bu kuyruğa ekler. Kapasite kısıtlamalı bir kuyruk kullanırken,
      bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca
      bir istisna atarak bir öğe eklemede başarısız olabilir.

         */

        wareHouse.offer("Patatoes");
        System.out.println(wareHouse);
        //[Milk, Meat, Bread, Honey, Tomatoes, Patatoes]
    }
}
