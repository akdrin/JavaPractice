import java.util.Scanner;
public class Roots {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a quadratic equation in the form of ax^2 + bx + c = 0: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b*b - 4*a*c;
        
        if(discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.printf("The roots are %.2f and %.2f", root1, root2);
        } else if(discriminant == 0) {
            double root = -b / (2*a);
            System.out.printf("The root is %.2f", root);
        } else {
            System.out.println("The equation has no real roots.");
        }
        

    }
    
}
