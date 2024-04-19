/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3;

/**
 *
 * @author bilel
 */
public class XORCipher {

    private String key;

    public XORCipher(String key) {
        this.key = key;
    }

   public String encrypt(String plaintext) {
    StringBuilder ciphertextBuilder = new StringBuilder();
    for (int i = 0; i < plaintext.length(); i++) {  // Ajout de la variable i et de sa boucle
        char c = plaintext.charAt(i);
        char encryptedChar = (char) (c ^ key.charAt(i % key.length()));
        ciphertextBuilder.append(encryptedChar);
    }
    return ciphertextBuilder.toString();
}




    public String decrypt(String ciphertext) {
    StringBuilder plaintextBuilder = new StringBuilder();
    for (int i = 0; i < ciphertext.length(); i++) { 
        char c = ciphertext.charAt(i);
        char decryptedChar = (char) (c ^ key.charAt(i % key.length()));
        plaintextBuilder.append(decryptedChar);
    }
    return plaintextBuilder.toString();
}

}


