package proje001;

import java.util.Scanner;

public class MainClass {
	public void solve(double[][] A, double[] X)
    {
        int N = X.length;
        for (int k = 0; k < N; k++) 
        {
           
            int max = k;
            for (int i = k + 1; i < N; i++) 
                if (Math.abs(A[i][k]) > Math.abs(A[max][k])) 
                    max = i;
 
           
            double[] temp = A[k]; 
            A[k] = A[max]; 
            A[max] = temp;
 
          
            double t = X[k]; 
            X[k] = X[max]; 
            X[max] = t;
 
           
            for (int i = k + 1; i < N; i++) 
            {
                double factor = A[i][k] / A[k][k];
                X[i] -= factor * X[k];
                for (int j = k; j < N; j++) 
                    A[i][j] -= factor * A[k][j];
            }
        }
 
        printLastMatrix(A, X);
 
        double[] solution = new double[N];
        for (int i = N - 1; i >= 0; i--) 
        {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++) 
                sum += A[i][j] * solution[j];
            solution[i] = (X[i] - sum) / A[i][i];
        }        
      
        printSolution(solution);
    }
	
    public void printLastMatrix(double[][] A, double[] B)
    {
        int N = B.length;
        System.out.println("\n Matrix: ");
        for (int i = 0; i < N; i++)
           {
               for (int j = 0; j < N; j++)
                   System.out.printf("%.3f ", A[i][j]);
               System.out.printf("| %.3f\n", B[i]);
           }
           System.out.println();
    }
    /** function to print solution **/
    public void printSolution(double[] sol)
    {
        int N = sol.length;
        System.out.println("\nSolution : ");
        for (int i = 0; i < N; i++) 
            System.out.printf("%.3f ", sol[i]);   
        System.out.println();     
    }    
    /** Main function **/
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        /** Make an object of GaussianElimination class **/
        MainClass ge = new MainClass();
 
        System.out.println("\n kaçlýk matris");
        int N = scan.nextInt();
 
        double[] B = new double[N];
        double[][] A = new double[N][N];
 
        System.out.println("\nkatsayýlarý giriniz:[][] ");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                A[i][j] = scan.nextDouble();
 
        System.out.println("\n X matrisinin çüzümünü giriniz  ");
        for (int i = 0; i < N; i++)
            B[i] = scan.nextDouble();
 
        ge.solve(A,B);
    }
	
 
	 

	
	  
	  
	  

   
}
