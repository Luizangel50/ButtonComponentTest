package com.luizangel.buttoncomponenttest.views;

import android.content.Context;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import com.luizangel.buttoncomponenttest.R;
import com.luizangel.buttoncomponenttest.databinding.CvLoginButtonViewBinding;

/**
 * Created by Luiz Angel on 2/9/2017.
 */

public class LoginButtonView extends FrameLayout {
    public static final int STATE_BUTTON = 0;
    public static final int STATE_LOADING = 1;
    public static final int STATE_TIMER = 2;
    public static final int STATE_VALID = 3;

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
                showButton(context);
                break;
            case STATE_LOADING:
                showMessageContainer(context);
                break;
            case STATE_TIMER:
                showCounterContainer(context);
                break;
            case STATE_VALID:
                showValidContainer(context);
                break;
        }
    }

    private void showButton (final Context context) {
        binding.messageContainer.setVisibility(GONE);
        binding.counterContainer.setVisibility(GONE);
        binding.validContainer.setVisibility(GONE);
        binding.button.setVisibility(VISIBLE);
    }

    private void showMessageContainer(final Context context) {
        binding.counterContainer.setVisibility(GONE);
        binding.validContainer.setVisibility(GONE);
        binding.button.setVisibility(GONE);
        binding.messageContainer.setVisibility(VISIBLE);

        Animation titleAnimation = AnimationUtils.loadAnimation(context, R.anim.bottom_to_center);
        Animation zoomAnimation = AnimationUtils.loadAnimation(context, R.anim.zoom_in);

        zoomAnimation.setInterpolator(new AccelerateInterpolator());

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
        binding.messageProgressBar.startAnimation(zoomAnimation);

        CountDownTimer mCountDownTimer = new CountDownTimer(2 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                setState(STATE_TIMER, context);
            }
        };

        mCountDownTimer.start();
    }

    private void showCounterContainer(final Context context) {
        binding.validContainer.setVisibility(GONE);
        binding.button.setVisibility(GONE);
        binding.messageContainer.setVisibility(GONE);
        binding.counterContainer.setVisibility(VISIBLE);

        Animation titleAnimation = AnimationUtils.loadAnimation(context, R.anim.bottom_to_center);
        Animation zoomAnimation = AnimationUtils.loadAnimation(context, R.anim.zoom_in);

        zoomAnimation.setInterpolator(new AccelerateInterpolator());

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

        binding.counterTextView.startAnimation(titleAnimation);
        binding.counterSeconds.startAnimation(zoomAnimation);

        CountDownTimer mCountDownTimer = new CountDownTimer(5 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //this will be called every second.
                String seconds = millisUntilFinished/1000 + "s";
                binding.counterSeconds.setText(seconds);
                if (millisUntilFinished == (long) 10000) { cancel();}
            }

            @Override
            public void onFinish() {
                setState(STATE_VALID, context);
            }
        };

        mCountDownTimer.start();
    }

    private void showValidContainer(final Context context) {
        binding.messageContainer.setVisibility(GONE);
        binding.button.setVisibility(GONE);
        binding.counterContainer.setVisibility(GONE);
        binding.validContainer.setVisibility(VISIBLE);

        Animation titleAnimation = AnimationUtils.loadAnimation(context, R.anim.bottom_to_center);
        Animation zoomAnimation = AnimationUtils.loadAnimation(context, R.anim.zoom_in);

        zoomAnimation.setInterpolator(new AccelerateInterpolator());

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

        binding.validTextView.startAnimation(titleAnimation);
        binding.validImageView.startAnimation(zoomAnimation);

        CountDownTimer mCountDownTimer = new CountDownTimer(2 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                setState(STATE_BUTTON, context);
            }
        };

        mCountDownTimer.start();
    }
}
