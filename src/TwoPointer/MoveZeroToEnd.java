package TwoPointer;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,0,3,12};

        for(int i=0 ; i < arr.length ; i++){
            int j = i+1;
            if(arr[i] == 0){
                while(j <= arr.length - 1){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                    j++;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }


}
