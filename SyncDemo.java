class Display {

    synchronized void show(String msg) {

        for (int i = 0; i < 5; i++) {
            System.out.print("[" + msg + "]");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

        System.out.println();
    }
}

class MyThread1 extends Thread {

    Display d;

    MyThread1(Display d) {
        this.d = d;
    }

    public void run() {
        d.show("Hello");
    }
}

class MyThread2 extends Thread {

    Display d;

    MyThread2(Display d) {
        this.d = d;
    }

    public void run() {
        d.show("Java");
    }
}

public class SyncDemo {
    public static void main(String args[]) {

        Display d = new Display();

        new MyThread1(d).start();
        new MyThread2(d).start();
    }
}
