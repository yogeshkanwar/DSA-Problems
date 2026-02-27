package SlidingWindow;


public class MovieTIcket {

    public static int findMinRows(int arr[],int k){

        int minLength = arr.length;
        int start = 0;
        int sum = 0;
        boolean exist = false;

        for(int end = 0; end <= arr.length - 1; end++) {
            sum += arr[end];
            while(sum >= k){
                exist=true;
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start ++;
            }
        }
        if(!exist){
            return -1;
        }
        return minLength;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 8, 2}; int k=11;
        int n = findMinRows(arr,k);
        System.out.println(n);
        int arr1[] = {2,1,2,1}; int k1=8;
        int n1 = findMinRows(arr1,k1);
        System.out.println(n1);
    }
}
