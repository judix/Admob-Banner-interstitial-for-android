# Admob Banner & Interstitial Ads

### Adding admob adverts to your android studio easy

* Create a 1st grade library
``
implementation 'com.google.android.gms:play-services-ads:17.1.1'
``
* 2.The Manifest also received the necessary permissions and added the required blocks
```
 <uses-permission android:name="android.permission.INTERNET"/>
 <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
```
* 3.Added the Admob class.
* 4.advertising activity to show oncreate activity:
```
  MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713"); //TEST KEY
  view=getWindow().getDecorView().getRootView();

  Admob.createLoadBanner(getApplicationContext(), view);
  Admob.createLoadInterstitial(getApplicationContext(),null);
```
* Banner ads for layout:
```
   <com.google.android.gms.ads.AdView xmlns:ads="http://schemas.android.com/apk/res-auto"
        android:id="@+id/adView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        ads:adSize="BANNER"
        ads:adUnitId="ca-app-pub-3940256099942544/6300978111">
    </com.google.android.gms.ads.AdView>
```
* KEYs have been added for the ad from AdMob to String.xml.
```
 <string name="admob_showIntersitial_ad_unit_id">ca-app-pub-3940256099942544/1033173712</string>
 <string name="banner_ad_unit_id">ca-app-pub-3940256099942544/6300978111</string>
```

<h3> Banner & Interstitial </h3>
<table>
  <tr>
    <td><img src="screenshot/Screenshot_1543437239.png" width=300 alt="Bitcoin"></td>
    <td><img src="screenshot/Screenshot_1543437233.png"width=300 alt="Bitcoin QR code" width="300px"></td>
  </tr>
</table>
