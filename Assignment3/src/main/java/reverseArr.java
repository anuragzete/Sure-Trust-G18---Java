package Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int start = 0;
        int end = arr.length-1;
       
        while (start <= end) {
           int temp = arr[end];
           arr[end] = arr[start];
           arr[start] = temp; 
            start++;
            end--;
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println(" ");
    }
}
