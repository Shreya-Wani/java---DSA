public class TernaryOperator {
    public static void main(String args[]) {
        // int A = 2;
        // int B = 5;

        // int result = (A >= B) ? A : B;
        // System.out.println("Largest of 2 is: " + result);

        int marks = 85;

        String ReportCard = (marks >= 90) ? "A+" :
                            (marks >= 80) ? "A" :
                            (marks >= 70) ? "B+" :
                            (marks >= 60) ? "B" :
                            (marks >= 50) ? "C" : "F";
        System.out.println("Your Grade is: " + ReportCard);

    }
}
