
package masodik_ora;

import java.util.Random;
import java.util.Scanner;


public class Masodik_ora {


    public static void main(String[] args) {
        /*
        Scanner beolvas = new Scanner(System.in);
        int szam = beolvas.nextInt();
        
        Scanner beolvasSzoveg = new Scanner(System.in);
        String szoveg = beolvasSzoveg.nextLine();
        
        System.out.println(szam + szoveg);
        
        int[] tomb = new int[3];
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("Add meg a %d elemet: ", i + 1);
            tomb[i] = beolvas.nextInt();
        }
        
        for (int elem : tomb){
            System.out.println(elem);
        }
        
        int randomSzam = (int)(Math.random()*10 +10);
        System.out.println(randomSzam);
        
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        
        int[] tomb2 = new int[100];
        
        for (int i = 0; i < tomb2.length; i++) {
         
        }
        for (int elem : tomb2){
            System.out.print(elem + ", ");
        }
            
        int[] randomTomb = new int[50];
        Random tomb3 = new Random();
        
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = tomb3.nextInt(101); // 0 és 100 közötti random szám generálása
        }
        */




/*
        //Első feladat
        int[] tomb4 = new int[50];
        Random random = new Random();
        
        for (int i = 0; i < tomb4.length; i++) {
            tomb4[i] = random.nextInt(101);
        }
        
        int osszeg = 0;
        for (int i = 0; i < tomb4.length; i++) {
            osszeg += tomb4[i];
        }
        
        double atlag = (double) osszeg / tomb4.length;
        
        System.out.println("Az átlag" + atlag);
        
        //Második feladat        
        Scanner beolvas = new Scanner(System.in);
        
        
        int[] tomb = new int[5];
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("Add meg a %d elemet: ", i + 1);
            tomb[i] = beolvas.nextInt();
        }
        
        int legkisebb = tomb[0];
        int legnagyobb = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] < legkisebb) {
                legkisebb = tomb[i];
            }
            if (tomb[i] > legnagyobb) {
                legnagyobb = tomb[i];
            }
        }
        
        System.out.println("Legkisebb: " + legkisebb);
        System.out.println("Legnagyobb: " + legnagyobb);
        
        //Harmadik feladat
        int[] tomb2 = {1, 5, 10, 21, 210};
        int j = 0;
        
        while (tomb2[j] != 10 && j < tomb2.length) {
            j++;
        }
        if (j < tomb2.length) {
            System.out.printf("Van 10-es a %d. indexen. \n", j);
        } else{
            System.out.println("Nincs ilyen szám");
        }
        */
        
        
        int [][] ketDimenziosTomb = new int[5][3];
        Random randomSzam = new Random();
         for (int i = 0; i < ketDimenziosTomb.length; i++) {
            for (int k = 0; k < ketDimenziosTomb[i].length; k++) {
                ketDimenziosTomb[i][k] = randomSzam.nextInt(1000);
            }
        }
        
        
        for (int i = 0; i < ketDimenziosTomb.length; i++) {
            System.out.println();
            for (int k = 0; k < ketDimenziosTomb[i].length; k++) {
                System.out.printf("%5d ", ketDimenziosTomb[i][k]);
            }
        }
        
        
    }        
        
        
        
        
        
}

    

