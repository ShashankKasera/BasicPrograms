
#include <iostream>

using namespace std;

int fibo(int i){

  if(i==1||i==2)
    return(1);
  else
    return(fibo(i-1)+fibo(i-2));

}

int main()
{
  int n;

  cout<<"Enter how many term of fibonacci series you want see ";
  cin >> n;
  
  for(int i=1;i<=n;i++)
      cout<<" "<<fibo(i);
      
  return 0;
}

