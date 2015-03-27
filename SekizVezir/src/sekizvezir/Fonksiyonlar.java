/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekizvezir;

import java.util.Random;


/**
 *
 * @author Birsen
 */
public class Fonksiyonlar {
    
  
    
    public void randomvezir(char tahta[][],int vezirsayisi){

     Random random=new Random();//------------------random nesne
    int satir,sutun,v=0,temp1=0,temp2=0;
   do{
    satir=random.nextInt(vezirsayisi);
    sutun=random.nextInt(vezirsayisi);
  for(int i=0;i<vezirsayisi;i++){
  if(tahta[satir][i]!='1')
      temp1=0;
  else{ temp1=1;
  break;
  }
  }
   for(int i=0;i<vezirsayisi;i++){
  if(tahta[i][sutun]!='1')
      temp2=0;
  else{ temp2=1;
  break;
  }
  } 
   if(temp1==0){
   if(temp2==0){
       tahta[satir][sutun]='1';
   v++;
   }
   }

   } while(v!=vezirsayisi);

    for(int i=0;i<vezirsayisi;i++){
for(int j=0;j<vezirsayisi;j++){
if(tahta[i][j]!='1')
    tahta[i][j]='0';
}
    }
    }
    public void cakismaBul(char[][] tahta) {
        int vezirsayisi = 0;
        int sutun = 0;
        int satir = 0;

      
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (tahta[i][j] == '1') {
                    satir = i;
                    sutun = j;
                    while (satir > 0 && sutun > 0) {
                        satir--;
                        sutun--;
                        if (tahta[satir][sutun] == '1') {
                            vezirsayisi++;
                        }

                    }
                    satir = i;
                    sutun = j;
                    while (satir < 7 && sutun < 7) {
                        satir++;
                        sutun++;
                        if (tahta[satir][sutun] == '1') {
                            vezirsayisi++;
                        }
                    }
                    satir = i;
                    sutun = j;
                    while (satir < 7 && sutun > 0) {
                        satir++;
                        sutun--;
                        if (tahta[satir][sutun] == '1') {
                            vezirsayisi++;
                        }
                    }
                    satir = i;
                    sutun = j;
                    while (satir > 0 && sutun < 7) {
                        satir--;
                        sutun++;
                        if (tahta[satir][sutun] == '1') {
                            vezirsayisi++;
                        }
                    }

                    for (int k = 0; k < 8; k++) {
                       
                        if (tahta[i][j] == tahta[i][k] && j != k) {
                            vezirsayisi++;
                        }
                    }
                }
            }
        }

        System.out.println("Tahta üzerinde çakışan vezir sayisi: " + vezirsayisi);
    }
  
    
public void ekranabas(char tahta[][],int vezirsayisi)
    {
    System.out.print("  ");
    for(int i=0;i<vezirsayisi;i++)
      System.out.print(i+"  ");
    System.out.println();
for(int i=0;i<vezirsayisi;i++){
    System.out.print(i);
for(int j=0;j<vezirsayisi;j++){
System.out.print(" "+tahta[j][i]+" ");
}
System.out.println();
}
}
public void ekranabaskesisim(int yedek[][],int vezirsayisi)
   
    {
       int cakismasay=0;  
    System.out.print("  ");
    for(int i=0;i<vezirsayisi;i++)
      System.out.print(i+"  ");
    System.out.println();
for(int i=0;i<vezirsayisi;i++){
    System.out.print(i);
for(int j=0;j<vezirsayisi;j++){
System.out.print(" "+yedek[j][i]+" ");
cakismasay=cakismasay+yedek[j][i];
}
System.out.println();
}
System.out.println("Toplam çakişmaların sayısı:"+cakismasay);
}
public void kesisimsayilari(char tahta[][],int tahta2[][],int vezirsayisi){
    int temp=0;
   
    int satir,sutun;
for(int i=0;i<vezirsayisi;i++)
{
for(int j=0;j<vezirsayisi;j++)
{
    satir=i;
    sutun=j;
for(int k=0;k<vezirsayisi;k++){
    if(tahta[k][satir]=='1')
       temp++;
   
        
}
for(int k=0;k<vezirsayisi;k++){
    if(tahta[sutun][k]=='1')
       temp++;
}
    //çapraz tarama
while(satir!=0&&sutun!=0){
 if(tahta[satir][sutun]=='1'){
     if(tahta[i][j]=='1'){}
         else
     temp++;
      
    }
 satir--;
 sutun--;
     }
     satir=i;
    sutun=j;
   while(satir!=vezirsayisi&&sutun!=vezirsayisi){
 if(tahta[satir][sutun]=='1'){
     if(tahta[i][j]=='1'){}
         else
     temp++;
     
    }
 satir++;
 sutun++;
     }
     satir=i;
    sutun=j;
   while(satir!=0&&sutun!=vezirsayisi){
 if(tahta[satir][sutun]=='1'){
     if(tahta[i][j]=='1'){}
         else
     temp++;
      
    }
 satir--;
 sutun++;
     }
     satir=i;
    sutun=j;
   while(satir!=vezirsayisi&&sutun!=0){
 if(tahta[satir][sutun]=='1'){
     if(tahta[i][j]=='1'){}
         else
     temp++;
     
    }
 satir++;
 sutun--;
     }
//-----------
    tahta2[i][j]=temp;
    temp=0;
   
  }
}

   

}
 
//****************************************************************************
public void vezirleriyerlestir(char tahta[][],int tahta2[][],int vezirsayisi){
    Fonksiyonlar nesne2=new Fonksiyonlar();
int satir=0,sutun=0,temp=1,max=vezirsayisi,satir2=0;
    for(int i=0;i<vezirsayisi;i++){
        //---------------------------------
       for(int j=0;j<vezirsayisi;j++){
        if(tahta[j][i]=='1'){
            satir=i;
        sutun=j;
        break;
        }
         }
    //****************************************
while(temp==1){
for(int j=vezirsayisi-1;j>=0;j--){
if(tahta[sutun][j]!='1'){
if(tahta2[sutun][j]<=max){
    max=tahta2[sutun][j];
    satir2=j;
}
}
}
max=vezirsayisi;
tahta[sutun][satir2]='1';
tahta[sutun][satir]='0';
satir=satir2;
nesne2.kesisimsayilari(tahta,tahta2,vezirsayisi);
for(int j=0;j<vezirsayisi;j++){
if(j!=sutun){
if(tahta[j][satir]=='1'){
sutun=j;
temp=1;
break;
}
}
 else
     temp=0;
}

nesne2.kesisimsayilari(tahta,tahta2,vezirsayisi);
}
}
}

   
}
    

