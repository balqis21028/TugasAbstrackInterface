/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentmethode;

/**
 *
 * @author ASUS
 */
class Pembeli {
    private String nama;
    private PaymentMethode payment;
    
    public void setPembeli(String nama, PaymentMethode payment){
        this.nama = nama;
        this.payment = payment;
    }
    
    public void beli(String nama, int harga){
        if(this.payment.CekSaldo() < harga){
            System.out.println("Saldo Tidak Cukup");
        }else{
            this.payment.Kredit(harga);
            System.out.println("Terima Kasih "+this.nama);
            System.out.println("Anda Berhasil Membeli "+nama+" Seharga Rp."+harga);
        }
    }
}
