public class GuessingGame {
    public static void main(String[] args) {

        int secretNumber = 10;
        int guess = 9;

        if (guess == secretNumber){
            System.out.println("You are correct");
        } else if (guess > secretNumber+5){
            System.out.println("You are too high");
        } else if (guess < secretNumber-5){
            System.out.println("You are too low");

        } else System.out.println("You are close");

    }
}
