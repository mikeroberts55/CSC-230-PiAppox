
public class Question06 {

    /* This program will create a series of dots in or out of a circle to 
       approximate PI.*/
    public static void dots(int n) {
        int dots = 0;
        int dotsIn = 0;

        // Create loop to generate dots.
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            dots++;

            // Provide perameter for circle
            if (x * x + y * y <= 1) {
                dotsIn++;
            }
        }

        // print the estimate of PI
        System.out.println("PI = " + 4 * (double) dotsIn / (double) dots);
    }

    public static void main(String[] args) {

        // should get closer and closer to 3.14 or PI.
        dots(100);
        dots(1000);
        dots(1000000);

    }
}
