//Shreya Chaturvedi, 23070126123, AIML B2

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.");
        
        
        //creating the objects from the MyThread.java class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        
        //starting those threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread ended.");
    }
}
