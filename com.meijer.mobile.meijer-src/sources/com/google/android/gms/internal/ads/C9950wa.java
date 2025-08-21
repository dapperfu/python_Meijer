package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9950wa {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f80333e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f80334a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f80335b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f80336c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f80337d = false;

    public final long b() {
        long j10 = this.f80336c;
        this.f80336c = -1L;
        return j10;
    }

    public final long c() {
        if (this.f80337d) {
            return this.f80335b - this.f80334a;
        }
        return -1L;
    }

    public static C9950wa d(Context context, Executor executor) {
        return new C9950wa(context, executor, f80333e);
    }

    public final void h() {
        if (this.f80337d) {
            this.f80335b = System.currentTimeMillis();
        }
    }

    C9950wa(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C9843va(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }
}
