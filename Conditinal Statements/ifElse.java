public class ifElse {
    public static void main(String args[]) {
        int age = 18;
        if( age > 18){
            System.out.println("adult : driver mode");
        }

        if (age >13 && age <18){
            System.out.println("teenager : study mode");
        }

        else {
            System.out.println("not adult : kid mode");
        }
    }
}