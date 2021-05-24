package com.testinium.atmödevi.AtmIslemleri;
import com.testinium.atmödevi.Kullanıcılar.Musteri;
import com.testinium.atmödevi.Kullanıcılar.Musteriler;


import com.testinium.atmödevi.Kullanıcılar.Musteri;

import java.util.Scanner;

public class ParaYatırma {

    public void paraYatırma(Musteri musteri){

        Musteri musteri1 = new Musteri();


        System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
        Scanner input = new Scanner(System.in);
        float yatirilacakMiktar = input.nextFloat();
        float müsteriBakiyesi = musteri1.getHesapBakiye();

        if(yatirilacakMiktar < 0){

            System.out.println("Lütfen yatırılacak bir miktar giriniz: ");
        }

        else {

            float sonBakiye = yatirilacakMiktar;
            System.out.println("Yatırılan Miktar: " + sonBakiye);
        }


    }


}
