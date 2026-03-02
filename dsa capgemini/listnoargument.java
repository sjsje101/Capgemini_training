import java.util.ArrayList;

public class listnoargument{
      
        public static ArrayList linears(int []arr,int target,int i)
            {
                ArrayList<Integer>list=new ArrayList<>();
                ArrayList<Integer>ans=new ArrayList<>();
            if(i==arr.length)
            {
                return list;
            }
            if(arr[i]==target)
            {
                list.add(i);
            }
            ans= linears(arr,target,i+1);
            list.addAll (ans);
            return list;
        }
        public static void main(String[] args) {
       
            int []arr={10,18,18,18,5};
            System.out.print(linears(arr,18,0));
             
        }
}

