public class BreakandContinue {
    public static void main (String[] args){
        for (int i=0; i<= 10; i++){
            if (i % 2 != 0){
                //if it's true, it's an even, and skips over the if statement
                //if false, it's odd, and moves into the if statement
                continue;
                //continue will skip it, so it doesnt print. This means only even will show
                // break;
                //break will stop the code entirely. meaning nothing would print in this case
            }
            System.out.println(i);
        }
    }
}
