package TwoPointer;

public class RemoveDuplicates {

    public static int remove(int[] arr){
        if(arr.length <= 1) {
            return arr.length;
        }
        int nextNonDuplicate = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[nextNonDuplicate - 1]){
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate ++;
            }
        }
        return nextNonDuplicate;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int length1 = remove(arr1);
        System.out.println(length1); // 4

        int[] arr2 = {2, 2, 2, 11};
        int length2 = remove(arr2);
        System.out.println(length2);    }
}
