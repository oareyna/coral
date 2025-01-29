import java.util.Scanner;

class Mainlion {
    static void myMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int a = 0;
        
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            a += j;
        }
        System.out.println(a);
        
    }
    public static void main(String[] args) {
        myMethod();
    } 
}
