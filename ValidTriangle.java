import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
        System.err.println("Enter the sides of the triangle: ");
        Scanner scanner =new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        
        if(side1+side2 > side3 || side1+side3 > side2 || side2+side3 > side1 ){
            System.out.println("The given sides form a valid triangle.");
        }
        else {
            System.out.println("Invalid triangle");
        }
        
    }
}
