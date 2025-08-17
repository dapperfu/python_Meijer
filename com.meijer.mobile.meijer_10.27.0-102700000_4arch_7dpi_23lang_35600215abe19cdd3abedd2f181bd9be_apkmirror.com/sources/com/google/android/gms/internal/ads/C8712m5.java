package com.google.android.gms.internal.ads;

import fsimpl.C14045dq;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8712m5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final C7999fQ f76712a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f76713b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76714c;

    /* renamed from: d, reason: collision with root package name */
    private final int f76715d;

    /* renamed from: e, reason: collision with root package name */
    private String f76716e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f76717f;

    /* renamed from: g, reason: collision with root package name */
    private int f76718g;

    /* renamed from: h, reason: collision with root package name */
    private int f76719h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f76720i;

    /* renamed from: j, reason: collision with root package name */
    private long f76721j;

    /* renamed from: k, reason: collision with root package name */
    private C f76722k;

    /* renamed from: l, reason: collision with root package name */
    private int f76723l;

    /* renamed from: m, reason: collision with root package name */
    private long f76724m;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f76724m = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f76718g = 0;
        this.f76719h = 0;
        this.f76720i = false;
        this.f76724m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) {
        C8086gC.b(this.f76717f);
        while (gq2.r() > 0) {
            int i10 = this.f76718g;
            if (i10 == 0) {
                while (true) {
                    if (gq2.r() <= 0) {
                        break;
                    }
                    if (this.f76720i) {
                        int iC = gq2.C();
                        if (iC == 119) {
                            this.f76720i = false;
                            this.f76718g = 1;
                            GQ gq3 = this.f76713b;
                            gq3.n()[0] = C14045dq.DST_ATOP;
                            gq3.n()[1] = 119;
                            this.f76719h = 2;
                            break;
                        }
                        this.f76720i = iC == 11;
                    } else {
                        this.f76720i = gq2.C() == 11;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(gq2.r(), this.f76723l - this.f76719h);
                this.f76717f.c(gq2, iMin);
                int i11 = this.f76719h + iMin;
                this.f76719h = i11;
                if (i11 == this.f76723l) {
                    C8086gC.f(this.f76724m != -9223372036854775807L);
                    this.f76717f.a(this.f76724m, 1, this.f76723l, 0, null);
                    this.f76724m += this.f76721j;
                    this.f76718g = 0;
                }
            } else {
                byte[] bArrN = this.f76713b.n();
                int iMin2 = Math.min(gq2.r(), 128 - this.f76719h);
                gq2.h(bArrN, this.f76719h, iMin2);
                int i12 = this.f76719h + iMin2;
                this.f76719h = i12;
                if (i12 == 128) {
                    this.f76712a.l(0);
                    N nE = P.e(this.f76712a);
                    C c10 = this.f76722k;
                    if (c10 == null || nE.f68786c != c10.f65641D || nE.f68785b != c10.f65642E || !Objects.equals(nE.f68784a, c10.f65664o)) {
                        C9592uH0 c9592uH0 = new C9592uH0();
                        c9592uH0.m(this.f76716e);
                        c9592uH0.B(nE.f68784a);
                        c9592uH0.r0(nE.f68786c);
                        c9592uH0.C(nE.f68785b);
                        c9592uH0.q(this.f76714c);
                        c9592uH0.y(this.f76715d);
                        c9592uH0.v(nE.f68789f);
                        if ("audio/ac3".equals(nE.f68784a)) {
                            c9592uH0.q0(nE.f68789f);
                        }
                        C cH = c9592uH0.H();
                        this.f76722k = cH;
                        this.f76717f.d(cH);
                    }
                    this.f76723l = nE.f68787d;
                    this.f76721j = (nE.f68788e * 1000000) / this.f76722k.f65642E;
                    this.f76713b.l(0);
                    this.f76717f.c(this.f76713b, 128);
                    this.f76718g = 2;
                }
            }
        }
    }

    public C8712m5(String str, int i10) {
        C7999fQ c7999fQ = new C7999fQ(new byte[128], 128);
        this.f76712a = c7999fQ;
        this.f76713b = new GQ(c7999fQ.f74100a);
        this.f76718g = 0;
        this.f76724m = -9223372036854775807L;
        this.f76714c = str;
        this.f76715d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f76716e = c8393j6.b();
        this.f76717f = interfaceC9450t0.a(c8393j6.a(), 1);
    }
}
