import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        printRange(num1, num2);
        
        scanner.close();
    }
    
    public static void printRange(int start, int end) {
    if (start < end) {
        for (int i = start + 1; i < end; i++) {
            if (i % 2 == 0) {  // even numbers only
                System.out.println(i);
            }
        }
    } else {
        for (int i = start - 1; i > end; i--) {
            if (i % 2 == 0) {  // even numbers only
                System.out.println(i);
            }
        }
    }
}
}