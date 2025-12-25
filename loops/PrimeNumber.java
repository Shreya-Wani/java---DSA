import java.util.*;
import java.lang.Math;

public class PrimeNumber {
    public static void main(String args[]) {
        int num = 29;
        boolean isPrime = true;
        
        if (num == 2) {
            isPrime = true;
            System.out.println(num + " is a prime number.");
        }
        else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        }
        
    }
}
