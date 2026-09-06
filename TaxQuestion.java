import java.util.Scanner;

public class TaxQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total income");
        float income = sc.nextFloat();
        float tax = 0;

        if (income >= 1000000) {
            System.out.println("you have to pay 30% of tax: ");
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (1000000 - 500000);
            tax = tax + 0.3f * (income - 1000000);
        } else if (income >= 500000) {
            System.out.println("you have to pay 20% of tax: ");
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.02f * (income - 500000);
        } else if (income >= 250000) {
            System.out.println("you have to pay 5% of tax: ");
            tax = tax + 0.05f * (income - 250000);
        } else {
            System.out.println("you do not have to pay tax");
        }

        System.out.println(tax);
    }
}