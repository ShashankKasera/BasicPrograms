#include <iostream>

using namespace std;

int main(){
     
     int n = 0;
     
         cout << "Enter an odd number  ";
         cin >> n;
         
         for (int i = 1; i <= (n/2)+1; i++){
	         for (int j = 1; j <= n; j++){
	             if (j>=i && j<=n+1-i)
	                 cout <<i<< " ";
	             else
	                 cout << "  ";     
	         }
	         cout << "\n";
         }
    
    return 0;
}

/*
============ OUTPUT ============
	                                                                                                           
	Enter an odd number 9                                                                                                           
	1 1 1 1 1 1 1 1 1                                                                                                             
	  2 2 2 2 2 2 2                                                                                                               
	    3 3 3 3 3                                                                                                                 
	      4 4 4                                                                                                                   
	        5 
*/