package com.google.android.gms.internal.ads;

import fsimpl.C14170dq;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8837m5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final C8124fQ f77552a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f77553b;

    /* renamed from: c, reason: collision with root package name */
    private final String f77554c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77555d;

    /* renamed from: e, reason: collision with root package name */
    private String f77556e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f77557f;

    /* renamed from: g, reason: collision with root package name */
    private int f77558g;

    /* renamed from: h, reason: collision with root package name */
    private int f77559h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f77560i;

    /* renamed from: j, reason: collision with root package name */
    private long f77561j;

    /* renamed from: k, reason: collision with root package name */
    private C f77562k;

    /* renamed from: l, reason: collision with root package name */
    private int f77563l;

    /* renamed from: m, reason: collision with root package name */
    private long f77564m;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f77564m = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f77558g = 0;
        this.f77559h = 0;
        this.f77560i = false;
        this.f77564m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) {
        C8211gC.b(this.f77557f);
        while (gq2.r() > 0) {
            int i10 = this.f77558g;
            if (i10 == 0) {
                while (true) {
                    if (gq2.r() <= 0) {
                        break;
                    }
                    if (this.f77560i) {
                        int iC = gq2.C();
                        if (iC == 119) {
                            this.f77560i = false;
                            this.f77558g = 1;
                            GQ gq3 = this.f77553b;
                            gq3.n()[0] = C14170dq.DST_ATOP;
                            gq3.n()[1] = 119;
                            this.f77559h = 2;
                            break;
                        }
                        this.f77560i = iC == 11;
                    } else {
                        this.f77560i = gq2.C() == 11;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(gq2.r(), this.f77563l - this.f77559h);
                this.f77557f.c(gq2, iMin);
                int i11 = this.f77559h + iMin;
                this.f77559h = i11;
                if (i11 == this.f77563l) {
                    C8211gC.f(this.f77564m != -9223372036854775807L);
                    this.f77557f.a(this.f77564m, 1, this.f77563l, 0, null);
                    this.f77564m += this.f77561j;
                    this.f77558g = 0;
                }
            } else {
                byte[] bArrN = this.f77553b.n();
                int iMin2 = Math.min(gq2.r(), 128 - this.f77559h);
                gq2.h(bArrN, this.f77559h, iMin2);
                int i12 = this.f77559h + iMin2;
                this.f77559h = i12;
                if (i12 == 128) {
                    this.f77552a.l(0);
                    N nE = P.e(this.f77552a);
                    C c10 = this.f77562k;
                    if (c10 == null || nE.f69626c != c10.f66481D || nE.f69625b != c10.f66482E || !Objects.equals(nE.f69624a, c10.f66504o)) {
                        C9717uH0 c9717uH0 = new C9717uH0();
                        c9717uH0.m(this.f77556e);
                        c9717uH0.B(nE.f69624a);
                        c9717uH0.r0(nE.f69626c);
                        c9717uH0.C(nE.f69625b);
                        c9717uH0.q(this.f77554c);
                        c9717uH0.y(this.f77555d);
                        c9717uH0.v(nE.f69629f);
                        if ("audio/ac3".equals(nE.f69624a)) {
                            c9717uH0.q0(nE.f69629f);
                        }
                        C cH = c9717uH0.H();
                        this.f77562k = cH;
                        this.f77557f.d(cH);
                    }
                    this.f77563l = nE.f69627d;
                    this.f77561j = (nE.f69628e * 1000000) / this.f77562k.f66482E;
                    this.f77553b.l(0);
                    this.f77557f.c(this.f77553b, 128);
                    this.f77558g = 2;
                }
            }
        }
    }

    public C8837m5(String str, int i10) {
        C8124fQ c8124fQ = new C8124fQ(new byte[128], 128);
        this.f77552a = c8124fQ;
        this.f77553b = new GQ(c8124fQ.f74940a);
        this.f77558g = 0;
        this.f77564m = -9223372036854775807L;
        this.f77554c = str;
        this.f77555d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f77556e = c8518j6.b();
        this.f77557f = interfaceC9575t0.a(c8518j6.a(), 1);
    }
}
