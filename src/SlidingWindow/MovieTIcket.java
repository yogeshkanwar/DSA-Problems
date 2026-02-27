package SlidingWindow;


public class MovieTIcket {

    public static void findMinRows(int arr[],int k){


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
            System.out.println("Match not found");
        }
        System.out.println(minLength);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 8, 2}; int k=11;
        findMinRows(arr,k);
        int arr1[] = {2,1,2,1}; int k1=8;
        findMinRows(arr1,k1);

    }
}
