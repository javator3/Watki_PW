package pl.sda.watki;

public class RunnerZadanie extends Thread {


    public RunnerZadanie(int liczba) {
        this.liczba = liczba;
    }

    private int liczba;

    @Override
    public void run() {
        for (int i = liczba; i < 10; i++) {
            this.liczba=liczba*2;
            System.out.println("Hello: " + liczba + " thread: " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
