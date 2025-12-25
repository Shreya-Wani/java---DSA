import java.util.*;
public class ProductOfaANDb {

    public static int product(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = product(a, b);
         System.out.println("The product is: " + multiply);

    }
}