package com.luizangel.buttoncomponenttest.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Luiz Angel on 2/9/2017.
 */

public class LoginButtonView extends LinearLayout {
    public LoginButtonView(Context context) {
        super(context);
    }

    public LoginButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LoginButtonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LoginButtonView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setShowDividers(int showDividers) {
        super.setShowDividers(showDividers);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }

    @Override
    public int getShowDividers() {
        return super.getShowDividers();
    }

    @Override
    public Drawable getDividerDrawable() {
        return super.getDividerDrawable();
    }

    @Override
    public void setDividerDrawable(Drawable divider) {
        super.setDividerDrawable(divider);
    }

    @Override
    public void setDividerPadding(int padding) {
        super.setDividerPadding(padding);
    }

    @Override
    public int getDividerPadding() {
        return super.getDividerPadding();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean isBaselineAligned() {
        return super.isBaselineAligned();
    }

    @Override
    public void setBaselineAligned(boolean baselineAligned) {
        super.setBaselineAligned(baselineAligned);
    }

    @Override
    public boolean isMeasureWithLargestChildEnabled() {
        return super.isMeasureWithLargestChildEnabled();
    }

    @Override
    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        super.setMeasureWithLargestChildEnabled(enabled);
    }

    @Override
    public int getBaseline() {
        return super.getBaseline();
    }

    @Override
    public int getBaselineAlignedChildIndex() {
        return super.getBaselineAlignedChildIndex();
    }

    @Override
    public void setBaselineAlignedChildIndex(int i) {
        super.setBaselineAlignedChildIndex(i);
    }

    @Override
    public float getWeightSum() {
        return super.getWeightSum();
    }

    @Override
    public void setWeightSum(float weightSum) {
        super.setWeightSum(weightSum);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
    }

    @Override
    public void setOrientation(int orientation) {
        super.setOrientation(orientation);
    }

    @Override
    public int getOrientation() {
        return super.getOrientation();
    }

    @Override
    public void setGravity(int gravity) {
        super.setGravity(gravity);
    }

    @Override
    public int getGravity() {
        return super.getGravity();
    }

    @Override
    public void setHorizontalGravity(int horizontalGravity) {
        super.setHorizontalGravity(horizontalGravity);
    }

    @Override
    public void setVerticalGravity(int verticalGravity) {
        super.setVerticalGravity(verticalGravity);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return super.generateLayoutParams(attrs);
    }

    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override
    protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return super.generateLayoutParams(lp);
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p);
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }
}
