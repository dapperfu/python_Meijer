package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class B4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f66261a = new GQ();

    /* renamed from: b, reason: collision with root package name */
    private final int[] f66262b = new int[256];

    /* renamed from: c, reason: collision with root package name */
    private boolean f66263c;

    /* renamed from: d, reason: collision with root package name */
    private int f66264d;

    /* renamed from: e, reason: collision with root package name */
    private int f66265e;

    /* renamed from: f, reason: collision with root package name */
    private int f66266f;

    /* renamed from: g, reason: collision with root package name */
    private int f66267g;

    /* renamed from: h, reason: collision with root package name */
    private int f66268h;

    /* renamed from: i, reason: collision with root package name */
    private int f66269i;

    static /* bridge */ /* synthetic */ void b(B4 b42, GQ gq2, int i10) {
        int iE;
        if (i10 < 4) {
            return;
        }
        gq2.m(3);
        int i11 = i10 - 4;
        if ((gq2.C() & 128) != 0) {
            if (i11 < 7 || (iE = gq2.E()) < 4) {
                return;
            }
            b42.f66268h = gq2.G();
            b42.f66269i = gq2.G();
            b42.f66261a.i(iE - 4);
            i11 = i10 - 11;
        }
        GQ gq3 = b42.f66261a;
        int iT = gq3.t();
        int iU = gq3.u();
        if (iT >= iU || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iU - iT);
        gq2.h(gq3.n(), iT, iMin);
        b42.f66261a.l(iT + iMin);
    }

    public final void e() {
        this.f66264d = 0;
        this.f66265e = 0;
        this.f66266f = 0;
        this.f66267g = 0;
        this.f66268h = 0;
        this.f66269i = 0;
        this.f66261a.i(0);
        this.f66263c = false;
    }

    static /* bridge */ /* synthetic */ void c(B4 b42, GQ gq2, int i10) {
        if (i10 < 19) {
            return;
        }
        b42.f66264d = gq2.G();
        b42.f66265e = gq2.G();
        gq2.m(11);
        b42.f66266f = gq2.G();
        b42.f66267g = gq2.G();
    }

    static /* bridge */ /* synthetic */ void d(B4 b42, GQ gq2, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        gq2.m(2);
        int i11 = 0;
        Arrays.fill(b42.f66262b, 0);
        int i12 = i10 / 5;
        int i13 = 0;
        while (i13 < i12) {
            int iC = gq2.C();
            int iC2 = gq2.C();
            int iC3 = gq2.C();
            int iC4 = gq2.C();
            int iC5 = gq2.C();
            double d10 = iC2;
            int[] iArr = b42.f66262b;
            double d11 = iC3 - 128;
            int iMax = Math.max(i11, Math.min((int) ((1.402d * d11) + d10), com.medallia.digital.mobilesdk.l3.f93323c)) << 16;
            double d12 = iC4 - 128;
            iArr[iC] = Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), com.medallia.digital.mobilesdk.l3.f93323c)) | (iC5 << 24) | iMax | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), com.medallia.digital.mobilesdk.l3.f93323c)) << 8);
            i13++;
            i11 = 0;
        }
        b42.f66263c = true;
    }

    public final C7510Yx a() {
        int i10;
        if (this.f66264d == 0 || this.f66265e == 0 || this.f66268h == 0 || this.f66269i == 0) {
            return null;
        }
        GQ gq2 = this.f66261a;
        if (gq2.u() == 0 || gq2.t() != gq2.u() || !this.f66263c) {
            return null;
        }
        gq2.l(0);
        int i11 = this.f66268h * this.f66269i;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iC = this.f66261a.C();
            if (iC != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.f66262b[iC];
            } else {
                int iC2 = this.f66261a.C();
                if (iC2 != 0) {
                    int iC3 = iC2 & 63;
                    if ((iC2 & 64) != 0) {
                        iC3 = (iC3 << 8) | this.f66261a.C();
                    }
                    i10 = iC3 + i12;
                    Arrays.fill(iArr, i12, i10, (iC2 & 128) == 0 ? this.f66262b[0] : this.f66262b[this.f66261a.C()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f66268h, this.f66269i, Bitmap.Config.ARGB_8888);
        C7443Ww c7443Ww = new C7443Ww();
        c7443Ww.c(bitmapCreateBitmap);
        c7443Ww.h(this.f66266f / this.f66264d);
        c7443Ww.i(0);
        c7443Ww.e(this.f66267g / this.f66265e, 0);
        c7443Ww.f(0);
        c7443Ww.k(this.f66268h / this.f66264d);
        c7443Ww.d(this.f66269i / this.f66265e);
        return c7443Ww.p();
    }
}
