package TwoPointer;

public class BackspaceStringCompare {

    public static boolean compare(String s1,String s2) {

        int i = s1.length() - 1; int j = s2.length() - 1;

        while(i >= 0 || j >= 0){
            i = getNextValidIndex(s1,i);
            j = getNextValidIndex(s2,j);

            if(i < 0 && j < 0){
                return true;
            }
            if(i < 0 || j < 0){
                return false;
            }
            if(s1.charAt(i) != s2.charAt(j)){
                return false;
            }
            i--;
            j--;

        }
        return true;
    }

    public static int getNextValidIndex(String s , int index){
        int backspaceCount = 0;

        while(index > 0){
            if(s.charAt(index) == '#'){
                backspaceCount++;
            } else if(backspaceCount > 0){
                backspaceCount--;
            } else {
                break;
            }
            index--;
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println(compare("xy#z", "xzz#"));    // true
        System.out.println(compare("xy#z", "xyz#"));    // false
        System.out.println(compare("xp#", "xyz##"));    // true
        System.out.println(compare("xywrrmp", "xywrrmu#p")); // true
    }


}
