import java.util.Scanner;
public class Weeks {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter number of day: "); 
       int day= scanner.nextInt();
       if(day == 1) System.out.println("MONDAY");
       else if(day == 2) System.out.println("TUESDAY");
       else if(day == 3) System.out.println("WEDNESDAY");
       else if(day == 4) System.out.println("THURSDAY");
       else if(day == 5) System.out.println("FRIDAY");
       else if(day == 6) System.out.println("SATURDAY");
       else if(day == 7) System.out.println("SUNDAY");
       else System.out.println("Invalid day");
    }

    
}
