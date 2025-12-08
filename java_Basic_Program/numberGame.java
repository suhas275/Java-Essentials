import java.util.Scanner;

public class numberGame {
    public static void guessTheNumber(){
        Scanner sc = new Scanner(System.in);

        int number = 1 +(int) (100 *Math.random());
        int k = 5;

        System.out.println("A number is chosen between 1 to 100.");
        System.out.println("You have " +k+ " attempts to guess the number");

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter the number:");
            int guess = (sc.nextInt());
            if (guess == number){
                System.out.println("Congratulations you guessed the correct number");
                sc.close();
                return;
            }
        }




}

    public static void main (String[] args){

        guessTheNumber();
    }
}


