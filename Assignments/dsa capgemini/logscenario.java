import java.util.*;

public class logscenario {
    public static void main(String[] args) {
        System.out.println("enter the log entry in the LEVEL:MESSAGE format");
         Scanner sc = new Scanner(System.in);
         String log = sc.nextLine();
         int count=0;
            Stack<String> s = new Stack<>();
         Queue<String> q = new LinkedList<>();
         String temp = null;

        while(true){
        
         String [] parts = log.split(":");
         String level = parts[0];
         String message = parts[1];
         if(level.equals("ERROR"))
         {
            
            q.offer(log);
            System.out.println( "the log "+q.peek()+"is processed ");
            s.push(q.remove());
            System.out.println( "the log "+s.pop()+"is reprocessed ");
            if(temp==null||!message.equals(temp))
            {   temp=message;
                count = 1;
                
            }
            else{
                count = count+1;
            }
            if(count==3)
            {
                System.err.println("alert raised ");
                break;
            }

         }
         
         if(!level.equals("ERROR"))
         {
            q.offer(log);
            System.out.println( "the log "+q.peek()+"is processed ");
            q.remove();
         }
         System.out.println("enter the log entry in the LEVEL:MESSAGE format");
          log = sc.nextLine();
        }
    }
}
