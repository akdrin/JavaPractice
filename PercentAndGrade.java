import java.util.Scanner;
public class PercentAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of Physics");
        int physicsMarks = scanner.nextInt();
        System.out.println("Emter marks of Chemistry");
        int chemistryMarks = scanner.nextInt();
        System.out.println("Enter marks of Mathematics");
        int mathematicsMarks = scanner.nextInt();
        System.out.println("Enter marks of Biology");
        int biologyMarks = scanner.nextInt();
        System.out.println("Enter marks of Computer");
        int computerMarks = scanner.nextInt();

        int percentage= (physicsMarks+chemistryMarks+mathematicsMarks+biologyMarks+computerMarks)/5;
        if(percentage>=90){ System.out.println("Grade A");return;}
        else if(percentage>=80) {System.out.println("Grade B"); 
        return;}
        else if(percentage>=70){ System.out.println("Grade C"); return;}
        else if(percentage>=60){
            System.out.println("Grade D");
        }
        else System.err.println("Grade F");


    
}
