import java.util.Scanner;

public class Ex2_2_6_SolveEquation {
    public static void main(String[] args){
        double a,b,c,d,e,f;
        System.out.println("Degree of equation (1/2): ");
        Scanner scanner = new Scanner(System.in);
        int intDegree = scanner.nextInt();
        if (intDegree == 1){
            System.out.println("Number of variables: ");
            int intVar = scanner.nextInt();
            if (intVar == 1){
                System.out.println("Enter coefficient a = ");
                a = scanner.nextDouble();
                System.out.println("Enter coefficient b = ");
                b = scanner.nextDouble();
                if (a==0 && b == 0) {System.out.println("This equation has infinite roots");}
                else if (a == 0 && b != 0) {System.out.println("This system does not have any roots");}
                else {System.out.println("This system has an unique root x = " + (-b/a));}
            } else {
                System.out.println("This system has form: ax1 + bx2 = c, dx1 + ex2 = f");
                System.out.println("Enter coefficient a = ");
                a = scanner.nextDouble();
                System.out.println("Enter coefficient b = ");
                b = scanner.nextDouble();
                System.out.println("Enter coefficient c = ");
                c = scanner.nextDouble();
                System.out.println("Enter coefficient d = ");
                d = scanner.nextDouble();
                System.out.println("Enter coefficient e = ");
                e = scanner.nextDouble();
                System.out.println("Enter coefficient f = ");
                f = scanner.nextDouble();

                double dCrammer = a*e - b*d;
                double dCrammerx = c*e-b*f;
                double dCrammery = a*f - c*d;
                if (dCrammer != 0){
                    System.out.println("x1 = " + dCrammerx/dCrammer);
                    System.out.println("x2 = " + dCrammery/dCrammer);

                } else if ( dCrammer == 0 && (dCrammerx != 0 || dCrammery != 0)){
                    System.out.println("This system does not have any solution.");
                } else {System.out.println("This system have infinite solutions.");}
            }

        } else {
            System.out.println("Enter coefficient a = ");
            a = scanner.nextDouble();
            System.out.println("Enter coefficient b = ");
            b = scanner.nextDouble();
            System.out.println("Enter coefficient c = ");
            c = scanner.nextDouble();
            double dDenta = b*b - 4*a*c;
            if (dDenta < 0){System.out.println("This equation does not have real root.");}
            else {
                double tempt = Math.sqrt(dDenta);
                System.out.println("x1 = " + (-b + tempt)/2/a);
                System.out.println("x2 = " + (-b - tempt)/2/a);
            }
        }
        scanner.close();
    }
    
}
