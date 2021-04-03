#include<stdio.h>
#include<conio.h>
//
main(){

 int n,f=1,i;

     system("cls");

     printf("Enter a number");
     scanf("%d",&n);

     for(i=n;i<=n;i--){

            f = f*i;

     if(i==1)
        break;

     }


     printf("factorial is %d",f);

     getch();
}
