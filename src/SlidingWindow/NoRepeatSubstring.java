package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {

    public static void main(String[] args) {
        String str = "abcadef";

        int start =0;
        int maxLength = 0;

        Map<Character,Integer> frequencyMap = new HashMap();
        for(int end = 0; end < str.length(); end++){
            if(frequencyMap.containsKey(str.charAt(end))){
                start = Math.max(start,frequencyMap.get(str.charAt(end)) + 1);
//                start = end;
            } else {
                frequencyMap.put(str.charAt(end),end);
            }
            maxLength = Math.max(maxLength,end - start + 1);
        }

        System.out.println(maxLength);
    }
}
