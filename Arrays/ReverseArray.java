public class ReverseArray {

    public static void Reverse_array(int numbers[]){
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
        int temp = numbers[left];
        numbers[left] = numbers[right];
        numbers[right] = temp;

        left++;
        right--;
        }
    }


    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};

        Reverse_array(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
