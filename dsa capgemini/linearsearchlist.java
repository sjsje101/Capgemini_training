
import java.util.ArrayList;

public class linearsearchlist {
    
        public static ArrayList linears(int []arr,int target,int i,ArrayList<Integer> list)
        {
            if(i==arr.length)
            {
                return list;
            }
            if(arr[i]==target)
            {
                list.add(i);
            }
            return linears(arr,target,i+1,list);
        }
        public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
            int []arr={2,4,8,10,18,18,18,5,9,1};
            System.out.print(linears(arr,18,0,list));
             
        }
}

