
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		
		int n=0;;
		System.out.print("Enter a number ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++){
                   for(int j=1;j<=n;j++){
                       if(n-i<j)
                          System.out.print(j+" ");
                       else 
                          System.out.print("  ");
                   }
                   System.out.println("");
                }
	}
}

/*
============ OUTPUT ============
	
	Enter a number 9  
			9                                                                                                             
	              8 9                                                                                                             
	            7 8 9                                                                                                             
	          6 7 8 9                                                                                                             
	        5 6 7 8 9                                                                                                             
	      4 5 6 7 8 9                                                                                                             
	    3 4 5 6 7 8 9                                                                                                             
	  2 3 4 5 6 7 8 9                                                                                                             
	1 2 3 4 5 6 7 8 9 

*/
