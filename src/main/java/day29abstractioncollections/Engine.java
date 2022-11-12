package day29abstractioncollections;

public interface Engine extends Vehicle {

    // Child      Parent
    //Class ----> Interface ==> implements
    //Class-----> Class ==> extends
    //Interface ------> Interface ==> extends
    //Interface -----> Class ==> Mumkun degil

//Interface'lerdeki tum variablelar otomatik olarak(default) publictir.
//Interface'lerdeki tum variablelar otomatik olarak "final"dir.
//Interface'lerdeki tum variablelar otomatik olarak statictir.
void run();

int price = 2000;

double weight =23.5;
}
