public class triangle {
    public static void pattern(int x,int y){
        if(x==0){
            return;
        }
    
        if(y>0){
            
    System.out.print("*");
    pattern(x,y-1);
    }
    else{
        System.out.println();
        pattern(x-1,x-1);
    }
}

    

    public static void main(String[] args) {
        pattern(4,4);
    }
}

