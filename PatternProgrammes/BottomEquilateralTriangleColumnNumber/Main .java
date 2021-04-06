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
	                 System.out.print (j+" ");
	              else
	                 System.out.print ("  ");     
	      }
	      System.out.println ("");
         }
  }
}

/*
============ OUTPUT ============
	
	Enter an odd number 9                                                                                                         
	1 2 3 4 5 6 7 8 9                                                                                                             
	  2 3 4 5 6 7 8                                                                                                               
	    3 4 5 6 7                                                                                                                 
	      4 5 6                                                                                                                   
	        5 

*/