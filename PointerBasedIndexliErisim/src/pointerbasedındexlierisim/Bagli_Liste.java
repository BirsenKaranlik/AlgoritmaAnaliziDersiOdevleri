/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointerbasedındexlierisim;

/**
 *
 * @author Birsen
 */
class Bagli_Liste {static Dugum bas, kuyruk;
    
    public void ekle(int sayi){
        Dugum yenidugum = new Dugum(sayi);
        if(bas == null){
            bas=yenidugum;
            kuyruk= yenidugum;
        }else{
            kuyruk.Sonraki=yenidugum;
            kuyruk=yenidugum;
        }
        
    }
    public void CikarKuyruk(){
        Dugum temp, onceki;
        temp = bas;
        if(temp== null){
            System.out.println("Bağlı Liste Boş");
           }else{
            System.out.println("kuyruktan çıkarılan sayı : "+bas.data);
            bas = bas.Sonraki;
        }
            
    }
    public void CikarYigin(){
        Dugum temp, onceki;
        temp = bas;
        onceki= temp;
        
        if(temp == null){
            System.out.println("Bağlı Liste Boş");
        }else{
            temp = temp.Sonraki;
            while(temp.Sonraki != null){
                onceki = temp;
                temp= temp.Sonraki;
            }
            System.out.println("yığından çıkarılan sayı :"+temp.data);
            kuyruk = onceki;
            kuyruk.Sonraki=null;
        }
    }
    public void Listele(){
        Dugum temp = bas;
        while(temp != null){
            System.out.print(temp.data + "-");
            temp=temp.Sonraki;
        }
        System.out.println("");
    }
    public void Bul(int sayi){
        Dugum temp = bas;
        while(temp.Sonraki != null){
            if(temp.data == sayi){
                System.out.println("Aranan sayi bağlı listede var");
                System.out.println("Aranan sayi : "+ temp.data);
            }
            temp = temp.Sonraki;
        
           
        }
     System.out.println("Aranan sayı bağlı listede yok!");
       
     
    } 
    public void IndexliErisim(int indexSayisi){
        Dugum temp = bas;
        int i=1;
        while(temp.Sonraki != null){
            if(i==indexSayisi){
                System.out.println("liste["+ indexSayisi +"]: "+temp.data);
                break;
            }
            i++;
            temp=temp.Sonraki;
            if(temp.Sonraki== null){
                System.out.println("Bağlı listeyi aşan bir index girdiniz ");
            }
            
        }
    }

   
    
}
