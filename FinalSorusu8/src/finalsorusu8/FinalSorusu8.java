/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsorusu8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Birsen
 */
public class FinalSorusu8 {

   /**
     * @param args the command line arguments
     */
    static int newSize = 10;
    static int[] dizi = new int[newSize];
    static int i = 0;
    static int sayi=0;
    static  Random rnd= new Random();

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Kac elemanli sayi gireceksiniz: ");
        sayi= scan.nextInt();
       
       for ( i = 0; i < sayi; i++) {
        
         if (i >= dizi.length) {
                resize();
          }
         
         dizi[i]=rnd.nextInt(101); 
            
         System.out.println("dizinin"+(i+1)+". elmani:"+dizi[i]);
       }
       
       System.out.println("Dizinin tersten yazilmiş hali:");
       
       for(int j=sayi-1; j>=0; j--){
           
       System.out.println("dizinin"+(j+1)+". elmani:"+dizi[j]);}

    }
   private  static void resize(){
      
                int newSize = i * 2;
                int yeniDizi[] = new int[newSize];

                for (int i = 0; i < dizi.length; i++) {
                    yeniDizi[i] = dizi[i];
                }
                
                dizi = new int[newSize];
                
                for (int i = 0; i < yeniDizi.length; i++) {
                    dizi[i] = yeniDizi[i];

                }
   }

}
