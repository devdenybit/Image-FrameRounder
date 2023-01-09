package com.henie.finalproject;



import static com.henie.heniefont.GetLoadAsds.appOpenManager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.henie.heniefont.MyAdZOne;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyAdZOne.getInstance(this).showBanner(findViewById(com.henie.heniefont.R.id.banner_container)); // done
        MyAdZOne.getInstance(this).onlyCustInterstitialCallAD(this); // done
        MyAdZOne.getInstance(this).ads_NativeCall((ViewGroup) findViewById(com.henie.heniefont.R.id.native_container)); // done


        findViewById(R.id.intercall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyAdZOne.getInstance(MainActivity2.this).showInterstitialAd(MainActivity2.this, new MyAdZOne.MyCallback() {
                    public void callbackCall() {
                        Toast.makeText(MainActivity2.this, "Thank You Next", Toast.LENGTH_SHORT).show();
                    }
                }, MyAdZOne.app_MainClickCntSwAd);

            }
        });

    }


    @Override
    public void onBackPressed() {
        MyAdZOne.getInstance(MainActivity2.this).showInterstitialAd(MainActivity2.this, new MyAdZOne.MyCallback() {
            public void callbackCall() {
                appOpenManager.DestroyAllAds();
                finishAffinity();
                Toast.makeText(MainActivity2.this, "Thank You Back", Toast.LENGTH_SHORT).show();
            }
        }, MyAdZOne.app_InnerClickCntSwAd);
    }

}