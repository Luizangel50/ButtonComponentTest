package com.luizangel.buttoncomponenttest.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.luizangel.buttoncomponenttest.R;
import com.luizangel.buttoncomponenttest.databinding.CvLoginButtonViewBinding;

/**
 * Created by Luiz Angel on 2/9/2017.
 */

public class LoginButtonView extends FrameLayout {
    public static final int STATE_BUTTON = 0;
    public static final int STATE_LOADING = 1;
    public static final int STATE_TIMER = 2;

    CvLoginButtonViewBinding binding;
    public LoginButtonView(Context context) {
        super(context);
        init();
    }

    public LoginButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LoginButtonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LoginButtonView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        binding = CvLoginButtonViewBinding.inflate(inflater, this, true);
    }

    public void setOnClickListener(OnClickListener listener) {
        binding.button.setOnClickListener(listener);
    }

    public void setState(int state, final Context context) {
        switch (state) {
            case STATE_BUTTON:
                binding.messageContainer.setVisibility(GONE);
                binding.button.setVisibility(VISIBLE);
                break;
            case STATE_LOADING:
                showMessageContainer(context);
        }
    }

    private void showMessageContainer(final Context context) {
        binding.messageContainer.setVisibility(VISIBLE);
        binding.button.setVisibility(INVISIBLE);

        Animation titleAnimation = AnimationUtils.loadAnimation(context, R.anim.bottom_to_center);
        titleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        binding.messageTextView.startAnimation(titleAnimation);
    }
}
