package pl.sda.watki;

class Zadanie implements Runnable {
    int i = 3;


    @Override
    public void run() {
        for (int j = i; j < 10; j++) {
            i = i * 2;
            System.out.println("thread: " + Thread.currentThread().getName() + " ,liczba: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i + " thread: " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


public class Main {

    public static void main(String[] args) {

        Thread watek1 = new Thread(new Zadanie());
        Thread watek2 = new Thread(new Zadanie());
        watek1.start();
        watek2.start();


//        Thread thread = new Thread(new Runner());
//        Thread thread1 = new Thread(new Runner());
//        thread.start();
//        thread1.start();

//        RunnerExample runnerExample = new RunnerExample();
//        RunnerExample runnerExample2 = new RunnerExample();
//        runnerExample.start();
//        runnerExample2.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello: " + i + " thread: " +
                            Thread.currentThread().getName());
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello: " + i + " thread: " +
                            Thread.currentThread().getName());
                }
            }
        });

        // wykorzystaniem klasy anonimowej:
//        thread2.start();
//        thread3.start();


    }
}
