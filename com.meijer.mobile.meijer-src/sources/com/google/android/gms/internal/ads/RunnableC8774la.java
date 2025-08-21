package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8774la implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f76696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8988na f76697b;

    RunnableC8774la(C8988na c8988na, int i10, boolean z10) {
        this.f76696a = i10;
        this.f76697b = c8988na;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        H8 h8A;
        int i10 = this.f76696a;
        C8988na c8988na = this.f76697b;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = c8988na.f77916a.getPackageManager().getPackageInfo(c8988na.f77916a.getPackageName(), 0);
            Context context = c8988na.f77916a;
            h8A = C8672kc0.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            h8A = null;
        }
        this.f76697b.f77925j = h8A;
        if (this.f76696a < 4) {
            if (h8A != null && h8A.L0() && !h8A.a1().equals("0000000000000000000000000000000000000000000000000000000000000000") && h8A.M0() && h8A.Y0().g0() && h8A.Y0().b0() != -2) {
                return;
            }
            this.f76697b.o(this.f76696a + 1, true);
        }
    }
}
