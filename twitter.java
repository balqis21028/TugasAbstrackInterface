/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.likeable;

/**
 *
 * @author ASUS
 */
class twitter implements Likeable{
    private String tweet;
    private String user;
    private int favorite;
    
    public void setTwitter(String user, String Tweet){
        this.user = user;
        this.tweet = tweet;
    }
    
    public String tweet(){
        return this.tweet;
    }
    public String user(){
        return this.user;
    }
    public void favorite(){
        this.favorite++;
    }
    public int totalFavorite(){
        return this.favorite;
    }
    @Override
    public void like(){
        this.favorite();
    }
    @Override
    public int totalLike(){
        return this.totalFavorite();
    }
    @Override
    public String platform(){
        return "Twitter";
    }
}
