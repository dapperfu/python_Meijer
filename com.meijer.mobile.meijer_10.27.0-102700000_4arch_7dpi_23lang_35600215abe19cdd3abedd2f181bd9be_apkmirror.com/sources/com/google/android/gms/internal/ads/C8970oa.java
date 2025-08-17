package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.oa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8970oa {

    /* renamed from: a, reason: collision with root package name */
    private long f77391a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f77392b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f77393c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f77394d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f77395e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f77396f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f77397g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f77398h = -1;

    private static boolean m(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.f77397g;
    }

    public final long b() {
        return this.f77395e;
    }

    public final long c() {
        return this.f77391a;
    }

    public final long d() {
        return this.f77393c;
    }

    public final long e() {
        return this.f77398h;
    }

    public final long f() {
        return this.f77396f;
    }

    public final long g() {
        return this.f77392b;
    }

    public final long h() {
        return this.f77394d;
    }

    private static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    public final void i() {
        this.f77398h = this.f77397g;
        this.f77397g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f77392b = this.f77391a;
        this.f77391a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.f77394d = this.f77393c;
        this.f77393c = SystemClock.uptimeMillis();
        long j10 = this.f77395e;
        if (j10 != -1) {
            this.f77396f = j10;
        }
        DisplayMetrics displayMetricsL = l(context);
        int i10 = displayMetricsL.widthPixels * displayMetricsL.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsL.widthPixels) * Math.min(view.getHeight(), displayMetricsL.heightPixels);
            if (iMin + iMin >= i10 || (iMin == 0 && m(view))) {
                this.f77395e = this.f77393c;
                return;
            }
        }
        this.f77395e = -1L;
    }
}
