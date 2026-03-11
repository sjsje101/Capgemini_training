public class rotatedbinarysearch {
  public static int rotated(int[]ar,int s,int e,int key)
  {
    int m=s+(e-s)/2;
    if(e<s)
    {
        return -1;
    }
    if(ar[m]==key)
    {
        return m;
    }
   if(ar[s]<=ar[m])
   {
    if((key<=ar[m]))
    {
        return rotated(ar,s,m-1,key);
    }
    else{
        return rotated(ar,m+1,e,key);
    }
}
if(ar[s]>=ar[m]){
    //  return rotated(ar,m+1,e,key); 
    if(ar[e]>=key)
    {
        return rotated(ar,m+1,e,key);
    }
    else{
        return rotated(ar,s,m-1,key);
    }
    // else{
    //     return rotated(ar,s,m-1,key);
    // }
}
    return -1;

  }
    public static void main(String[] args) {
        int arr[]={5,6,1,2,3,4};
        int start=0;
        int end=arr.length-1;
        int key=6;
        System.out.println(rotated(arr,start,end,key));
    }
}
