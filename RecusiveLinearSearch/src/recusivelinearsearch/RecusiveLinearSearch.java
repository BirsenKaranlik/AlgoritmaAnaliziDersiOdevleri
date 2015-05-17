/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recusivelinearsearch;

import java.util.Scanner;

/**
 *
 * @author Birsen
 */
public class RecusiveLinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
      Scanner input = new Scanner( System.in );
 
      int aranacak_sayi; 
      int pozisyon;
 

      LinearArray searchArray = new LinearArray( 10 );
      System.out.println( searchArray );
 
      
      System.out.print(
         "Lütfen arama yapmak için integer bir sayi giriniz (-1 programı sonlandırır): " );
      aranacak_sayi = input.nextInt(); 
 
    
           
      while ( aranacak_sayi != -1 )
      {
         
         pozisyon = searchArray.performSearch( aranacak_sayi );
 
         if ( pozisyon == -1 ) 
            System.out.println( "Sayi = " + aranacak_sayi +
               " bulunamadı.\n" );
         else 
            System.out.println( "Sayi = " + aranacak_sayi +
               " bulunduğu pozisyon =  " + pozisyon + ".\n" );
 
         
         System.out.print(
            "Lütfen arama yapmak için integer bir sayi giriniz (-1 programı sonlandırır): " );
         aranacak_sayi = input.nextInt();
      } 
    }
}
