import java.util.Scanner;

public class chellenge375 {
    //A number is input in computer then a new no should get printed by adding one to each of its digit.
    // If you encounter a 9, insert a 10 (don't carry over, just shift things around).
    //For example, 998 becomes 10109.
    long func(long x) {
        if (x<10) return x+1;
        long a = x%10 + 1;
        long b = func(x/10)*10;
        return (a==10) ? ((b+1)*10) : (b+a);
    }


    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę:");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        System.out.println("Liczba:" + new chellenge375().func(num));


    }

}



























