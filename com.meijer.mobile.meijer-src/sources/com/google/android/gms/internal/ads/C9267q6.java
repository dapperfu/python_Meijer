package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9267q6 implements InterfaceC9160p6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9575t0 f78569a;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f78570b;

    /* renamed from: c, reason: collision with root package name */
    private final C9480s6 f78571c;

    /* renamed from: d, reason: collision with root package name */
    private final C f78572d;

    /* renamed from: e, reason: collision with root package name */
    private final int f78573e;

    /* renamed from: f, reason: collision with root package name */
    private long f78574f;

    /* renamed from: g, reason: collision with root package name */
    private int f78575g;

    /* renamed from: h, reason: collision with root package name */
    private long f78576h;

    @Override // com.google.android.gms.internal.ads.InterfaceC9160p6
    public final void a(long j10) {
        this.f78574f = j10;
        this.f78575g = 0;
        this.f78576h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9160p6
    public final void zza(int i10, long j10) {
        this.f78569a.m(new C9801v6(this.f78571c, 1, i10, j10));
        this.f78570b.d(this.f78572d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9160p6
    public final boolean b(InterfaceC9361r0 interfaceC9361r0, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f78575g) < (i11 = this.f78573e)) {
            int iB = this.f78570b.b(interfaceC9361r0, (int) Math.min(i11 - i10, j11), true);
            if (iB == -1) {
                j11 = 0;
            } else {
                this.f78575g += iB;
                j11 -= iB;
            }
        }
        C9480s6 c9480s6 = this.f78571c;
        int i12 = this.f78575g;
        int i13 = c9480s6.f78991d;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jM = this.f78574f + OV.M(this.f78576h, 1000000L, c9480s6.f78990c, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.f78575g - i15;
            this.f78570b.a(jM, 1, i15, i16, null);
            this.f78576h += i14;
            this.f78575g = i16;
        }
        return j11 <= 0;
    }

    public C9267q6(InterfaceC9575t0 interfaceC9575t0, X0 x02, C9480s6 c9480s6, String str, int i10) throws zzbc {
        this.f78569a = interfaceC9575t0;
        this.f78570b = x02;
        this.f78571c = c9480s6;
        int i11 = c9480s6.f78989b * c9480s6.f78992e;
        int i12 = c9480s6.f78991d;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = c9480s6.f78990c * i13;
            int i15 = i14 * 8;
            int iMax = Math.max(i13, i14 / 10);
            this.f78573e = iMax;
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.B(str);
            c9717uH0.q0(i15);
            c9717uH0.v(i15);
            c9717uH0.r(iMax);
            c9717uH0.r0(c9480s6.f78989b);
            c9717uH0.C(c9480s6.f78990c);
            c9717uH0.u(i10);
            this.f78572d = c9717uH0.H();
            return;
        }
        throw zzbc.a("Expected block size: " + i13 + "; got: " + i12, null);
    }
}
