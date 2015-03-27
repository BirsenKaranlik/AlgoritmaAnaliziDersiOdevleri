/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekizvezir;

import java.util.Scanner;

/**
 *
 * @author Birsen
 */
public class SekizVezir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Fonksiyonlar nesne=new Fonksiyonlar();//--------------------fonksiyonların nesnesi

       
     char tahta[][];
     int yedek[][];

     int vezirsayisi=8;
     System.out.println("8 vezir üzerinde işlem yapıyoruz.");
   
    
     tahta=new char[vezirsayisi][];
     yedek=new int[vezirsayisi][];
     for(int i=0;i<vezirsayisi;i++){
     tahta[i]=new char[vezirsayisi];
     yedek[i]=new int[vezirsayisi];
     }
     nesne.randomvezir(tahta,vezirsayisi);
     System.out.println("8 vezir  rastgele olarak yerleştirildi.");
     System.out.println();
     nesne.ekranabas(tahta, vezirsayisi);
     
     nesne.kesisimsayilari(tahta,yedek,vezirsayisi);
      System.out.println();
      nesne.cakismaBul(tahta);
      
      System.out.println("Her bir vezirin gidebilecek diğer bütün durumları "
              + "ve o durumlara karşılık gelen çakışma sayıları bulundu.");
     nesne.ekranabaskesisim(yedek,vezirsayisi);
     
     nesne.vezirleriyerlestir(tahta,yedek,vezirsayisi);
     System.out.println();
     System.out.println("Çakışma sayılarına göre en küçüğü bulundu ve vezirler yerleştirildi");
     nesne.ekranabas(tahta, vezirsayisi);
    }
    }

