import java.util.concurrent.Semaphore;

public class GestioneThreads extends Thread{
    private String nome;
    private static int contatore = 0;
    static Semaphore sem = new Semaphore(1);
    public GestioneThreads(String nome) {
        this.nome = nome;
    }
    public void run() {
        try {
            while(contatore <= 50) {
                sem.acquire();
                if (nome == "T1") {
                    if (contatore % 2 == 0) {
                        System.out.println("Thread " + nome + ": " + contatore);
                        contatore++;
                    }
                } else {
                    if (contatore % 2 != 0) {
                        System.out.println("Thread " + nome + ": " + contatore);
                        contatore++;
                    }
                }
                sem.release();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
