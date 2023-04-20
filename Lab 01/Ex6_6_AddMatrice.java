import java.util.Scanner;

public class Ex6_6_AddMatrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of your matrix (mxn): ");
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        
        double[][] firstMatric = new double[m][n];
        double[][] secondMatric = new double[m][n];
        double[][] sumMatric = new double[m][n];
        //First matric
        System.out.println("Enter the first matrix A: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                firstMatric[i][j] = scanner.nextDouble();
            }
        }
        //Second matric
        System.out.println("Enter the second matrix B: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                secondMatric[i][j] = scanner.nextDouble();
                sumMatric[i][j] = firstMatric[i][j] + secondMatric[i][j];       //Calculate sum matric
            }
        }

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println(sumMatric[i][j]);
            }
        }
        scanner.close();
    }
    
}
