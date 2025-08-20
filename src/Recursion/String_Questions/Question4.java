package Recursion.String_Questions;

//Question 4 : Sub String Question of a String?
public class Question4 {
    public static void main(String[] args) {
        subString("","abc");
    }
    static void subString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char a = up.charAt(0);
        subString(p+a,up.substring(1));
        subString(p,up.substring(1));
    }
}
