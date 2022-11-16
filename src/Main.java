import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva o número Fibonacci :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int n1 = 0, n2 = 1, n3, i, count = num;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}