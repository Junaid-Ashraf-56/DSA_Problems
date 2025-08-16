package Recursion.String_Questions;
//Question 3.Skip app but should not be start with apple?
class Question3 {
    public static void main(String[] args) {
        String up = "Apple is a app";
        System.out.println(skip(up));
    }
    public static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app")&& !up.startsWith("apple")){
            return skip(up.substring(3));
        }else {
            return up.charAt(0)+skip(up.substring(1));
        }
    }
}