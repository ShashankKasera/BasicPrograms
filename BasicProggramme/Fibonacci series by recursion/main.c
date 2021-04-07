#include<stdio.h>

int fibo(int i){

  if(i==1||i==2)
    return(1);
  else
    return(fibo(i-1)+fibo(i-2));

}

void main(){

  int n;

  printf("Enter how many term of fibonacci series you want see ");
  scanf("%d",&n);
  
  for(int i=1;i<=n;i++)
      printf("%d ",fibo(i));

}
