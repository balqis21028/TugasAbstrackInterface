/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.likeable;

/**
 *
 * @author ASUS
 */
class facebook implements Likeable{
    private String status;
    private String user;
    private int like;
    
    public void setFacebook(String user, String status){
        this.user = user;
        this.status = status;
    }
    public String status(){
        return this.status;
    }
    @Override
    public String user(){
        return this.user;
    }
    @Override
    public void like(){
        this.like++;
    }
    @Override
    public int totalLike(){
        return this.like;
    }
    @Override
    public String platform(){
        return "Facebook";
    }
}
