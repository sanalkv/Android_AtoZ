package com.gmail.android.atoz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.abcd);
        mp.setLooping(true);
        mp.start();

        MobileAds.initialize(this, "\n" + "ca-app-pub-1586940687535045~4649325754");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);




    }


    public void picture(View view)
{


    String value= (String) view.getTag();
    ImageView image= (ImageView) findViewById(R.id.imageView);

    switch(value)
    {
        case "a" : image.setImageResource(R.drawable.a);
        break;
        case "b" :  image.setImageResource(R.drawable.b);
        break;
        case "c" :  image.setImageResource(R.drawable.c);
        break;
        case "d" :  image.setImageResource(R.drawable.d);
        break;
        case "e" :  image.setImageResource(R.drawable.e);
        break;
        case "f" :  image.setImageResource(R.drawable.f);
        break;
        case "g" :  image.setImageResource(R.drawable.g);
        break;
        case "h" :  image.setImageResource(R.drawable.h);
        break;
        case "i" :  image.setImageResource(R.drawable.i);
        break;
        case "j" :  image.setImageResource(R.drawable.j);
        break;
        case "k" :  image.setImageResource(R.drawable.k);
        break;
        case "l" :  image.setImageResource(R.drawable.l);
        break;
        case "m" :  image.setImageResource(R.drawable.m);
        break;
        case "n" :  image.setImageResource(R.drawable.n);
        break;
        case "o" :  image.setImageResource(R.drawable.o);
        break;
        case "p" :  image.setImageResource(R.drawable.p);
        break;
        case "q" :  image.setImageResource(R.drawable.q);
        break;
        case "r" :  image.setImageResource(R.drawable.r);
        break;
        case "s" :  image.setImageResource(R.drawable.s);
        break;
        case "t" :  image.setImageResource(R.drawable.t);
        break;
        case "u" :  image.setImageResource(R.drawable.u);
        break;
        case "v" :  image.setImageResource(R.drawable.v);
        break;
        case "w" :  image.setImageResource(R.drawable.w);
        break;
        case "x" :  image.setImageResource(R.drawable.x);
        break;
        case "y" :  image.setImageResource(R.drawable.y);
        break;
        case "z" :  image.setImageResource(R.drawable.z);
            break;
    }

}

}
