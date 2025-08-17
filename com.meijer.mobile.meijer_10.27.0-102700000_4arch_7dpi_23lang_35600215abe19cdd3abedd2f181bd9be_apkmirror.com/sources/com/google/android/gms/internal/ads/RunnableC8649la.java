package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8649la implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f75856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8863na f75857b;

    RunnableC8649la(C8863na c8863na, int i10, boolean z10) {
        this.f75856a = i10;
        this.f75857b = c8863na;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        H8 h8A;
        int i10 = this.f75856a;
        C8863na c8863na = this.f75857b;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = c8863na.f77076a.getPackageManager().getPackageInfo(c8863na.f77076a.getPackageName(), 0);
            Context context = c8863na.f77076a;
            h8A = C8547kc0.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            h8A = null;
        }
        this.f75857b.f77085j = h8A;
        if (this.f75856a < 4) {
            if (h8A != null && h8A.L0() && !h8A.a1().equals("0000000000000000000000000000000000000000000000000000000000000000") && h8A.M0() && h8A.Y0().g0() && h8A.Y0().b0() != -2) {
                return;
            }
            this.f75857b.o(this.f75856a + 1, true);
        }
    }
}
