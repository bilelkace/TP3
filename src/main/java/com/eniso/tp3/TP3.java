/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp3;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author bilel
 */
public class TP3 {

    public static void main(String[] args) throws IOException {


       FileHandler fileHandler = new FileHandler("file.log");

       int lineIndexToReverse = 1 ;
       fileHandler.reverseString(lineIndexToReverse) ;

       int lineIndexToRemoveDuplicates = 2 ;
       fileHandler.removeDuplicates(lineIndexToRemoveDuplicates) ;

       String pattern =  "epoch" ;
       ArrayList <String>linesWithPatterns = fileHandler.findLineWithPattern(pattern);
        String str1 = "hello";
        String str2 = "Hello" ;
        System.out.println("comparaison avec equals : " + fileHandler.compareString1(str1 , str2));

        String str3 = "hello";
        String str4 = "Hello" ;
        System.out.println("comparaison avec equalsIgnoreCase : " + fileHandler.compareString2(str3 , str4));

       System.out.println("comparaison avec == : " + fileHandler.compareString3(str3 , str4));

        System.out.println("comparaison avec == : " + fileHandler.compareString2(new String ("hello") , "hello"));

       System.out.println("comparaison avec == : " + fileHandler.compareString2(new String ("hello") , new String("hello")));

     System.out.println("ligne contenant le motif ' " + pattern + "':" + linesWithPatterns.get(0));


     String Key = "secret" ;
     String plaintext = "Hello , world" ;
     XORCipher xorCipher = new XORCipher(Key) ;
     String encryptedText = xorCipher.encrypt(plaintext) ;
     String decyptedText = xorCipher.decrypt(encryptedText);
     System.out.println("Texte chiffré:" + encryptedText);
     System.out.println("Texte déchiffré:" +decyptedText);
     








    }
}
