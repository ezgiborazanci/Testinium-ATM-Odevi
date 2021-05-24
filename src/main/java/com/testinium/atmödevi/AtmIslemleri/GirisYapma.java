package com.testinium.atmödevi.AtmIslemleri;

import com.testinium.atmödevi.Kullanıcılar.Musteri;
import com.testinium.atmödevi.Kullanıcılar.Musteriler;


import com.testinium.atmödevi.Kullanıcılar.Musteri;
import com.testinium.atmödevi.Kullanıcılar.Musteriler;

import java.util.Scanner;

public class GirisYapma {


    public void girisYap(){

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hesap numaranızı giriniz: ");
        String hesapNo = input.nextLine();

        if(Musteriler.MusterilerListe().containsKey(hesapNo)){

            Musteriler.MusterilerListe().get(hesapNo).ekranaYazdır();
        }

        else {
            System.out.println("Hatalı hesap numarası girdiniz...");
        }







    }



}
