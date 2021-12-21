package sayed;

import java.util.*;

public class Uygulama6 {
          
           public static void main(String[] args) {
        	   //local deðiþken
        	   int x = 0;
        	   int[] arr = new int[4]; // 0 0 0 0
        	   x = x + 1;
        	   mystery(x, arr);
        	   System.out.println(x + " " + Arrays.toString(arr));   
        	   x = x + 1;
        	   mystery(x, arr);
        	   System.out.println(x + " " + Arrays.toString(arr));   
        	   
           }
           
           public static void mystery(int x, int[] arr) {
        	   //local deðiþken
        	   x = x + 1;
        	   arr[x] = arr[x] + 1;
        	   System.out.println(x + " " + Arrays.toString(arr));     
              
           }
          
           
}

