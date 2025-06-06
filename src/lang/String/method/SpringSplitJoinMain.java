package lang.String.method;

public class SpringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Orange,Banana";
        String[] strs = str.split(",");
        for(String s:strs){
            System.out.println(s);
        }

        String joinstr = "";
        for(String s:strs){
            joinstr += s+"-";
        }
        System.out.println(joinstr);

        String join = String.join(",", "Apple", "Orange", "Banana");
        System.out.println(join);
        String join1 = String.join("-", strs);
        System.out.println(join1);
    }
}
