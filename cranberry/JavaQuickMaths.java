import java.util.Scanner;

public class JavaQuickMaths {

         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("Looping from 1.0 to 5.0 with rounding methods:");
            
             for (double i=1.0;i <=5.0; i+= 0.5) {
                 System.out.printf("Number: %.1f Ceil: %.1f Floor: %.1f Rint: %.1f Round: %d\n",i,Math.ceil(i), Math.floor(i),Math.rint(i), Math.round(i));
                 
             }
             System.out.println("");
             System.out.print("Enter a decimal number: ");
             double num = input.nextDouble();
             String inputBuffer = input.nextLine();
             System.out.printf("Ceil: %.1f Floor: %.1f Rint: %.1f Round: %d",Math.ceil(num), Math.floor(num), Math.rint(num), Math.round(num));
             System.out.println("\n");
             System.out.print("Enter an integer: ");
             int num2 = input.nextInt();
             inputBuffer = input.nextLine();
             System.out.print("Enter a word: ");
             String word = input.nextLine();
             System.out.printf("You entered integer: %d\n",num2);
             System.out.printf("You entered string: %s\n",word);
             System.out.println("");
             
             double num3 = (double)num2;
             int num4 = (int)num;
             char num5 = (char)num2;
             System.out.printf("Implicit cast (int → double): %.1f", num3);
             System.out.printf("\nExplicit cast (double → int): %d ", num4);
             System.out.printf("\nCasting int to char (ASCII): %c", num5);
             System.out.println("\n");
             System.out.print("Enter a character: ");
             char word1 = input.nextLine().charAt(0);
             int num6 = (int) word1;
             System.out.printf("ASCII value of '%c' is: %d",word1,num6 );
             System.out.println("\n");
             System.out.println("String Comparisons:");
             String word2 = "apple";
             String word3 = "apple";
             String word4 = new String("apple");
             System.out.printf("str1 == str2: %b", word2==word3);
             System.out.println("");
             System.out.printf("str1 == str3: %b", word2==word4);
             System.out.println("");
             System.out.printf("str1.equals(str3): %b", word2.equals(word4));
             input.close();
         }
}
