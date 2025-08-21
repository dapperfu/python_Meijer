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
public final class C9095oa {

    /* renamed from: a, reason: collision with root package name */
    private long f78231a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f78232b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f78233c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f78234d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f78235e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f78236f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f78237g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f78238h = -1;

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
        return this.f78237g;
    }

    public final long b() {
        return this.f78235e;
    }

    public final long c() {
        return this.f78231a;
    }

    public final long d() {
        return this.f78233c;
    }

    public final long e() {
        return this.f78238h;
    }

    public final long f() {
        return this.f78236f;
    }

    public final long g() {
        return this.f78232b;
    }

    public final long h() {
        return this.f78234d;
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
        this.f78238h = this.f78237g;
        this.f78237g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f78232b = this.f78231a;
        this.f78231a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.f78234d = this.f78233c;
        this.f78233c = SystemClock.uptimeMillis();
        long j10 = this.f78235e;
        if (j10 != -1) {
            this.f78236f = j10;
        }
        DisplayMetrics displayMetricsL = l(context);
        int i10 = displayMetricsL.widthPixels * displayMetricsL.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsL.widthPixels) * Math.min(view.getHeight(), displayMetricsL.heightPixels);
            if (iMin + iMin >= i10 || (iMin == 0 && m(view))) {
                this.f78235e = this.f78233c;
                return;
            }
        }
        this.f78235e = -1L;
    }
}
