public class Scope {

    static int dogs = 5;
    //because this is in the class and not a specific bracket, it can be accessed within any of the other
    // pieces below. It's at a higher level. Can pull in from out, but not in from equal level or lower
    public static void main (String[] args) {
        int apples = 5;
        someFunc();
    }
    public static void someFunc(){
//        System.out.println(apples);
        //this wont work, because it's out of scope
        //have to move the int into the function, or call the function on apples with the param
    }
}
