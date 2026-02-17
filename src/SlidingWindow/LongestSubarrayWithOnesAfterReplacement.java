package SlidingWindow;

public class LongestSubarrayWithOnesAfterReplacement {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int k = 3;

        int start = 0; int maxLength = 0; int zeroCount = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            if(arr[windowEnd] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(arr[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            maxLength = Math.max(maxLength,windowEnd - start + 1);
        }

        System.out.println(maxLength);
    }
}
