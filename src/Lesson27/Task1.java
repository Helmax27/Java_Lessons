package Lesson27;

public class Task1 {
    static Hello hello;
    static  HelloThread helloThread;
    public static void main(String[] args) throws InterruptedException {
        hello = new Hello();
        Thread newThread = new Thread(hello);
        newThread.start();

        helloThread = new HelloThread();
        helloThread.start();
        System.out.println("----------------------------");

        for (int i = 0; i<10; i++){
            threadTest thread = new threadTest();
            thread.start();

            if (thread.getName().equals("3")) thread.interrupt();
            Thread.sleep(1000);
            System.out.println(thread.getName() + thread.isInterrupted());
            //thread.join();
        }
        System.out.println("Main thread finished");
    }
}
class Hello implements Runnable {
    public void run(){
        System.out.println("Hello Lena");
    }
}

class HelloThread extends Thread{
    public void run(){
        System.out.println("Hello Anton");
    }
}
class threadTest extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from thread " + getName());
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
