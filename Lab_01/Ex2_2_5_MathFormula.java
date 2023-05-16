import java.util.Scanner;

public class Ex2_2_5_MathFormula {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the second number x2 = ");
        double x2 = scanner.nextDouble();
        System.out.println("x1 + x2 = " + (x1+x2));
        System.out.println("x1 - x2 = " + (x1-x2));
        System.out.println("x1 * x2 = " + (x1*x2));
        if (x2 != 0){
            System.out.println("x1/x2 = " + (x1/x2));
        }
        scanner.close();
    }
    
}
