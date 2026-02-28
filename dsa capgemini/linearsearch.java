public class linearsearch{
    public static int linear(int []arr,int target,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        return linear(arr,target,i+1);
    }
    public static void main(String[] args) {
        int []arr={2,4,8,10,18,5,9,1};
        System.out.print(linear(arr,18,0));
         
    }
}
