/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package devinelenombre;

/**
 * Matthieu Leras-Iriarte TD E 11/11/2026
 * @author matth
 */
import java.util.Random;
import java.util.Scanner;
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random=new Random();
        int Nombre_Secret= random.nextInt(100)+1; //Nombre entre 1 et 100
        System.out.println("Nombre secret:"+Nombre_Secret);
        
        int proposition=0;
        System.out.println("Devinez le nombre entre 1 et 100!");
        while (proposition!=Nombre_Secret){
            System.out.println("Votre proposition:");
            Scanner sc=new Scanner(System.in);
            proposition=sc.nextInt();
        }
        System.out.println("Bravo! Vous avez gagne!");
    }
    
}
