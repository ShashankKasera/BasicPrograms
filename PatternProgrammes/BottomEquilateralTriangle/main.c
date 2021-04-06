
#include <stdio.h>

void main(){

    int n = 0;

         printf("Enter an odd number ");
         scanf("%d",&n);
         
         for (int i = 1; i <= (n/2)+1; i++){
	      for (int j = 1; j <= n; j++){
	          if (j>=i && j<=n+1-i)
	                 printf("* ");
	          else
	                 printf("  ");     
	      }
	      printf ("\n");
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