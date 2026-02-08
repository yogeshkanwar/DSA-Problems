package TwoPointer;

public class CheckPalindrom {

    public static void main(String[] args) {
        String str = "racertecar";

        int i=0;
        int j=str.length() - 1;
        boolean isPalnidrom = true;

        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                isPalnidrom = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalnidrom);
    }
}
