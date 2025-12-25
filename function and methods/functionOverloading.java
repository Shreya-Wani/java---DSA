public class functionOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int main (int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println("Sum of integers: " + add(5, 10)); // Calls the first add method
        System.out.println("Sum of doubles: " + add(5.5, 10.2)); // Calls the second add method
        System.out.println("Sum of three integers: " + main(5, 10, 15)); // Calls the main method with three int parameters
    }
}