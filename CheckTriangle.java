import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side length: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side length: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side length: ");
        double side3 = scanner.nextDouble();
        
        if(side1 == side2 && side2 ==side3){
            System.out.println("The triangle is equilateral.");
        }
        else if(side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("The triangle is isosceles.");
        }
        else{
            System.out.println("The triangle is scalene.");
        }


    }   
}
