
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		int x=0;
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter String");

        String s = sc.nextLine();  
		
		x=myAtoi(s);
		
		System.out.println("Integer value is "+x);
	}
	
	public static int myAtoi(String s) {   
            String result="";
            int flage =0;
            
            for(int i=0;i<s.length();i++){
              int chear=s.charAt(i);
              
              if(s.charAt(i)!=' '){
                  if(((chear<=97 && chear>=97) || (chear<=65 && chear>=90)) && flage==0) {
                       break;
                  }else if((s.charAt(i)=='-' || s.charAt(i)=='+') && flage==0){
                     if(result.equals("-")||result.equals("+")) {
                         result = "";
                         break;
                     }else{
                         result=result+s.charAt(i);
                         flage=1;  
                     }
                  }else if((chear<=57 && chear>=48) ){
                       result=result+s.charAt(i); 
                          flage=1;  
                  }else
                      break;   
              }else if(flage==1)
                  break;
            }
       if(result.length()==0||result.equals("+")||result.equals("-"))
           return(0); 
       return (int)Double.parseDouble(result);    
    }
}
