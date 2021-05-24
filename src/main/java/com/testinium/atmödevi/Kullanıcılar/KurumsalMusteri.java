package com.testinium.atmödevi.Kullanıcılar;

public class KurumsalMusteri extends Musteri {

    private String sirketAdi;

    public KurumsalMusteri(String hesapNo, String tcKimlikNo, String adSoyad, float hesapBakiye, String sirketAdi) {
        super(hesapNo, tcKimlikNo, adSoyad, hesapBakiye);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdı() {
        return sirketAdi;
    }


    public void setSirketAdı(String sirketAdı) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void ekranaYazdır() {
        super.ekranaYazdır();
        System.out.println("Kurum Adı:" + getSirketAdı());
    }
}
