//on exception handeling
import java.util.Scanner;
public class Mypac
    {
       public static void main(String[] args)
   {
      for(int i=0; i<3; i++){
      try
        {
          int[] lucky_no={1,23,32,12,23,45,12,32,12,43};
          Scanner cin = new Scanner(System.in);
          System.out.println("hello enter the the index");
          int QE = cin.nextInt();
          {System.out.println("sir your element for index"+" "+QE+" "+"is"+" "+lucky_no[QE]);
          }
     }
      catch (ArrayIndexOutOfBoundsException obj){
       {
           System.out.println("hello sir don't go beyond");
       }
      }
      finally
       {

         System.out.println("have a good day");
       }
}
}
}
		
			
			
