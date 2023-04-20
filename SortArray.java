import java.util.Scanner;


public class SortArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Enter the array
        System.out.println("Enter the length of your array:" );
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your array is: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        scanner.close();
        System.out.println();
        for (int i=n-1;i>0;i--){
            for (int j = 0;j<i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Your sorted array is: ");
        int intSum = 0;
        for (int i=0;i<n;i++){
            intSum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        double avg = (double)intSum/n;
        System.out.println("Sum of array is: " + intSum);
        System.out.println("Average of array is: " + avg);
    }
    
    
}
