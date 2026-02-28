
import java.util.Scanner;

public class cowgaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the aera of sq field");
        int sq = sc.nextInt();
        System.out.println("enter the length of rope");
        int l = sc.nextInt();
        double result=0;
        float centre = sq/2;
        if(l>centre)
        {
             result = (3.14*l*l)-(sq*sq);
            System.out.println(result);
        }
        else{
            result = (3.14*l*l);
        }
        System.out.println(result);

    }
}
