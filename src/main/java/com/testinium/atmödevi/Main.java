package com.testinium.atmödevi;

import com.testinium.atmödevi.AtmIslemleri.GirisYapma;
import com.testinium.atmödevi.AtmIslemleri.ParaCekme;
import com.testinium.atmödevi.AtmIslemleri.ParaYatırma;
import com.testinium.atmödevi.Kullanıcılar.Musteri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParaYatırma paraYatırma = new ParaYatırma();
        ParaCekme paraCekme = new ParaCekme();
        Musteri musteri = new Musteri();

        System.out.println("***************************************");
        System.out.println("ATM'ye HOŞGELDİNİZ");
        System.out.println("***************************************");

        GirisYapma girisYapma = new GirisYapma();
        girisYapma.girisYap();

        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemin numarasını giriniz: " );
        System.out.println("Para Yatırma için 1'e ");
        System.out.println("Para Çekme için 2'ye basınız...." );
        String numara = input.nextLine();

        if (numara.equals("1")) {


            paraYatırma.paraYatırma(musteri);


        } else if (numara.equals("2")) {


            paraCekme.paraCekme(musteri);

        } else {
            System.out.println("Lütfen gerçerli bir işlem giriniz... ");
        }





    }
}
