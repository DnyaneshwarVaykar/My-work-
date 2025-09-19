import java.util.Scanner;

public class Factorial {
    public static int calculetFactorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        int factNum1 = calculetFactorial(n-1);
        int factNum = n * factNum1;
        return factNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int Factorial = calculetFactorial(n);
        System.out.println(Factorial);
        sc.close();
    }
}
