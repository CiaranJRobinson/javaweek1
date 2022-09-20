import java.util.Scanner;

public class DiceJack {
    public static void main (String[] args){
        //write code that rolls the dice, then check if user won
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        //make sure the user cant go outside of dice side totals, must be between 1-6
        if (num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1, shutting down");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cant be more than 6");
            System.exit(0);
        }

        int sumofNumbers = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = "+ sumofNumbers);

        if (checkWin(sumDiceRolls, sumofNumbers)){
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("You lose!");}

        scan.close();
    }

    public static int rollDice (){
        double randomNumber = Math.random() * 6;
        randomNumber += 1; //this way you cant roll a 0, and math.random only goes less than 1, so you'd never
                            // get 6 as an option. this adds one to the result first
        return (int)randomNumber; //this cuts off the decimals for a whole number
    }
    // make function that checks if user won, sum of dice rolls must be less than sum of numbers guessed

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers){
        return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);
        }
        //changing to boolean bc it shouldnt be void, moving everything it returns into the if else statement

}
