
#include <stdio.h>

void main(){
    
    int n;
    printf("Enter a number ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%d ",j);
        }
        printf("\n");
    }
}

/*
============ OUTPUT ============

	Enter a number 9                                                                                                             
	1                                                                                                                             
	1 2                                                                                                                           
	1 2 3                                                                                                                         
	1 2 3 4                                                                                                                       
	1 2 3 4 5                                                                                                                     
	1 2 3 4 5 6                                                                                                                   
	1 2 3 4 5 6 7                                                                                                                 
	1 2 3 4 5 6 7 8                                                                                                               
	1 2 3 4 5 6 7 8 9  

*/



