package com.example.kavitayadav.quickdeal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by kavita yadav on 19-04-17.
 */

public class SplashScreen extends Activity {

    ImageView iapplogo, iappname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        iappname = (ImageView)findViewById(R.id.imageView4);
        iapplogo = (ImageView)findViewById(R.id.imageView2);
        iapplogo.setImageResource(R.drawable.applogo);
        iappname.setImageResource(R.drawable.appsname);

        //animation
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation anim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_up);

        //amking a set two put animation on iappname(fade_in+slide_in_up)
        AnimationSet a = new AnimationSet(false);
        a.addAnimation(anim);
        a.addAnimation(anim2);

        //set animation on the applogo image
        iapplogo.setAnimation(anim);
        iappname.setAnimation(a);


        //defines what to be done when animation is complete
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //start main activity when the animation is finished
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
