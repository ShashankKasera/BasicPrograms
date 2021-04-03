
#include <stdio.h>

void main(){
    
    int n;
    printf("Enter a number ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(n-i<j)
              printf("* ");
            else 
              printf("  ");
        }
        printf("\n");
    }
}

/*
============ OUTPUT ============
	
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


