
public class Kadence {

    static int maxSubArrSum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
 
            if (sum > maxSum) {
                maxSum = sum;
            }
 
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, 5, 7};
        int ans = maxSubArrSum(arr);
        System.out.println(ans);
    }
}
