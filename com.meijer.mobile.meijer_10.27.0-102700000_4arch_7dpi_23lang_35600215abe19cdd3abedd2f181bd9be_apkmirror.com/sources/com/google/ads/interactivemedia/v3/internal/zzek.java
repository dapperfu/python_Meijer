package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class zzek implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            zzqf.zzh(motionEvent);
            return false;
        }
        return false;
    }
}
