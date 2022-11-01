/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.likeable;

/**
 *
 * @author ASUS
 */
public class MainSocialGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        facebook fbTukul = new facebook();
        fbTukul.setFacebook("Tukul Arwana", "Kembali ke laptop!");
        fbTukul.like();
        fbTukul.like();
        
        twitter twJokowi = new twitter();
        twJokowi.setTwitter("Joko Widodo", "Aku ra popo..");
        twJokowi.favorite();
        twJokowi.favorite();
        twJokowi.favorite();
        
        SocialGraph socialGraph = new SocialGraph();
        socialGraph.compareLike(fbTukul, twJokowi);
    }
}
    
