package Recursion.String_Questions;

//Question 2:Skip a word from a String?
public class Question2 {
    public static void main(String[] args) {
        String up  = "apple is tasty";
        System.out.println(skipApple(up));
    }
    public static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
