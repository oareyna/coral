import java.util.Scanner;

class Stairs  {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String Cara = input.nextLine();

        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter number of steps: ");
        int Chara = input2.nextInt();

        for (int i = 1; i < Chara+1; i++) {
            String someNum = Cara;
            System.out.println(" ".repeat( Chara - i) + someNum.repeat(i));
        }
       

    }
}
