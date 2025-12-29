public class arraysAsArgument {
    //any change in small/sub function cant affect in main function ---> pass by value

    //any change affect in main function---> pass by reference --> arrays are incluede here.

    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97, 34, 90};
        int nonChangable = 7;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        
        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

}  
