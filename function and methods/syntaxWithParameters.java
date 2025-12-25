import java.util.*;
public class syntaxWithParameters {
    public static void printHello() {
        System.out.println("Hello, world");
        return;
    }

    public static int calculateSum(int num1, int num2){ //parameters or forrmal parameters
        int sum = num1 + num2;
        return sum;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //arguments or actual parameters
        System.out.println("The sum is: " + sum);
    }
}