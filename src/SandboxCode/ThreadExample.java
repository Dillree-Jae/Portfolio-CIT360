package SandboxCode;

/**
 *
 * @author Jae Dillree
 */
public class ThreadExample extends Thread {
    public void run(){  //run() causes new thread to begin life inside of method
        System.out.println("Thread is now running...");
    }
    public static void main(String[] args){
        SomeClass.start(); //creates a new thread and makes it runnable
    }
}
