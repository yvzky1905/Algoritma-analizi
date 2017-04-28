#include <stdio.h>
#include <stdlib.h>
#define M 2  //bişrinci matrisin satır sayısı
#define N 3  //birinci matrisin sutun  ve ikinci matrisin satır  sayısı
#define P 2  // ikinci matrisin sutun  sayısıf

int main(int argc, char *argv[])
{
   int a[10][10],b[10][10],c[10][10]={ },i,j,k; 
    printf ("Birinci Matris:\n \n");    

    for (i = 0; i < M; i++)  
	{        					
    	for (j = 0; j < N; j++) 
		{      

        printf ("a[%d][%d]: ",i+1,j+1);      
        scanf ("%d", &a[i][j]);             
   		 }
    }
  
  
    
    
    
    printf ("\n\nIkinci Matris: \n \n");   

    for (j = 0; j < N; j++) 
	{          
   		 for (k = 0; k < P; k++) 
		{          

        printf ("b[%d][%d]: ",j+1,k+1);      
        scanf ("%d", &b[j][k]);             
	    }
	}
    
    
       			
				   
				
    for (i = 0; i < M; i++)     
	{       	       
    	for (j = 0; j < P; j++) 
		{       		  
    		for (k = 0; k < N; k++)            

        	c[i][j] += a[i][k] * b[k][j];         
   		 }
        printf("\n");
    }

    printf ("Sonuc Matrisi:\n");   

    for (i = 0; i < M; i++) 
	{            
    	for (k = 0; k < P; k++)      

        printf ("\t%d",c[i][k]);      
        printf ("\n");                
    }
    
    getch();                      
        
            
  
  system("PAUSE");	
  return 0;
}