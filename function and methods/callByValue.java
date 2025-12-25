import java.util.*;
public class callByValue {
    
    public static void swap(int a, int b){
        //swap
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {
        //Swap using call by value
        int a = 5;
        int b = 10;
        swap(a, b); //passing values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//call by value means passing the values of variables to the function. Here, the original values of 'a' and 'b' in main() remain unchanged after calling swap(), because only copies of their values were passed to the function.
//In Java, primitive data types (like int, float, etc.) are passed by value, meaning that a copy of the variable's value is made and passed to the function.