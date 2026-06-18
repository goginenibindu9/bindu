class MyThread implements Runnable {

    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " Pulse " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String args[]) {

        Thread t1 = new Thread(new MyThread("Clock-1"));
        Thread t2 = new Thread(new MyThread("Clock-2"));

        t1.start();
        t2.start();
    }
}
