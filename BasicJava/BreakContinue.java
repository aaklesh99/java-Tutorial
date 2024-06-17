

// public class Break_Continue {
    
// }


class BreakContinue {

    public static void main(String[] args) {
        // for(int i=1;i<=20;i++)
       // {
           // if(i%2==0)
           // {
           //     System.out.println(i);
           // }
           // System.out.println(i);
           // if(i%5==0)
           // {
           //     break;
           // }
           // if(i%3==0)
           // {
           //     continue;
           // }
           // System.out.println(i);

       // } 
           // Home Work :
           // Nested Loop
           // Labeled Loop
           // Break & Continue using nested Loop
           // Labeled Break and Continue
       
       // Labeled Loop
       outer: for(int i=1;i<=5;i++)
               {
                   internal: for(int j=1;j<=10;j++)
                   {
                       System.out.println(i*j);;
                   }
                   System.out.println("---------------------------------------");
               }
       
    }
}
