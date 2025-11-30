package Recursion.String_Questions;

import java.util.ArrayList;
import java.util.List;

//Question 4 : Sub String Question of a String?
public class Question4 {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        subString("","abc",ans);
        System.out.println(ans);
    }
    static void subString(String p,String up,List<String> ans){
        if(up.isEmpty()){
            if (p.isEmpty()){
                ans.add(":)");
            }else {
                ans.add(p);
            }
            return;
        }
        char a = up.charAt(0);
        subString(p+a,up.substring(1),ans);
        subString(p,up.substring(1),ans);
    }
}
