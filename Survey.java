import java.util.Scanner;

public class Survey {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the survey!");
        int counter = 0;

        System.out.println("\nWhats your name?");
        String name = scan.nextLine();
        counter ++;

        System.out.println("\nWhats your age?");
        int age = scan.nextInt();
        counter ++;

        System.out.println("\nHow much do you normally spend on coffee?");
        double coffee = scan.nextDouble();
        counter ++;

        scan.nextLine(); //this is a throwaway scan, as the nextLine will not work around Ints and doubles without it
        System.out.println("\n What is your gender marker?");
        String gender = scan.nextLine();
        counter ++;

        System.out.println("\n Thank you " + name + " for answering all " + counter + " questions");
        System.out.println("Your coffee total is " + coffee );
        scan.close();
    }
}
