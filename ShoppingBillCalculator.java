import java.util.Scanner;

public class ShoppingBillCalculator {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter product name : ");
        String product = input.nextLine();
        System.out.println("enter product price : ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println(" enter product quantity : ");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.println("enter discount percentage : ");
        double discount = input.nextDouble();

        System.out.println("product name     :              "+ product);
        System.out.println("product price    :              "+ price);
        System.out.println("product quantity :              "+ quantity);
        System.out.println("product discount :              "+ discount);
        System.out.println("-".repeat(40));
        double totalprice= price*quantity;
        System.out.println("total price :"+ price * quantity);
        double discounttotal = totalprice * discount/100;
        System.out.println("discount price : "+ discounttotal);
        System.out.println("-".repeat(40));
        double finaltotal = totalprice - discounttotal; 
        System.out.println("final total : "+ finaltotal );

    }

    
}
