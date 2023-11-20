import java.util.Scanner;

public class HotelBillingSystem {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of days stayed:");
       int daysStayed = scanner.nextInt();
       System.out.println("Enter the meal privileges (yes/no):");
       String mealPrivileges = scanner.next();

       int totalBill = calculateBill(daysStayed, mealPrivileges);
       System.out.println("The total bill is: " + totalBill);

       scanner.close();
   }

   public static int calculateBill(int daysStayed, String mealPrivileges) {
       int dailyRate = 100;
       int mealPrivilegeRate = 50;
       int totalBill = daysStayed * dailyRate;

       if (mealPrivileges.equalsIgnoreCase("yes")) {
           totalBill += mealPrivilegeRate;
       }

       return totalBill;
   }
}
