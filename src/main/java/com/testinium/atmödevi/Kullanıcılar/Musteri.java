package com.testinium.atmödevi.Kullanıcılar;

public class Musteri {

    private String tcKimlikNo;
    private String adSoyad;
    private float hesapBakiye;
    private String hesapNo;

    public Musteri(String hesapNo, String tcKimlikNo, String adSoyad, float hesapBakiye) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiye = hesapBakiye;
        this.hesapNo = hesapNo;
    }

    public Musteri() {
    }

    public String getTcKimlikNo() { return tcKimlikNo; }

    public String getAdSoyad() { return adSoyad; }

    public float getHesapBakiye() { return hesapBakiye; }

    public float setHesapBakiye(float hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
        return hesapBakiye;
    }

    public String getHesapNo() { return hesapNo; }

    public void ekranaYazdır(){
        System.out.println("**************************************");
        System.out.println("Bilgileriniz: " + "\n" + "TC Kimlik Numaranız: " + getTcKimlikNo());
        System.out.println("Ad Soyad: " + getAdSoyad());
        System.out.println("Hesap Bakiyeniz: " + getHesapBakiye());
    }

}
