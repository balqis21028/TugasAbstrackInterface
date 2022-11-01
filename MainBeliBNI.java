/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.paymentmethode;

/**
 *
 * @author ASUS
 */
public class MainBeliBNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DebitBNI PaymentMethode = new DebitBNI();
        PaymentMethode.setBNI("12345");
        PaymentMethode.Deposit(50000000);
        Pembeli Balqis = new Pembeli();
        Balqis.setPembeli("Balqis", PaymentMethode);
        Balqis.beli("Iphone 14", 21000000);
        System.out.println("Saldo Terakhir Anda Rp."+PaymentMethode.CekSaldo());
        PaymentMethode.cekNamaPembayaran();
    }
    
}
