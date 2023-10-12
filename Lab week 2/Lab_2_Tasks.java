import java.util.Scanner;

class Lab_2_Tasks{
    public static void main(String[] args){
        Scanner idk = new Scanner(System.in);
/* 
        // 1. Create a program that asks the user for a password. If the password is right, a secret message is shown to the user.
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


        // 2. Create a program that asks the user for three numbers and then prints their sum.
        int sum = 0;
        int enter;
        for(int i = 0; i <= 2; i++){
            if(i == 0){
                System.out.println("Enter first number: ");
            }
            else if(i == 1){
                System.out.println("Enter second number: ");
            }
            else{
                System.out.println("Enter third number: ");
            }
            enter = idk.nextInt();
            sum = sum + enter;
            
        }
        System.out.println("Sum: " + String.valueOf(sum));


        // 3. Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0.
        int suma = 0;
        while(true){
            int num = Integer.parseInt(idk.nextLine());
            if(num == 0){
                break;
            }
            suma = suma + num;
            System.out.println("Current sum: " + String.valueOf(suma));
        }
        System.out.println("Suma: " + String.valueOf(suma));


        // 4. Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop.
        System.out.println("Enter beginning number: ");
        int num1 = idk.nextInt();
        System.out.println("Enter ending number: ");
        int num2 = idk.nextInt();

        if(num1 < num2){
            for(int i = num1; i <= num2; i++){
                System.out.println(i);
            }
        }
*/

        // 5. Create a program that calculates the sum of 20+21+22+...+2n
        System.out.println("Enter number of squence sum: ");
        int num_seq = idk.nextInt();
        int sum_seq = 0;
        for(int i = 0; i <= num_seq; i++){
            sum_seq += ((int)Math.pow(2, i));
        }
        System.out.println("The result is: " + String.valueOf(sum_seq));
        
        idk.close();
    }
}