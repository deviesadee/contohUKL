/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author 2nd
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int sukuPertama =3;
  int selisih =5;
  int jumlahSuku =10;
  int SukuSekarang;
  int jumlahderet =0;
  
  
  for(int i =1; i <=jumlahSuku; i++){
      
      SukuSekarang =sukuPertama;
     
      sukuPertama +=selisih;
      System.out.println("Suku ke -"+ i + "adalah :" +SukuSekarang);
      
      
      jumlahderet +=SukuSekarang;
  }
  
  System.out.println("jumlah deret adalah" + jumlahderet);
  }// TODO code application logic here
    }
    


    
    

