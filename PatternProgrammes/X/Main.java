
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
                      if(i==j || (n-i+1)==j)
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
        1               9                                                                                                             
	  2           8                                                                                                               
	    3       7                                                                                                                 
	      4   6                                                                                                                   
	        5                                                                                                                     
	      4   6                                                                                                                   
	    3       7                                                                                                                 
	  2           8                                                                                                               
	1               9
*/