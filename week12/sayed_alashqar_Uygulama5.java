package sayed;

import java.util.Scanner;

public class Uygulama4 {
           public static void main(String[] args) {
        	   
        	   
        	   Scanner sc = new Scanner(System.in);
        	   System.out.print("bir kelim giriniz: ");
        	   String kelime= sc.nextLine();
        	   
        	  System.out.println("Girilen kelime= "+kelime);
        	  
        	  System.out.println("Kelimenin tersten yazilmis hali= "+tersten(kelime));
        	  
        		   
        	   }
           
           public static String tersten(String kelime) {
               
        	   String ters = "";
        	   for(int index = kelime.length();index>0;index--) {
        		   ters += kelime.substring(index-1,index);
        		  //abc a-0 b-1 c-2 substring(1,2)
        	   }
        	   //kelime
        	   //emilek
        	   return ters;
        	   
}
           
           public static double ortalama(int[] dizi) {
        	  double avg = 0.0;
        	  int total = 0;
        	  for (int index = 0; index < dizi.length; index++) {
        		  total += dizi[index];
        		  
        	  }
        	  avg = (double) total / dizi.length;
        	   return avg;
        	   
           }
}

           
           