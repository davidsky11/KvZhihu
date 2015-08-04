package com.kv.zhihudaily;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Administrator on 2015/8/4.
 */
public class WelcomeActivity extends Activity implements Animation.AnimationListener {

    private ImageView  imageView = null;
    private Animation alphaAnimation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        imageView = (ImageView) findViewById(R.id.welcome_image_view);
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.welcome_alpha);
        alphaAnimation.setFillEnabled(true);        //
        alphaAnimation.setFillAfter(true);          //
        imageView.setAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(this);  //
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        this.finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
