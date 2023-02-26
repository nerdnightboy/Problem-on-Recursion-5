import java.util.Scanner;

/*
 * GCD
 * Given two numbers x and y. Find the greatest common divisor using x and y
 * Constraints = 0<=x, y<=1e6
 * Input = x = 4, y =9
 * Output =  1
 */
import java.util.Scanner;
public class GCD {
    static int iGCD(int x, int y){
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(iGCD(x, y));
        System.out.println(gcd(x, y));

        //Euclid's Algo
        // gcd(x,y) = gcd(y,x%y)
        // gcd(x,0) = x

    }
}