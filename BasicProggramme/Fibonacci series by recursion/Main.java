import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		
		  int n;

          System.out.print("Enter how many term of fibonacci series you want see ");
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
  
          for(int i=1;i<=n;i++)
             System.out.print(" "+fibo(i));
	}
	
	public static int fibo(int i){

        if(i==1||i==2)
           return(1);
        else
           return(fibo(i-1)+fibo(i-2));
    }

}
