import java.util.Scanner;

public class carrot {
    
    public static int sum(int num1, int num2, int num3) {
            int sum = num1 + num2 + num3;
            return sum;
        }
        
    public static int maxx(int num1, int num2, int num3) {

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    
    
    public static int minn(int num1, int num2, int num3) {
        // Find min
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
 
        return min;
    }
    
    public static double average(int sum) {
        // // Calculate average
        double average = sum / 3.0;
        return average;
    }
    
    public static boolean allpos(int num1, int num2, int num3) {
        // // Check if all numbers are positive
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
 
    }
    
    public static void printt(int sum, int max, int min, double average, boolean allPositive,int num1, int num2, int num3) {
            // // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    public static void getNum () {
        while (true) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your first num :) :");
            int num1 = input.nextInt();
            System.out.print("Enter your second num :) :");
            int num2 = input.nextInt();
            System.out.print("Enter your third num :) :");
            int num3 = input.nextInt();
            printt(sum(num1,num2,num3), maxx(num1,num2,num3), minn(num1,num2,num3), average(sum(num1,num2,num3)), allpos(num1,num2,num3), num1, num3, num3);

            break;
            
        }
            
        catch (Exception e) {
                System.out.println("Error! Invalid integer. Try again.");

            }
            
        }

    }
    public static void main(String[] args) {
        getNum();
        
    }
    
    
}
