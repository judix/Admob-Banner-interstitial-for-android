package com.judix.admob;

import android.content.Context;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import judix.com.admob.R;


public class Admob {

    public static InterstitialAd mInterstitial; // Interstital
    private static AdView mAdView; // banner

    public static void createLoadInterstitial(final Context context, View view)

    {

        mInterstitial = new InterstitialAd(context);
        mInterstitial.setAdUnitId(context.getResources().getString(
                R.string.admob_showIntersitial_ad_unit_id));
        mInterstitial.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // TODO Auto-generated method stub
                showInterstitial();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // TODO Auto-generated method stub

                super.onAdFailedToLoad(errorCode);
            }

            @Override
            public void onAdOpened() {
                // TODO Auto-generated method stub
                super.onAdOpened();

            }

            @Override
            public void onAdClosed() {
                // TODO Auto-generated method stub
                super.onAdClosed();

            }

            @Override
            public void onAdLeftApplication() {
                // TODO Auto-generated method stub
                // Called when an ad leaves the app (for example, to go to the
                // browser).

                super.onAdLeftApplication();
            }

        });

        loadInterstitial();

    }

    public static void loadInterstitial() {

        mInterstitial.loadAd(new AdRequest.Builder().
                addTestDevice("").//ca-app-pub-3940256099942544/1033173712
                build());
    }

    public static void showInterstitial() {
        if (mInterstitial.isLoaded()) {
            mInterstitial.show();
        }
    }

    public static void createLoadBanner(final Context context, View view) {
        mAdView = (AdView) view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().
                addTestDevice("").//ca-app-pub-3940256099942544/6300978111
                build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                // TODO Auto-generated method stub


                super.onAdLoaded();
            }

            @Override
            public void onAdClosed() {
                // TODO Auto-generated method stub

                super.onAdClosed();

            }

            @Override
            public void onAdOpened() {
                // TODO Auto-generated method stub

                super.onAdOpened();
            }

            @Override
            public void onAdLeftApplication() {
                // TODO Auto-generated method stub


                super.onAdLeftApplication();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // TODO Auto-generated method stub


                super.onAdFailedToLoad(errorCode);
            }

        });

    }

}