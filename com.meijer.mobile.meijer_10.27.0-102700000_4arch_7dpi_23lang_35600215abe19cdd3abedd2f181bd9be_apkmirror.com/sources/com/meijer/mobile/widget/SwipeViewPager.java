package com.meijer.mobile.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.a0;
import js.AbstractC15074a;

@Deprecated
/* loaded from: classes11.dex */
public class SwipeViewPager extends ViewPager {

    /* renamed from: h0, reason: collision with root package name */
    private boolean f119522h0;

    @Override // androidx.viewpager.widget.ViewPager
    public boolean o(KeyEvent keyEvent) {
        if (this.f119522h0) {
            return super.o(keyEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f119522h0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f119522h0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public SwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f100927C, 0, 0);
        try {
            this.f119522h0 = typedArrayObtainStyledAttributes.getBoolean(a0.f100928D, true);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(this.f119522h0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        super.setCurrentItem(i10);
        androidx.viewpager.widget.a adapter = getAdapter();
        if (adapter instanceof AbstractC15074a) {
            ((AbstractC15074a) adapter).x(i10);
        }
        if (adapter != null) {
            setContentDescription(getContext().getString(Y.f99935Z5, Integer.valueOf(i10 + 1), Integer.valueOf(adapter.d())));
        }
    }
}
