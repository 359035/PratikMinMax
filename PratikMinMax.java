/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikminmax;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class PratikMinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] liste = {15, 12, 788, 1, -1, -778, 2, 0};
        int[] minListe=new int[liste.length];
        int[] maxListe=new int[liste.length];
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Rakam Giriniz:");
        int k=input.nextInt();
        int a=0,b=0;
        
        
        for(int i:liste){
            if(i<k){
                minListe[a]=i;
                a++;
            }
            if(i>k){
                maxListe[b]=i;
                b++;
            }
            
        }
        int min=maxListe[0];
        int max=minListe[0];
       
        

        for (int i : minListe) {
            if(i>max&&i<k){
                max=i;
            }
            
        }
        
        for(int i:maxListe){
            if(i<min&&i>k){
                min=i;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi :"+max);
        System.out.println("Girilen sayidan buyuk en yakin sayi :"+min);
    }

}
