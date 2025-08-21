package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes6.dex */
final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f83760a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X3 f83761b;

    V3(X3 x32, int i10, boolean z10) {
        this.f83761b = x32;
        this.f83760a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        B1 b1A;
        X3 x32 = this.f83761b;
        if (this.f83760a > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = x32.f83783a.getPackageManager().getPackageInfo(x32.f83783a.getPackageName(), 0);
            Context context = x32.f83783a;
            b1A = L5.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            b1A = null;
        }
        this.f83761b.f83792j = b1A;
        if (this.f83760a < 4) {
            if (b1A != null && b1A.g0() && !b1A.r0().equals("0000000000000000000000000000000000000000000000000000000000000000") && b1A.h0() && b1A.q0().w() && b1A.q0().t() != -2) {
                return;
            }
            this.f83761b.o(this.f83760a + 1, true);
        }
    }
}
