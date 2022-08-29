public class OptimizedPrimeFactorization implements Runnable{
    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 3; i <= 200 ; i++) {
            if (isPrime(i)) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+ "end in " + (endTime - beginTime));
        System.out.println();
    }
}