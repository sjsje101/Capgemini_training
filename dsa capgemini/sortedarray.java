
public class sortedarray{
    public static boolean   sort(int []arr,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
          return false;
        }
         return sort(arr,i+1);
    }
   public static void main(String[] args) {
    int []arr ={2,4,6,8,10};
     System.out.print(sort(arr,0));
   } 
}