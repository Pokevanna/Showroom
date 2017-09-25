package com.mirrosimage.showroom;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashCardboard extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_cardboard);
        carregar();

        TextView tvCardboard = (TextView) findViewById(R.id.tvCardboard);

        Typeface font = Typeface.createFromAsset(getAssets(), "zekton rg.ttf");
        tvCardboard.setTypeface(font);
    }

    private void carregar() {
        Animation anim = AnimationUtils.loadAnimation(this,
                R.anim.animacao_splash);
        anim.reset();
        //Pegando o nosso objeto criado no layout
        ImageView iv = (ImageView) findViewById(R.id.splash);
        if (iv != null) {
            iv.clearAnimation();
            iv.startAnimation(anim);
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = getPackageManager().getLaunchIntentForPackage("br.com.mirrorsimage");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                SplashCardboard.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }


}
