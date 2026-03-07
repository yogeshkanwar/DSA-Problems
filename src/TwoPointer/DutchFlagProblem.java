package TwoPointer;

public class DutchFlagProblem {

    public static void main(String[] args) {

        int[] arr = {0,2,0,0,1,2,1};
        int low = 0; int high = arr.length - 1;
        int i = 0;
        while(i < high){

            if(arr[i] == 0){
                swap(arr,low,i);
                i++;
                low++;
            } else if(arr[i] == 1){
                i++;
            } else {
                swap(arr,high,i);
                high--;
            }
        }

        for(int k = 0 ; k<arr.length; k++){
            System.out.println(arr[k]);
        }

    }
    public static int[] swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
