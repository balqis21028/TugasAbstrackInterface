/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.likeable;

/**
 *
 * @author ASUS
 */
class SocialGraph {
    public static void compareLike(Likeable social1, Likeable social2) {
        if(social1.totalLike() > social2.totalLike()){
            System.out.println(social1.platform()+" "+social1.user());
            System.out.println("Lebih Populer Dari");
            System.out.println(social2.platform()+" "+social2.user());
        }else if(social1.totalLike() < social2.totalLike()){
            System.out.println(social2.platform()+" "+social2.user());
            System.out.println("Lebih Populer Dari");
            System.out.println(social1.platform()+" "+social1.user());
        }else{
            System.out.println("Kedua User Sama-Sama Populer");
        }
    }
}
