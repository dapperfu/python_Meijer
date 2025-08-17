package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9825wa {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f79493e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f79494a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f79495b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f79496c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79497d = false;

    public final long b() {
        long j10 = this.f79496c;
        this.f79496c = -1L;
        return j10;
    }

    public final long c() {
        if (this.f79497d) {
            return this.f79495b - this.f79494a;
        }
        return -1L;
    }

    public static C9825wa d(Context context, Executor executor) {
        return new C9825wa(context, executor, f79493e);
    }

    public final void h() {
        if (this.f79497d) {
            this.f79495b = System.currentTimeMillis();
        }
    }

    C9825wa(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C9718va(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }
}
