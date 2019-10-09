/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang berisi pertanyaan
 */
public class IF110118005Latihan30Cakep {
        public static final String Reset = "\u001B[0m";
    	public static final String Black = "\u001B[30m";
    	public static final String Red = "\u001B[31m";
    	public static final String Green = "\u001B[32m";
    	public static final String Yellow = "\u001B[33m";
    	public static final String Blue = "\u001B[34m";
    	public static final String Purple = "\u001B[35m";
    	public static final String Cyan = "\u001B[36m";
    	public static final String White = "\u001B[37m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Red + "Kamu " + Green + "ngerjain sendiri " + Yellow + "latihan 17 sampe" + Blue + "latihan 30 ini?");
        System.out.print(Blue + "Jawab "  + Red + "(Yoi/Enggak) : " + Reset);
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        if (ans.equals("yoi"))
            System.out.print(Red+"\nCakep Bener." +Purple+ "Good Job.\n\n");
        else 
           System.out.println(Red+"\nTetap Cakep Sih. " + Cyan + "\nSing penting paham konsepnya yee." + Black + "\nKeep the code works dude" );
    }
            
        
        
        
    
    
}
