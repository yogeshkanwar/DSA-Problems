package TwoPointer;

public class SortedArraySquare {
    public static void main(String[] args) {
        int[] arr = {-2,-1,0,2,3};
        int[] squareArray = new int[arr.length];
        int start =0; int end=arr.length - 1;
        int highestSquareIndex = end;

        while (start < end){
            int startSquare = arr[start] * arr[start];
            int endSquare = arr[end] * arr[end];

            if(startSquare > endSquare){
                squareArray[highestSquareIndex] = startSquare;
                start++;
            } else {
                squareArray[highestSquareIndex] = endSquare;
                end--;
            }
            highestSquareIndex--;
        }
        for(int i =0; i<= squareArray.length -1; i++){
            System.out.println(squareArray[i]);
        }
    }


}
