import java.util.*;

//byte -> short -> int -> long -> float -> double
public class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    //int to float conversion possible 
    //implicit type conversion
        float price = sc.nextInt();
        System.out.println(price);
    
    //float to int conversion not possible
    //lossy conversion
    //explicit type conversion
    //type casting
    //narrowing conversion
        int hmm = sc.nextFloat();
        System.out.println(hmm);

    //if we want to convert forcefully
        int ok = (int)sc.nextFloat();
        System.out.println(ok);

        float a = 10.99f;
        int b = (int)a;
        System.out.println(b);

    }
}
