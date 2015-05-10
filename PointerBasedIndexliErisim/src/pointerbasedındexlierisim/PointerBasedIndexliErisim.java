/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointerbasedındexlierisim;

import java.util.Scanner;

/**
 *
 * @author Birsen
 */
public class PointerBasedIndexliErisim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bagli_Liste liste= new Bagli_Liste();
        Scanner scan = new Scanner(System.in);
        liste.ekle(10);
        liste.ekle(20);
        liste.ekle(85);
        liste.ekle(66);
        liste.ekle(77);
        liste.ekle(21);
        liste.ekle(88);
        liste.ekle(42);
        liste.ekle(30);
        liste.ekle(45);
        liste.ekle(47);
        liste.ekle(39);
        liste.ekle(58);
        liste.ekle(22);
        liste.ekle(28);
       
        
        System.out.println("Listemizdeki elemanlar");
        liste.Listele();
        System.out.println();
        System.out.println("Hangi indexteki sayıyı istiyorsun?");
        int sayi = scan.nextInt();
        liste.IndexliErisim(sayi);
        System.out.println("Kuyruktan eleman çıkarılıyor");
        liste.CikarKuyruk();
        liste.Listele();
        System.out.println("Yığından eleman çıkarılıyor");
        liste.CikarYigin();
        liste.Listele();
         
       
}
}