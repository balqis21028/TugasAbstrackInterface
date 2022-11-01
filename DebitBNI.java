/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentmethode;

/**
 *
 * @author ASUS
 */
class DebitBNI extends PaymentMethode {
    private int saldo;
    
    public void setBNI(String pin){
        if(pin == "12345"){
            System.out.println("Berhasil");
        }else{
            System.out.println("PIN Salah");
        }
    }
    private void catatTransaksi(String jenis, int jumlah){
        System.out.println("Mencatat Transaksi "+jenis+" Sejumlah Rp."+jumlah);
    }
   
    @Override
    public void Kredit(int jumlah){
        this.catatTransaksi("Transfer Keluar", jumlah);
        this.saldo -= jumlah;
    }
    @Override
    public void Deposit(int jumlah){
        this.catatTransaksi("Deposit Dana", jumlah);
        this.saldo += jumlah;
    }

    @Override
    public int CekSaldo(){
        return this.saldo;
    }
}
