import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);

    //variable declaration
    double miles, gallons, MPG;

    //receives input from the user
    System.out.println("No. of miles driven: ");
    miles = src.nextDouble();

    System.out.println("Gallons of gas used: ");
    gallons = src.nextDouble();

    //calculation of mpg with a given formular
    MPG = miles / gallons;

    System.out.println("Your MPG is " + MPG + " mpg");

    }
}