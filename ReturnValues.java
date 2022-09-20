
public class ReturnValues {
    public static void main (String[] args) {
        double measure1 = measureRec(4.3,2.2, "area");
        double measure2 = measureRec(3.2, 4.1, "perimeter");

//        System.out.println("The area of a rectangle with length " + 4.3 +
//                " and width " + 2.2 + " is equal to " +  measure1 + "\n");
        // turn this into a function so it does it for each easily, like below

        stringPrinter(4.3, 2.2, measure1, "area");
        stringPrinter(3.2, 4.1, measure2, "perimeter");
    }
    public static double measureRec(double length, double width, String option){
        if (length < 0 || width < 0){
            System.out.println("Cannot be negative");
            System.exit(0);
        }
        switch(option){
            case "area" : return length * width;
            case "perimeter" : return 2 * (length + width);
            default: return 405;}
    }

    public static void stringPrinter(double length, double width, double measure, String option){
        System.out.println("The "+ option +" of a rectangle with length " + length + " and width "
        + width + " is equal to " + measure + "\n");
    }
}
