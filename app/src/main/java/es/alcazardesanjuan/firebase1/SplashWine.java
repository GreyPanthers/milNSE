package es.alcazardesanjuan.firebase1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashWine extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_wine);
        //ahi
        ImageView img = (ImageView) findViewById(R.id.cargandoView);
        img.setBackgroundResource(R.drawable.cargando);


        //ahi2
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.start();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashWine.this, MainActivity.class);
                startActivity(intent);
            }


        },2500);


    }


}
