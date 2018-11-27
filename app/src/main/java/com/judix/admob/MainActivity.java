package com.judix.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import judix.com.admob.R;


public class MainActivity extends AppCompatActivity {
    public View view;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        //   --- Admob ---
        view=getWindow().getDecorView().getRootView();

        Admob.createLoadBanner(getApplicationContext(), view);
        Admob.createLoadInterstitial(getApplicationContext(),null);
        //   --- *** ---


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}

//Read me
// 1. Build gradle'a kütüphane eklendi
// 2. Manifest de gerekli izinler verildi ve gerekli bloklar eklendi... 22-25 satırlar
// 3. Admob class eklendi [Admob class da 2 farklı Blok var { Banner ve Tam ekran reklam için
// gerekli bloklar var burada onBackPresed metodu gibi metodlar ile reklamların ne zaman
// gösterileceğini ayarlayabiliyoruz.
// 4. MainActivity de 22-30 arası reklam kodları eklendi ( Burası Admob class ile alakalı
// MainActivity de reklamların ilk açılışta oluşturulması için ekleniyor. )
// Layoutlara Banner reklamlar yerleştirildi ( activity_main 11-24 arası )
// String.xml de Admob dan alınan reklam KEY leri eklendi.
