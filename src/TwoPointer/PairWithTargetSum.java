package TwoPointer;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if((arr[start] + arr[end]) == target){
                System.out.println(start +" "+end);
                break;
            }
            start++;
            end--;
        }
    }



}
