public class ForLoops {
    public static void main (String[] args){
        for ( int i = 1; i <= 3; i++){
            System.out.println(i);
        }
//        int number = 25;
//        while (number <= 30){
//            System.out.println(number);
//            number++;
//        }
        // didn't actually need a while loop for this, for loop would have been better
        // only use while loop when you DONT know how many times it should run
        double choice = 0.01;
        double guess = 0.99;
        while (guess > choice){
            //originally would run forever, but if set to .random, then it will keep guessing until it
            // makes a guess that is less than choice. Impossible to know how many times it will run
            //so that's why we use a While loop and not For loop
            guess = Math.random();
            System.out.println(guess);
        }
    }
}
