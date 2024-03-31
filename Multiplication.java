import java.util.Scanner;
import java.math.BigInteger;

public class Multiplication {

    // Using the '*' Operator
    public static int multiplyUsingOperator(int a, int b) {
        return a * b;
    }

    // Using Math.multiplyExact()
    public static int multiplyUsingMathMethod(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    // Using Bit Manipulation
    public static int multiplyUsingBits(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result += a;
            }
            a <<= 1;
            b >>>= 1;
        }
        return result;
    }

    // Using Recursion
    public static int multiplyUsingRecursion(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiplyUsingRecursion(a, b - 1);
        } else {
            return -multiplyUsingRecursion(a, -b);
        }
    }

    // Using BigInteger for Large Numbers
    public static BigInteger multiplyUsingBigInteger(int a, int b) {
        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);
        return bigA.multiply(bigB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        System.out.println("Multiplication using Operator: " + multiplyUsingOperator(num1, num2));
        System.out.println("Multiplication using Math Method: " + multiplyUsingMathMethod(num1, num2));
        System.out.println("Multiplication using Bits: " + multiplyUsingBits(num1, num2));
        System.out.println("Multiplication using Recursion: " + multiplyUsingRecursion(num1, num2));
        System.out.println("Multiplication using BigInteger: " + multiplyUsingBigInteger(num1, num2));
    }
}
