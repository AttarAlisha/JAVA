import java.io.*;
import java.util.*;

public class MyThraed extends Thread {

    public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {
        MyThraed g1 = new MyThraed();

      
        g1.start();
    }
}
