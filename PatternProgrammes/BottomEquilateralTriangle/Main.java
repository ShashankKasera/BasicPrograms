import java.util.Scanner; 
public class Main{
	
  public static void main(String[] args) {
		
     int n = 0;

         System.out.print ("Enter an odd number ");
         Scanner s = new Scanner (System.in);
         n = s.nextInt ();
         
         for (int i = 1; i <= (n/2)+1; i++){
	      for (int j = 1; j <= n; j++){
	          if (j>=i && j<=n+1-i)
	                 System.out.print ("* ");
	              else
	                 System.out.print ("  ");     
	      }
	      System.out.println ("");
         }
  }
}

 /*
============ OUTPUT ============
	
	Enter a number 9                                                                                                            
	* * * * * * * * *                                                                                                             
	  * * * * * * *                                                                                                               
	    * * * * *                                                                                                                 
	      * * *                                                                                                                   
	        * 

*/