import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args){
        System.out.println("LoginSystem");
        Scanner input = new Scanner(System.in);
        String user = "kakarot";
        String passcode = "kakarotx4321";

        System.out.println("enter username : ");
        String username = input.nextLine();
        System.out.println("enter password : ");
        String password = input.nextLine();

        
            
            if (username.equals(user)&&password.equals(passcode)){
                System.out.println("login succcess ");

            }else if(username.equals(user)&&!password.equals(passcode)){
                System.out.println("incorrect password ");
            }
             else if(!username.equals(user)&&password.equals(passcode)){
                System.out.println("inalid username  ");
             }else{
            System.out.println("login faild ");
            }

    }
    
}
