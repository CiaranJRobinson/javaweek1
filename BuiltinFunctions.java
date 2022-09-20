public class BuiltinFunctions {
    public static void main (String[] args) {
        System.out.println("Hello Java");
        //println is a function
        double sine = Math.sin(1.2);
        System.out.println("The sin of 1.2 is: " + sine);
        //Math functions like log, sin, pow for power (1st is large number, second is the power),

        double power = Math.pow(2,4);
        System.out.println("2 tot he power of 4 is " + power);

        //random, which gives a random number between zero and one, then multiply by 10 to get between 0 and 10, or
        // multiply by 100 for 0 to 100
        double random = Math.random() * 100;
        System.out.println("The random value is: " + random);

    }
}
