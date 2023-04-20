import java.util.Scanner;

public class StarExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of the triangle:");
        int Inumber = scanner.nextInt();
        for (int i=0;i<Inumber;i++){
            int star = 2*i + 1;
            int space = Inumber - i - 1;
            
            System.out.println(" ".repeat(space) + "*".repeat(star));
            
        }
        scanner.close();
        System.exit(0);
    }
    
}
