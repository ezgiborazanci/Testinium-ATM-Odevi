package com.testinium.atmödevi.AtmIslemleri;

import com.testinium.atmödevi.Kullanıcılar.Musteri;

import java.util.Scanner;

public class ParaCekme {

    public void paraCekme(Musteri musteri){

        Musteri musteri2 = new Musteri();

        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
        Scanner input = new Scanner(System.in);
        float cekilecekMiktar = input.nextFloat();
        float müsteriBakiyesi = musteri2.getHesapBakiye();

        if(cekilecekMiktar > müsteriBakiyesi){

            System.out.println("Para çekmek için bakiyeniz yetersizdir... ");

        }else if (cekilecekMiktar < 0){

            System.out.println("Yanlış miktar girdiniz. \n Lütfen doğru miktar giriniz: ");
        }

        else {
            System.out.println("Çekilen Miktar: " + cekilecekMiktar);
        }


    }
}
