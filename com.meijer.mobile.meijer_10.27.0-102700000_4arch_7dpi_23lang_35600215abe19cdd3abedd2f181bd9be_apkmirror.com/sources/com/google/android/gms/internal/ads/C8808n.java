package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8808n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8701m f76948a;

    /* renamed from: b, reason: collision with root package name */
    private final r f76949b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f76950c;

    /* renamed from: f, reason: collision with root package name */
    private long f76953f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f76956i;

    /* renamed from: d, reason: collision with root package name */
    private int f76951d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f76952e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f76954g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f76955h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f76957j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private HC f76958k = HC.f67408a;

    public final void b() {
        if (this.f76951d == 0) {
            this.f76951d = 1;
        }
    }

    public final void c(boolean z10) {
        this.f76956i = z10;
        this.f76955h = -9223372036854775807L;
    }

    public final void d() {
        q(0);
    }

    public final void e(boolean z10) {
        this.f76951d = z10 ? 1 : 0;
    }

    public final void f() {
        q(2);
    }

    public final void g() {
        this.f76950c = true;
        this.f76953f = OV.K(this.f76958k.zzb());
        this.f76949b.g();
    }

    public final void h() {
        this.f76950c = false;
        this.f76955h = -9223372036854775807L;
        this.f76949b.h();
    }

    public final void k(HC hc2) {
        this.f76958k = hc2;
    }

    public final void n(float f10) {
        C8086gC.d(f10 > 0.0f);
        if (f10 == this.f76957j) {
            return;
        }
        this.f76957j = f10;
        this.f76949b.e(f10);
    }

    private final void q(int i10) {
        this.f76951d = Math.min(this.f76951d, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r22 >= r26) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r19.f76950c != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r20, long r22, long r24, long r26, boolean r28, com.google.android.gms.internal.ads.C8594l r29) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8808n.a(long, long, long, long, boolean, com.google.android.gms.internal.ads.l):int");
    }

    public final void i() {
        this.f76949b.f();
        this.f76954g = -9223372036854775807L;
        this.f76952e = -9223372036854775807L;
        q(1);
        this.f76955h = -9223372036854775807L;
    }

    public final void j(int i10) {
        this.f76949b.j(i10);
    }

    public final void l(float f10) {
        this.f76949b.c(f10);
    }

    public final void m(Surface surface) {
        this.f76949b.i(surface);
        q(1);
    }

    public final boolean p() {
        int i10 = this.f76951d;
        this.f76951d = 3;
        this.f76953f = OV.K(this.f76958k.zzb());
        return i10 != 3;
    }

    public C8808n(Context context, InterfaceC8701m interfaceC8701m, long j10) {
        this.f76948a = interfaceC8701m;
        this.f76949b = new r(context);
    }

    public final boolean o(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.f76951d != 3) {
            if (this.f76955h == -9223372036854775807L) {
                return false;
            }
            if (this.f76958k.zzb() >= this.f76955h) {
                z11 = false;
                this.f76955h = -9223372036854775807L;
            }
        } else {
            this.f76955h = -9223372036854775807L;
        }
        return z11;
    }
}
