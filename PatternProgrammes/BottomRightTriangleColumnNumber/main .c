
#include <stdio.h>

void main(){
    
    int n;
    printf("Enter a number ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i<=j)
              printf("%d ",j);
            else 
              printf("  ");
        }
        printf("\n");
    }
}

/*
============ OUTPUT ============
	
	Enter a number 10                                                                                                             
	
	1 2 3 4 5 6 7 8 9                                                                                                             
	  2 3 4 5 6 7 8 9                                                                                                             
	    3 4 5 6 7 8 9                                                                                                             
	      4 5 6 7 8 9                                                                                                             
	        5 6 7 8 9                                                                                                             
	          6 7 8 9                                                                                                             
	            7 8 9                                                                                                             
	              8 9                                                                                                             
	                9 

*/