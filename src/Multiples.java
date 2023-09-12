public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i <= 1000) {
            boolean b1 = i % 3 == 0 || i % 5 == 0;

            if (b1) {
                System.out.println(i);
                count ++;
            }

            i++;
        }
        System.out.println("The number is ");
        System.out.println(count);
    }
}
