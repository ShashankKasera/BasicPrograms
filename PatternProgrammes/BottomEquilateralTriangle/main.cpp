#include <iostream>
using namespace std;
int main()
{
     
     int n = 0;
     
         cout << "Enter an odd number  ";
         cin >> n;
         
         for (int i = 1; i <= (n/2)+1; i++){
	         for (int j = 1; j <= n; j++){
	             if (j>=i && j<=n+1-i)
	                 cout << "* ";
	             else
	                 cout << "  ";     
	         }
	         cout << "\n";
         }
    return 0;
}


 /*
============ OUTPUT ============
	
	Enter a number 9                                                                                                            
	* * * * * * * * *                                                                                                             
	  * * * * * * *                                                                                                               
	    * * * * *                                                                                                                 
	      * * *                                                                                                                   
	        * 

*/
