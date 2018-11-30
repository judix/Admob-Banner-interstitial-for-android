# Admob Banner & Interstitial Ads

### Adding admob adverts to your android studio easy

* Create a 1st grade library
``
implementation 'com.google.android.gms:play-services-ads:17.1.1'
``

* 2.Add your AdMob App ID to your app's ``AndroidManifest.xml`` file by adding the ``<meta-data>`` tag shown below. You can find your App ID in the AdMob UI. For ``android:value`` insert your own AdMob App ID in quotes, as shown below.
```
<manifest>
    <application>
        <!-- Sample AdMob App ID: ca-app-pub-3940256099942544~3347511713 -->
        <meta-data
            // ---
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="[ADMOB_APP_ID]"/>
            // ---
    </application>
</manifest>
```
* Before loading ads, have your app initialize the Mobile Ads SDK by calling ``MobileAds.initialize()`` with your AdMob App ID. This needs to be done only once, ideally at app launch.

Here's an example of how to call the ``initialize()`` method in an Activity:
```
 // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "YOUR_ADMOB_APP_ID");
```
* 3.And The ``Manifest.xml`` also received the necessary permissions and added the required blocks
```
 <uses-permission android:name="android.permission.INTERNET"/>
 <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
```
* 4.Added the ``Admob.java`` class. [Go to ``Admob.java`` class](/app/src/main/java/com/judix/admob/Admob.java )
* 5.advertising activity to show oncreate activity:
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
* KEYs have been added for the ad from AdMob to ``String.xml``.
```
  //Test ads key
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
