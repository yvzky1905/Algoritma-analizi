package proje001;

import java.util.ArrayList;



public class MainClass {
		
	public static int step =0;
   public static void main(String[] args) {
	   
	   MainClass obj = new MainClass();
	  int sayi=obj.fib(100);
	   System.out.println("step sayisi :"+ obj.step);
	   obj.step=0;
	   
	   sayi= obj.fib(6);
	   System.out.println("step sayisi :" +obj.step);
	  
   }

   public int array[] = new int[1000];
   
   public int fib(int n){
	   step++;
	   if(n<2)
		   return n;
	   if(array[n]!=0){
		   return array[n];
	   }
	   else { 
		   
		   array[n]=fib(n-1) + fib(n-2);
		   return array[n];
	   }
	   

	   
   }
}

