import java.util.*;

public class binarySearch {
    public static int binary_search(int numbers[], int key){
        int left = 0;
        int right = numbers.length-1;

        while(left <= right){
            int mid = (left + right)/2;
            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is: " + binary_search(numbers, key));
    }
}

//time complexity = o(log n)
