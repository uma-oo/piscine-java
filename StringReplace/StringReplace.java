
public class StringReplace <T>{
    public static <T> String replace(String s, T target, T  replacement) {
        // your code here
        String targetNew = String.valueOf(target);
        String replacementNew = String.valueOf(replacement); 
        String sNew = s.replace(targetNew, replacementNew); 
        return sNew; 
    }
}