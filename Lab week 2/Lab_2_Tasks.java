import java.util.Scanner;
import java.util.Random;

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


        // 5. Create a program that calculates the sum of 20+21+22+...+2n
        System.out.println("Enter number of squence sum: ");
        int num_seq = idk.nextInt();
        int sum_seq = 0;
        for(int i = 0; i <= num_seq; i++){
            sum_seq += ((int)Math.pow(2, i));
        }
        System.out.println("The result is: " + String.valueOf(sum_seq));
        

        // 6. Create a method printText that prints the following string of characters: "In the beginning there were the swamp, the hoe and Java." and a line break.
        printText();


        // 7. Create a method printStars that prints the given amount of stars and a line break.
        printStars(4);
        printStars(6);


        // 8. Create a method called drawStarsPiramid that will accept the number of rows as a parameter and print a half piramid shape where the number of rows will be dictated by the sent parameter. 
        drawStarsPiramid(5);


        // 9. Modify the previously created starts piramid in a way that now you are not printing the starts but in each row numbers from 1 to the current row count.
        drawNumPiramid(5);
*/
        // 10. In this exercise, the following game is created:
        beginGame();

        idk.close();
    }
    public static void printText(){     // 6.
        Scanner lmao = new Scanner(System.in);
        System.out.println("Enter number of repetitions: ");
        int lol = lmao.nextInt();
        for(int i = 0; i < lol; i++){
        System.out.println("In the beginning there were the swamp, the hoe and Java." + "\n");
        }
        lmao.close();
    }

    public static void printStars(int x){       // 7.
        for(int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawStarsPiramid(int row){       // 8.
        for(int i = 0; i <= row; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // STAR FLIP:
        System.out.println("\n");
        for(int i = row; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawNumPiramid(int row){     // 9.
        for(int i = 0; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");
        // OTHER REQUESTD OUTPUT:
        for(int i = 0; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void beginGame(){
        Scanner user = new Scanner(System.in);
        Random rand = new Random();
        int rn = rand.nextInt(101);
        // System.out.println(rn);
        int count = 0;

        while (true){
            System.out.print("Input number: ");
            int user_in = user.nextInt();
            count++;
            
            if(user_in == rn){
                System.out.println("Congrats! You guessed the number in " + Integer.toString(count) + " tries!");
                break;
            }
            else if(user_in < rn){System.out.println("The number is greater then that!" + "\n" + "Guesses made: " + Integer.toString(count) + "\n");}
            else{System.out.println("Number is lower then that!" + "\n" + "Guesses made: " + Integer.toString(count) + "\n");}
        }
        user.close();
    }
}