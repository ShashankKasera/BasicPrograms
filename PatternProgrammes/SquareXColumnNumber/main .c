
#include <stdio.h>

void main(){
    
    int n;
    printf("Enter a number ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i!=j && (n-i+1)!=j)
              printf("%d ",j);
            else 
              printf("  ");
        }
        printf("\n");
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
