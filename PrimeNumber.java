public class PrimeNumber {
    public static boolean isPrime(int number) {
        // declaring variables
        boolean result = true;

        long stime = System.currentTimeMillis();
        if(number == 1) {
            return false;
        }
        
        for(int i = 2; i*i <= number; i++) {
            if(number%i == 0) {
                result = false;
                break;
            }
        }
        long etime = System.currentTimeMillis();

        System.out.println("time = " + (int)(etime-stime));
        // returning result
        return result;
    }
}