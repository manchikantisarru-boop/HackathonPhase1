import java.util.Scanner;
public class Household {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of family members");
        int n = sc.nextInt();
        System.out.println("Number of family members: " + n);
        System.out.println("Enter the water consumed in litres");
        float waterConsumed = sc.nextFloat();
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("Enter the house number");
        int houseNumber = sc.nextInt();
        System.out.println("House number: " + houseNumber);
        System.out.println("Enter the water usage status");
        char status = sc.next().charAt(0);
        System.out.println("Water usage status: " + status);
        
    }
}