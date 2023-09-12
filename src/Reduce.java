public class Reduce {
    public static void main(String[] args) {
        // Set a number
        int input = 100;
        int n = input;
        int steps = 0;

        while (n != 0) {
            boolean even = n % 2 == 0;

            if (even) {
                n = n / 2;
                steps ++;
            }

            else {
                n = n - 1;
                steps ++;
            }
            System.out.println(n);

        }
        System.out.println("The steps it took to reduce " + input + " to zero is ");System.out.println(steps);
    }
}
