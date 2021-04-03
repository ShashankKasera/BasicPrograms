
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
                      if(i!=j && (n-i+1)!=j)
                        System.out.print(i+" ");
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
	  1 1 1 1 1 1 1                                                                                                                 
	2   2 2 2 2 2   2                                                                                                               
	3 3   3 3 3   3 3                                                                                                               
	4 4 4   4   4 4 4                                                                                                               
	5 5 5 5   5 5 5 5                                                                                                               
	6 6 6   6   6 6 6                                                                                                               
	7 7   7 7 7   7 7                                                                                                               	
	8   8 8 8 8 8   8                                                                                                               
	  9 9 9 9 9 9 9  
*/