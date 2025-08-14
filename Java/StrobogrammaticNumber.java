import java.util.HashMap;
import java.util.Scanner;

public class StrobogrammaticNumber {

    static boolean answer(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(9, 6);
        map.put(8, 8);

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            if (map.containsKey(arr[l]) && map.get(arr[l]) == arr[r]) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int times = sc.nextInt(); // Not used, but kept for compatibility
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = answer(n,arr);
        System.out.println(ans);

    }
}