package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int helper;

        for (int i = 0; i < 20; i++) {
            System.out.println(num1);
            helper = num1;
            num1 = num1 + num2;
            num2 = helper;

        }

    }

}
