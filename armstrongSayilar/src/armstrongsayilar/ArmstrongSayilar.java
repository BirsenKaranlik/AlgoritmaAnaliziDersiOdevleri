/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongsayilar;

/**
 *
 * @author Birsen
 */
public class ArmstrongSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi,birler,onlar,yuzler;
        int toplam=0;
           System.out.println("3 basamakli Armstrong sayilar");
        for(int i=100; i<1000; i++){
            sayi=i;
            yuzler=sayi/100;
            sayi= sayi%100;
            onlar=sayi/10;
            birler=sayi%10;
            toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);
             
             if(toplam==i)
             System.out.println("    "+i);
             

        }
    }
    
}
