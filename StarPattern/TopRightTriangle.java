
import java.util.Scanner; 
public class TopRightTriangle
{
	public static void main(String[] args) {
		
		int n=0;;
		System.out.print("Enter a number ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
              System.out.print("* ");
           }
           System.out.println("");
        }
	}
}

/*
Enter a number 10                                                                                                             
*                                                                                                                             
* *                                                                                                                           
* * *                                                                                                                         
* * * *                                                                                                                       
* * * * *                                                                                                                     
* * * * * *                                                                                                                   
* * * * * * *                                                                                                                 
* * * * * * * *                                                                                                               
* * * * * * * * *                                                                                                             
* * * * * * * * * *

*/
