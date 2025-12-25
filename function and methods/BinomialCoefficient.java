public class BinomialCoefficient {
     public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoff(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNminusR = factorial(n - r);
        int binCoff = factN / (factR * factNminusR);
        return binCoff;
    }
    public static void main(String args[]) {
        System.out.println(binCoff(5, 2));
    }
}