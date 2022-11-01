/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.paymentmethode;

/**
 *
 * @author ASUS
 */
public class MainBeliPaypal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paypal PaymentMethode = new Paypal();
        PaymentMethode.setPaypal("morgan@gmail.com", "12345");
        PaymentMethode.Deposit(12000000);
        Pembeli morgan = new Pembeli();
        morgan.setPembeli("Morgan", PaymentMethode);
        morgan.beli("Poster Smash Full Color", 100000);
        System.out.println("Saldo Terakhir Rp."+PaymentMethode.CekSaldo());
        PaymentMethode.cekNamaPembayaran();
    }
    
}
