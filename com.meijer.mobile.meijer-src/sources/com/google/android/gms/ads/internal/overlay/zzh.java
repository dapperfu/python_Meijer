package com.google.android.gms.ads.internal.overlay;

import Rc.C5212v;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes4.dex */
final class zzh extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final C5212v f65476a;

    /* renamed from: b, reason: collision with root package name */
    boolean f65477b;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f65477b) {
            return false;
        }
        this.f65476a.m(motionEvent);
        return false;
    }

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        C5212v c5212v = new C5212v(context, str);
        this.f65476a = c5212v;
        c5212v.o(str2);
        c5212v.n(str3);
    }
}
