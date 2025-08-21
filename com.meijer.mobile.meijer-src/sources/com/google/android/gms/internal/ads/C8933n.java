package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8933n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8826m f77788a;

    /* renamed from: b, reason: collision with root package name */
    private final r f77789b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f77790c;

    /* renamed from: f, reason: collision with root package name */
    private long f77793f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f77796i;

    /* renamed from: d, reason: collision with root package name */
    private int f77791d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f77792e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f77794g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f77795h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f77797j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private HC f77798k = HC.f68248a;

    public final void b() {
        if (this.f77791d == 0) {
            this.f77791d = 1;
        }
    }

    public final void c(boolean z10) {
        this.f77796i = z10;
        this.f77795h = -9223372036854775807L;
    }

    public final void d() {
        q(0);
    }

    public final void e(boolean z10) {
        this.f77791d = z10 ? 1 : 0;
    }

    public final void f() {
        q(2);
    }

    public final void g() {
        this.f77790c = true;
        this.f77793f = OV.K(this.f77798k.zzb());
        this.f77789b.g();
    }

    public final void h() {
        this.f77790c = false;
        this.f77795h = -9223372036854775807L;
        this.f77789b.h();
    }

    public final void k(HC hc2) {
        this.f77798k = hc2;
    }

    public final void n(float f10) {
        C8211gC.d(f10 > 0.0f);
        if (f10 == this.f77797j) {
            return;
        }
        this.f77797j = f10;
        this.f77789b.e(f10);
    }

    private final void q(int i10) {
        this.f77791d = Math.min(this.f77791d, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r22 >= r26) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r19.f77790c != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r20, long r22, long r24, long r26, boolean r28, com.google.android.gms.internal.ads.C8719l r29) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8933n.a(long, long, long, long, boolean, com.google.android.gms.internal.ads.l):int");
    }

    public final void i() {
        this.f77789b.f();
        this.f77794g = -9223372036854775807L;
        this.f77792e = -9223372036854775807L;
        q(1);
        this.f77795h = -9223372036854775807L;
    }

    public final void j(int i10) {
        this.f77789b.j(i10);
    }

    public final void l(float f10) {
        this.f77789b.c(f10);
    }

    public final void m(Surface surface) {
        this.f77789b.i(surface);
        q(1);
    }

    public final boolean p() {
        int i10 = this.f77791d;
        this.f77791d = 3;
        this.f77793f = OV.K(this.f77798k.zzb());
        return i10 != 3;
    }

    public C8933n(Context context, InterfaceC8826m interfaceC8826m, long j10) {
        this.f77788a = interfaceC8826m;
        this.f77789b = new r(context);
    }

    public final boolean o(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.f77791d != 3) {
            if (this.f77795h == -9223372036854775807L) {
                return false;
            }
            if (this.f77798k.zzb() >= this.f77795h) {
                z11 = false;
                this.f77795h = -9223372036854775807L;
            }
        } else {
            this.f77795h = -9223372036854775807L;
        }
        return z11;
    }
}
