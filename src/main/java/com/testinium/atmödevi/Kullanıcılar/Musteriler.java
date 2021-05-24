package com.testinium.atmödevi.Kullanıcılar;

import java.util.HashMap;
import java.util.Map;

public class Musteriler {

    public static Musteri bireyselMusteri1(){
        return new BireyselMusteri("123456", "12345678901", "Şahika Koçarslan", 12334.66f, "Çukurova/ADANA" );
    }

    public static Musteri bireyselMusteri2(){
        return new BireyselMusteri("543627","45678398715", "Burhan Altıntop", 4567.89f, "Nişantaşı/İSTANBUL" );
    }

    public static Musteri kurumsalMusteri1(){
        return new KurumsalMusteri("678903","76534790292", "Aslı Sütçüoğlu", 12255.76f, "Sütçüoğlu Holding" );
    }

    public static Musteri kurumsalMusteri2(){
        return new KurumsalMusteri("7805431","76525998733", "Volkan Sütçüoğlu",  12345632.3f, "Volkan A.Ş" );
    }

    public static Musteri bireyselMusteri3(){
        return new BireyselMusteri("976543","65473892019", "Dilber Koçarslan", 45567.89f, "Polatlı/ANKARA" );
    }

    public static Map<String, Musteri> MusterilerListe(){
        Map<String, Musteri> musterilerMap = new HashMap<String, Musteri>();
        musterilerMap.put(Musteriler.bireyselMusteri1().getHesapNo(), Musteriler.bireyselMusteri1());
        musterilerMap.put(Musteriler.bireyselMusteri2().getHesapNo(), Musteriler.bireyselMusteri2());
        musterilerMap.put(Musteriler.bireyselMusteri3().getHesapNo(), Musteriler.bireyselMusteri3());
        musterilerMap.put(Musteriler.kurumsalMusteri1().getHesapNo(), Musteriler.kurumsalMusteri1());
        musterilerMap.put(Musteriler.kurumsalMusteri2().getHesapNo(), Musteriler.kurumsalMusteri2());
        return musterilerMap;








    }








}
