
import java.util.Arrays;
import java.util.Scanner;


class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n+1];

         
        Arrays.fill(prime, 1);
        prime[0] = 0;  
        prime[1] = 0;  
        
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;  
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
