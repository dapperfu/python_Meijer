package com.google.android.gms.internal.ads;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9053o6 implements InterfaceC9160p6 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f78153m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f78154n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 337, 371, HttpResponseStatus.ERROR_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9575t0 f78155a;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f78156b;

    /* renamed from: c, reason: collision with root package name */
    private final C9480s6 f78157c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78158d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f78159e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f78160f;

    /* renamed from: g, reason: collision with root package name */
    private final int f78161g;

    /* renamed from: h, reason: collision with root package name */
    private final C f78162h;

    /* renamed from: i, reason: collision with root package name */
    private int f78163i;

    /* renamed from: j, reason: collision with root package name */
    private long f78164j;

    /* renamed from: k, reason: collision with root package name */
    private int f78165k;

    /* renamed from: l, reason: collision with root package name */
    private long f78166l;

    private final int d(int i10) {
        return (i10 + i10) * this.f78157c.f78989b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9160p6
    public final void a(long j10) {
        this.f78163i = 0;
        this.f78164j = j10;
        this.f78165k = 0;
        this.f78166l = 0L;
    }

    private final int c(int i10) {
        int i11 = this.f78157c.f78989b;
        return i10 / (i11 + i11);
    }

    private final void e(int i10) {
        long jM = this.f78164j + OV.M(this.f78166l, 1000000L, this.f78157c.f78990c, RoundingMode.DOWN);
        int iD = d(i10);
        this.f78156b.a(jM, 1, iD, this.f78165k - iD, null);
        this.f78166l += i10;
        this.f78165k -= iD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC9160p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.InterfaceC9361r0 r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9053o6.b(com.google.android.gms.internal.ads.r0, long):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9160p6
    public final void zza(int i10, long j10) {
        this.f78155a.m(new C9801v6(this.f78157c, this.f78158d, i10, j10));
        this.f78156b.d(this.f78162h);
    }

    public C9053o6(InterfaceC9575t0 interfaceC9575t0, X0 x02, C9480s6 c9480s6) throws zzbc {
        this.f78155a = interfaceC9575t0;
        this.f78156b = x02;
        this.f78157c = c9480s6;
        int iMax = Math.max(1, c9480s6.f78990c / 10);
        this.f78161g = iMax;
        GQ gq2 = new GQ(c9480s6.f78993f);
        gq2.A();
        int iA = gq2.A();
        this.f78158d = iA;
        int i10 = c9480s6.f78989b;
        int i11 = c9480s6.f78991d;
        int i12 = (((i11 - (i10 * 4)) * 8) / (c9480s6.f78992e * i10)) + 1;
        if (iA == i12) {
            int i13 = OV.f69931a;
            int i14 = ((iMax + iA) - 1) / iA;
            this.f78159e = new byte[i11 * i14];
            this.f78160f = new GQ(i14 * (iA + iA) * i10);
            int i15 = ((c9480s6.f78990c * c9480s6.f78991d) * 8) / iA;
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.B("audio/raw");
            c9717uH0.q0(i15);
            c9717uH0.v(i15);
            c9717uH0.r((iMax + iMax) * i10);
            c9717uH0.r0(c9480s6.f78989b);
            c9717uH0.C(c9480s6.f78990c);
            c9717uH0.u(2);
            this.f78162h = c9717uH0.H();
            return;
        }
        throw zzbc.a("Expected frames per block: " + i12 + "; got: " + iA, null);
    }
}
