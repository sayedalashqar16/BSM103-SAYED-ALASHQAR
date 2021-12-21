package sayed;
import java.util.*;

public class Uygulama1 {

	
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kac ogrencinin notu girilecek?");
		int ogrenciSayisi = input.nextInt();
		
		System.out.println(ogrenciSayisi + " tane ogrencinin notu girilicektir.");
	   
		for (int i = 1; i <= ogrenciSayisi; i++) {
		System.out.println(i + ". ogrencinin vize notunu giriniz:");
		int vizeNotunu =input.nextInt();

		System.out.println(i + ". ogrencinin final notunu giriniz:");
		int finalNotu = input.nextInt();
		
		System.out.println("ogrencinin vize notu: "+ vizeNotuHesaplama(vizeNotunu));
		System.out.println("ogrencinin vize notu: "+ finalNotuHesaplama(finalNotu));
		
	  }
    }

   public static double vizeNotuHesaplama(int vizeNotu) {
	   double not = 0.0; 
	   if (vizeNotu >= 80) { 
		   not = vizeNotu * 1.10;
		  //100 * 1.1 = 110 
	   }
	   else if(vizeNotu >= 60) {
		   not = vizeNotu * 1.05;
		   
	   }
	   if(not > 100)
           not =100;
	     return not;
			   
   }
   
   public static double finalNotuHesaplama(int finalNotu) {
	   double not = 0.0; 
	   if (finalNotu >= 70) { 
		   not = finalNotu * 1.10;
		  //100 * 1.1 = 110 
	   }
	   else if(finalNotu >= 40) {
		   not = finalNotu * 1.05;
		   
	   }
	   if(not > 100)
           not =100;
	     return not;  
      }   
   }