import java.util.Scanner;
public class Household1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water consumption in liters: ");
        double waterConsumption = sc.nextDouble();
        System.out.println("Water consumption: " + waterConsumption + " liters");
        if (waterConsumption <= 500) {
            System.out.println("Water bill = Rs.100");


        }else {
            System.out.println("Water bill = Rs.200");
        }
    } 
}