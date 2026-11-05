import java.util.Scanner;

public class userprofile{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter your username : ");
        String username = input.nextLine();
        System.out.println("enter your age  : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("enter your gender : ");
        String gender = input.nextLine();
        System.out.println("enter your mobile number : ");
        String verification = input.nextLine();
        System.out.println("enter password ");
        String password = input.nextLine();

        System.out.println("hello "+username +"!");
        System.out.println("hello "+age +"!");
        System.out.println("hello "+gender +"!");
        System.out.println("hello "+verification +"!");
        System.out.println("hello "+password +"!");



    }
}
