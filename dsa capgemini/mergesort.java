import java.util.Arrays;

public class mergesort {
    public static int[] merges(int[] first,int []second)
{
    int[] mix= new int[first.length+ second.length];
    int i=0;
    int j=0;
    int k=0;

    while(i<first.length &&j<second.length)
    {
        if(first[i]<second[j])
        {
            mix[k]=first[i];
            i++;
        }
        else{
            mix[k]=second[j];
            j++;
        }
        k++;
    }

    while(i<first.length)
    {
        mix[k]=first[i];
        i++;
        k++;
    }
    while(j<second.length)
    {
        mix[k]=second[j];
        j++;
        k++;
    }

return mix;
}
    static int[] merge(int[]arr){
       if(arr.length== 1)
       {
        return arr;
       }
        int mid= arr.length/2;
        int []left = merge(Arrays.copyOfRange(arr,0, mid));
        int []right= merge(Arrays.copyOfRange(arr,mid,arr.length));
        return merges(left,right);
    }
    public static void main(String[] args) {
        int []arr ={3,5,9,4,6,8};
       arr= merge(arr);
       System.out.println(Arrays.toString(arr));
    }
}
