/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.paymentmethode;

/**
 *
 * @author ASUS
 */
abstract class PaymentMethode {

    public void cekNamaPembayaran () {
        System.out.println("Anda Melakukan Metode Pembayaran Dengan "+getClass());
    }
    public abstract void Kredit(int jumlah);
    public abstract void Deposit(int jumlah);
    public abstract int CekSaldo();
}
