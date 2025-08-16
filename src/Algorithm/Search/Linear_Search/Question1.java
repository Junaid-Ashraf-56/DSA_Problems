package Algorithm.Linear_Search;

public class Question1 {
    public static boolean found(String name,char target){
        if (name.isEmpty()){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Junaid Ashraf";
        char target = 'u';
        System.out.println(found(name,target));
    }
}
