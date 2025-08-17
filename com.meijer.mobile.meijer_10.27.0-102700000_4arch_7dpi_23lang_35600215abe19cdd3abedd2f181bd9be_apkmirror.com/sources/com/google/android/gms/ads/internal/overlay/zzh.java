package com.google.android.gms.ads.internal.overlay;

import Pc.C4591v;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes4.dex */
final class zzh extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final C4591v f64636a;

    /* renamed from: b, reason: collision with root package name */
    boolean f64637b;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f64637b) {
            return false;
        }
        this.f64636a.m(motionEvent);
        return false;
    }

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        C4591v c4591v = new C4591v(context, str);
        this.f64636a = c4591v;
        c4591v.o(str2);
        c4591v.n(str3);
    }
}
