public class subset {
    public static void main(String[] args) {
        String up="abc";
        String ans="";
        
        sub(up,ans);
    }
    public static void sub (String sub,String ans) {
        if(sub.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        sub(sub.substring(1),ans+sub.charAt(0));
        sub(sub.substring(1),ans);
    }
}
