package SlidingWindow;

//Problem Statement #
//Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
//
//Example 1:
//
//Input: [2, 1, 5, 2, 3, 2], S=7
//Output: 2
//Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].

public class MinSizeSubArraySum {

    public static void findMinSubArray(){
        int arr[] = {2, 1, 5, 2, 8}; int s=7;

        int minLenght = arr.length;
        int start = 0;
        int sum = arr[start]; int length = 1;

        for(int end = 1; end <= arr.length - 1; end++) {
            if(sum >= s){
                minLenght = length;
                start ++;
                sum -= arr[start];
                length--;
            } else {
                sum += arr[end];
                length++;
            }
        }
        System.out.println(minLenght);
    }

    public static void main(String[] args) {
        findMinSubArray();
    }
}
