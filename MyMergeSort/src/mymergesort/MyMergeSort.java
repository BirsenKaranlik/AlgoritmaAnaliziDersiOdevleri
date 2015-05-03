/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymergesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Birsen
 */
public class MyMergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         Scanner scan = new Scanner( System.in ); 
         int n, i;
        System.out.println("\nKac elemanlı bir dizi oluşturmak istersiniz? ");
        n = scan.nextInt();
        Random rnd= new Random();
        /* Make array of n elements */
        int inputArr[] = new int[ n ];
        System.out.print("Dizimizin sıralanmamiş hali\n");
        for(i=0; i<n; i++){
        inputArr[i]=rnd.nextInt(101);
        System.out.print(inputArr[i]+" ");
        }
         System.out.println();
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        System.out.println("\nDizinin siralanmiş hali");        
        for (i = 0; i < n; i++)
            System.out.print(inputArr[i]+" ");            
        System.out.println(); 
//        
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
         
            doMergeSort(lowerIndex, middle);
           
            doMergeSort(middle + 1, higherIndex);
          
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
               
                 System.out.println(array[k]+" üzerinde işlem yapiliyor " );
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
                   System.out.println(array[k]+" üzerinde işlem yapiliyor " );
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
            
        }
 
    }
}

