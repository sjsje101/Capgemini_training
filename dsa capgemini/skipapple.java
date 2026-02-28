public class skipapple {
    public static void main(String[] args) {
        String up="abcdeapplefg";
        System.out.println(apple(up));
    }
    public static String apple(String up) {
        if(up.isEmpty())
        {
            return " ";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple"))
        {
             return apple(up.substring(5));
        }
        else{
            return ch+apple(up.substring(1));
        }
    }
}
