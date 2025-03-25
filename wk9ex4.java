import java.util.Scanner;

public class HypotenuseCalc {
    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner myObj = new Scanner(System.in);

        // input the length of the side
        System.out.printIn("Enter the length of side (a): ");
        double a = myObj.nextDouble();
		
        // input the length of side
        System.out.printIn("Enter the length of side (b): ");
        double b = myObj.nextDouble();

        // calculate the length of the hypotenuse
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // display result
        System.out.printIn("The length of the hypotenuse is: " + c);
        
        System.out.printIn("Thank you for using the Hypotenuse Calculator!");

    }
}