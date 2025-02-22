import java.util.*;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("b << 1 = " + (b << 1));
        System.out.println("b >> 1 = " + (b >> 1));
    }
}
