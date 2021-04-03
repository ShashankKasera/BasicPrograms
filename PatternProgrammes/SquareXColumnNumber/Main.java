
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
	  2 3 4 5 6 7 8                                                                                                                 
	1   3 4 5 6 7   9                                                                                                               
	1 2   4 5 6   8 9                                                                                                               
	1 2 3   5   7 8 9                                                                                                               
	1 2 3 4   6 7 8 9                                                                                                               
	1 2 3   5   7 8 9                                                                                                               
	1 2   4 5 6   8 9                                                                                                               
	1   3 4 5 6 7   9                                                                                                               
	  2 3 4 5 6 7 8  
*/