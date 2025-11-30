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
            return;
        }
        char a = up.charAt(0);
        if(a=='a'){
            p += "";
        }else {
            p += a;
        }

        remove(p,up.substring(1));
    }
}
