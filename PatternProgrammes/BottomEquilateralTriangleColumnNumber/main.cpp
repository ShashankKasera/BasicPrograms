#include <iostream>

using namespace std;

int main(){
     
     int n;
     
         cout << "Enter an odd number  ";
         cin >> n;
         
         for (int i = 1; i <= (n/2)+1; i++){
	         for (int j = 1; j <= n; j++){
	             if (j>=i && j<=n+1-i)
	                 cout <<j<< " ";
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
	1 2 3 4 5 6 7 8 9                                                                                                             
	  2 3 4 5 6 7 8                                                                                                               
	    3 4 5 6 7                                                                                                                 
	      4 5 6                                                                                                                   
	        5 

*/
