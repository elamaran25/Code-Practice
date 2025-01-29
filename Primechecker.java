import java.util.Scanner;

public class Primechecker {
    public static boolean isPrime(int num ){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime or not :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n + " is a Prime number");
        }
        else{
            System.out.println(n + " is not  a prime number");
        }
    }
}