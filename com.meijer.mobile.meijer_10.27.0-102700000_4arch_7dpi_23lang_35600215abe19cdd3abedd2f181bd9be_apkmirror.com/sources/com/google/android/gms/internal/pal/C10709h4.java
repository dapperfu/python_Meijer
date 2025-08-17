package com.google.android.gms.internal.pal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.pal.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10709h4 {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f83148e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f83149a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f83150b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f83151c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f83152d = false;

    public final long b() {
        long j10 = this.f83151c;
        this.f83151c = -1L;
        return j10;
    }

    public final long c() {
        if (this.f83152d) {
            return this.f83150b - this.f83149a;
        }
        return -1L;
    }

    public static C10709h4 d(Context context, Executor executor) {
        return new C10709h4(context, executor, f83148e);
    }

    public final void h() {
        if (this.f83152d) {
            this.f83150b = System.currentTimeMillis();
        }
    }

    C10709h4(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C10693g4(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }
}
