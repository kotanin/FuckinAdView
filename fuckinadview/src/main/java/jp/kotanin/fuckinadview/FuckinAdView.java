package jp.kotanin.fuckinadview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;

public class FuckinAdView extends FrameLayout {
    public FuckinAdView(@NonNull Context context) {
        super(context);
    }

    public FuckinAdView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FuckinAdView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FuckinAdView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void fuckinAnimateGo() {
        int duration = 2000;

        TranslateAnimation translation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_SELF, 0,
                TranslateAnimation.RELATIVE_TO_SELF, 0,
                TranslateAnimation.RELATIVE_TO_SELF, -2.5F,
                TranslateAnimation.RELATIVE_TO_SELF, 0);

        AlphaAnimation alpha = new AlphaAnimation(0F, 1F);

        AnimationSet animSet = new AnimationSet(true);
        animSet.addAnimation(translation);
        animSet.setDuration(duration);
        animSet.setFillAfter(true);
        animSet.addAnimation(alpha);
        animSet.setAnimationListener(new Animation.AnimationListener() {
            @Override public void onAnimationEnd(Animation animation) {}
            @Override public void onAnimationRepeat(Animation animation) {}
            @Override
            public void onAnimationStart(Animation animation) {
                setAlpha(1F);
            }
        });

        startAnimation(animSet);
    }
}
