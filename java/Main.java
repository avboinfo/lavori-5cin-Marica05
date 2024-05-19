import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        ArrayList <Thread> myThread = new ArrayList <> ();
        
        for (int i = 0; i < 10; i ++) {
            HelloWorld saluto = new HelloWorld (i);
            myThread.add (new Thread (saluto));
        }

        for (int i = 0; i < 10; i ++) {
            myThread.get(i).start ();
        }
        
    }
}