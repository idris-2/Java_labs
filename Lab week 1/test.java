import java.util.Scanner;

class test{
    public static void main(String[] args){
        Scanner idk = new Scanner(System.in);

        System.out.println("Idris Hasanovic");      // 1.
        System.out.println("Hello World!");       // 2.
        System.out.println("(and all the people of the world)");

        // 3. seconds in a year
        int sec = 365*24*60*60;
        System.out.println("There are" + " " + Integer.toString(sec) + (" ") + ("seconds in a year."));

        // 4. user input sum
        System.out.println("Enter first num: ");
        int num1 = idk.nextInt();
        System.out.println("Enter second num: ");
        int num2 = idk.nextInt();
        System.out.println("Sum of numbers: " + Integer.toString(num1 + num2));

        // 5. if num is positive
        System.out.println("Enter num: ");
        int num3 = idk.nextInt();
        if (num3 >= 0){System.out.println("Number is positive");}
        else{System.out.println("Number is negative");}

        // 6. two input, find greater or equal.
        System.out.println("Enter first num: ");
        int num4 = idk.nextInt();
        System.out.println("Enter second num: ");
        int num5 = idk.nextInt();

        if (num4 > num5){System.out.println("Greater number: " + Integer.toString(num4));}
        else if (num5 > num4){System.out.println("Greater number: " + Integer.toString(num5));}
        else{System.out.println("Numbers are equal.");}

        idk.close();    // Closing scanner. For some reason java likes to keep running even tho it has completd its work
    }
}