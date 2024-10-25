public class Main {
    public static void main(String[] args) throws InterruptedException {
        GestioneThreads t1 = new GestioneThreads("T1");
        GestioneThreads t2 = new GestioneThreads("T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Fine");
    }
}