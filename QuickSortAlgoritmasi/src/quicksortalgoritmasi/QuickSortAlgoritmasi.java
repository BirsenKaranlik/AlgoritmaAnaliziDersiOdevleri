/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksortalgoritmasi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Birsen
 */
public class QuickSortAlgoritmasi {

    /**
     * @param args the command line arguments
     */
          public static int swap=0;

   public int[] sort(int[] numbers){
         
        quickSort(numbers,0,numbers.length - 1);
         
        return numbers;
    }
     
    private void quickSort(int numbers[], int left, int right) {
          int index = partition(numbers, left, right);
          if (left < index - 1)
                quickSort(numbers, left, index - 1);
          if (index < right)
                quickSort(numbers, index, right);
    }
     
    // Pivot degerin solunda pivottan kucuk,
    // pivot degerin saginda pivottan buyuk
    // degerlerin olmasini saglar.
    // Geriye pivot'un dizi icerisindeki konumunu dondurur
    private int partition(int numbers[], int left, int right)
    {
          int i = left, j = right;
          // Pivot deger listenin ortasindan alinir
          int pivot = numbers[(left + right) / 2];
          
          // Listenin iki degere bolunmesi
          while (i <= j) {
             // Pivottan kucuk degerler uzerinde olundugu surece donulur
                while (numbers[i] < pivot)
                      i++;
             // Pivottan buyuk degerler uzerinde olundugu surece donulur
                while (numbers[j] > pivot)
                      j--;
             // Pivot'un sagindaki kucuk deger ile solundaki buyuk deger yer degistirilir.
                if (i <= j) {
                      swap=swap+1;
                      int tmp = numbers[i];
                      numbers[i] = numbers[j];
                      numbers[j] = tmp;
                      i++;
                      j--;
                }
          }
          
          return i;
    }
public static void main(String[] args) {
  Scanner scan = new Scanner( System.in ); 
 
  int arr[] = new int[ 10 ];
  Random rnd= new Random();
       System.out.print("Dizimizin sıralanmamiş hali\n");
        for(int i=0; i<10; i++){
        arr[i]=rnd.nextInt(101);
        System.out.print(arr[i]+",");
        }
QuickSortAlgoritmasi qsa = new QuickSortAlgoritmasi();
int[] sorted = qsa.sort(arr);
System.out.println("\nDizinin siralanmiş hali:");
for(int i : sorted)
System.out.print(i+",");
System.out.println("\nswap sayisi="+swap);

}
}