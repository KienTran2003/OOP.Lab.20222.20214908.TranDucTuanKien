import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex6_4_DayOfMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Take Input
        System.out.println("Enter the year: ");
        int Iyear = scanner.nextInt();
        System.out.print("Enter the month: ");
        String strMonth = scanner.next();
        
        scanner.close();

        System.out.println("You've enter: " + strMonth + "/" + Iyear);
        
        //Create array of month that has 29,30 or 31 days        
        

        String[] strMuchMonth = {"January", "Jan.", "Jan", "1",     // Array of 31-day month
                        "March", "Mar.", "Mar", "3",
                        "May", "5",
                        "July", "Jul", "7",
                        "August", "Aug.", "Aug", "8",
                        "October", "Oct.", "Oct", "10",
                        "December", "Dec.", "Dec", "12"};
                        
        List<String> lstMuchMonth = Arrays.asList(strMuchMonth);
        
        String[] strLeapDay = {"February", "Feb.", "Feb", "2"};    //   February
        List<String> lstLeapDay = Arrays.asList(strLeapDay);       
        
        //Check condition

        if (lstMuchMonth.contains(strMonth)){   //Month in 31-day month.
            System.out.println("There are 31 days in " + strMonth + "/" + Iyear);
        }
        else if (lstLeapDay.contains(strMonth)) {   //Month February --> Consider leap year or not.
            if (Iyear % 4 != 0 || ((Iyear%100 == 0) && (Iyear % 400 != 0))){    //Condition for common year 
                System.out.println("There are 28 days in " + strMonth + "/" + Iyear);
            }
            else System.out.println("There are 29 days in " + strMonth + "/" + Iyear);
        }
        else System.out.println("There are 30 days in " + strMonth + "/" + Iyear);  //Remains are 30-day months
    }
    
}
