package Recursion.String_Questions;

//Question 1:Remove all the "a" from a String?
public class Question1 {
    public static void main(String[] args) {
        String up = "baccab";
        remove("",up);
    }
    public static void remove(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            remove(p,up.substring(1));
        }else {
            remove(p+ch,up.substring(1));
        }
    }
}
