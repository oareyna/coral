import java.util.Scanner;

class fact {
    public static void main(String[] args) {
        myMethod();}
        public static void myMethod() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int a = 1;
            for (int i = 0; i < num; i++) {
                int b = (num-i);
                a *= b;}
            System.out.println(String.format("The factorial of %1$s is %2$s.", num, a));}}
