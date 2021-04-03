
#include <stdio.h>

void main(){
    
    int n;
    printf("Enter a number ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(n-i<j)
              printf("%d ",i);
            else 
              printf("  ");
        }
        printf("\n");
    }
}

/*
============ OUTPUT ============
	
	Enter a number 9                                                                                                             
	         	1                                                                                                               
	              2 2                                                                                                               
	            3 3 3                                                                                                               
	          4 4 4 4                                                                                                               
	        5 5 5 5 5                                                                                                               
	      6 6 6 6 6 6                                                                                                               
	    7 7 7 7 7 7 7                                                                                                               
	  8 8 8 8 8 8 8 8                                                                                                               
	9 9 9 9 9 9 9 9 9 

*/