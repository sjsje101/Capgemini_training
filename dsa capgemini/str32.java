public class str32 {
    public static void main(String[] args) {
        String str="baaccad";
        String ans="";
        int i=0;
         
         System.out.println(answer(str,ans,i));
    } 
    public static String  answer(String str,String ans,int i){
        if(i==str.length()){
            return ans;
        }
        if(str.charAt(i)=='a')
        {
            return answer(str,ans,i+1);
             
        }
        else{
            ans=ans+str.charAt(i);
            return answer(str,ans,i+1);
           
        }
        


    }
}
