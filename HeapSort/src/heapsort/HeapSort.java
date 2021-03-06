/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

/**
 *
 * @author Birsen
 */

 
import java.util.Random;
import java.util.Scanner;
 
/* Class HeapSort */

public class HeapSort 
{    
    private static int N;
    /* Sort Function */
    public static void sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */ 
    static int comSayisi=0;
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i]){
            max = left; 
            comSayisi++;
        } 
        if (right <= N && arr[right] > arr[max])  {      
            max = right; 
            comSayisi++;
            
        }
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
            comSayisi++;
        }
    }    
    /* Function to swap two numbers in an array */
    static int swapSayisi=0;
    public static void swap(int arr[], int i, int j)
    {
        
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        swapSayisi++;
        
       
    }    
    /* Main method */
    
    public static void main(String[] args) 
    {
       
        Scanner scan = new Scanner( System.in );        
        System.out.println("Heap Sort Test\n");
        int n, i;    
        /* Accept number of elements */
        System.out.println("\nKac elemanlı bir dizi oluşturmak istersiniz? ");
        n = scan.nextInt();
        Random rnd= new Random();
        
        /* Make array of n elements */
        int arr[] = new int[ n ];
        System.out.print("Dizimizin sıralanmamiş hali\n");
        for(i=0; i<n; i++){
        arr[i]=rnd.nextInt(101);
        System.out.print(arr[i]+" ");
        }
        sort(arr);
        System.out.println("\nDizinin siralanmiş hali");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println(); 
        System.out.println("swap sayisi= "+swapSayisi);
        System.out.println("comparation sayisi= "+comSayisi);
    }    

   
}