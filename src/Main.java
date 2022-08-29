public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization lz = new LazyPrimeFactorization();
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();

        Thread lThread = new Thread(lz);
        Thread oThread = new Thread(op);
        lThread.setName("lazyThread");
        oThread.setName("optimizedThread");
        lThread.start();
        lThread.join();
        oThread.start();
    }
}
