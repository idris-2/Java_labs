import java.util.Scanner;

public class debug_test {
    public static void main(String[] args){
        Scanner idk = new Scanner(System.in);
        String secret = "secret";
        
        while(true){
            System.out.println("Enter secret password: ");
            String pass = idk.nextLine();

            if(pass.equals(secret)){
                System.out.println("Right! ");
                System.out.println("The secret is: I like cats!");
                break;
            }
            else{
                System.out.println("Wrong!");
            }
        }
        idk.close();
    }
}
