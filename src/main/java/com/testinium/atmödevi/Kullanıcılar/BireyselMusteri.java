package com.testinium.atmödevi.Kullanıcılar;

public class BireyselMusteri extends Musteri {

    private String evAdres;

    public BireyselMusteri(String hesapNo, String tcKimlikNo, String adSoyad, float hesapBakiye, String evAdres) {
        super(hesapNo, tcKimlikNo, adSoyad, hesapBakiye);
        this.evAdres = evAdres;

    }

    public String getEvAdres() {
        return evAdres;
    }

    public void setEvAdres(String evAdres) {
        this.evAdres = evAdres;
    }

    @Override
    public void ekranaYazdır() {
        super.ekranaYazdır();
        System.out.println("Ev Adresiniz: " + getEvAdres());
    }
}

