
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
    Car[] cars = new Car[]{
        new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "filter"}),
        new Car ("Dodge", 6000, 1995, "blue", new String[] {"tires", "filter"}),
        new Car ("Nissan", 5000, 2021, "yellow", new String[] {"tires", "filter"}),
            new Car ("Honda", 7000, 2021, "orange", new String[] {"tires", "filter"}),
            new Car ("Mercedes", 1200, 2015, "black", new String[] {"tires", "filter", "transmission"})
    }; 

//        String[] outsideVar = nissan.getParts();
//        outsideVar[1]=" hello";
//        //using a getter, get nissan obj
//        System.out.println(Arrays.toString(nissan.getParts()));

        Dealership dealership = new Dealership(cars);

        //create for loop to do this easier way
//        dealership.setCar(nissan, 0);
//        dealership.setCar(dodge, 1);

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        System.out.println(dealership.getCar(0));
        dealership.sell(2);

//        System.out.println(dealership.search("Dodge", 7000));
//test search function
        //test the to string method
        System.out.println(dealership);

        //to print out all the values in the obj
//        System.out.println(nissan.make);
//        System.out.println(nissan.price);
//        System.out.println(nissan.year);
//        System.out.println(nissan.color);

        //use setters to change the colors
//        nissan.setColor("Black");
//        dodge.setColor("Green");
//
//        //sale on cars!
//        double newPrice = nissan.getPrice()/2;
//        nissan.setPrice(newPrice);
//
//        nissan.drive();
//        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice()+ ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
    }
}
