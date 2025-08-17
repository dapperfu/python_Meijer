package com.google.android.gms.internal.ads;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8928o6 implements InterfaceC9035p6 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f77313m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f77314n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 337, 371, HttpResponseStatus.ERROR_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9450t0 f77315a;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f77316b;

    /* renamed from: c, reason: collision with root package name */
    private final C9355s6 f77317c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77318d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f77319e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f77320f;

    /* renamed from: g, reason: collision with root package name */
    private final int f77321g;

    /* renamed from: h, reason: collision with root package name */
    private final C f77322h;

    /* renamed from: i, reason: collision with root package name */
    private int f77323i;

    /* renamed from: j, reason: collision with root package name */
    private long f77324j;

    /* renamed from: k, reason: collision with root package name */
    private int f77325k;

    /* renamed from: l, reason: collision with root package name */
    private long f77326l;

    private final int d(int i10) {
        return (i10 + i10) * this.f77317c.f78149b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9035p6
    public final void a(long j10) {
        this.f77323i = 0;
        this.f77324j = j10;
        this.f77325k = 0;
        this.f77326l = 0L;
    }

    private final int c(int i10) {
        int i11 = this.f77317c.f78149b;
        return i10 / (i11 + i11);
    }

    private final void e(int i10) {
        long jM = this.f77324j + OV.M(this.f77326l, 1000000L, this.f77317c.f78150c, RoundingMode.DOWN);
        int iD = d(i10);
        this.f77316b.a(jM, 1, iD, this.f77325k - iD, null);
        this.f77326l += i10;
        this.f77325k -= iD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC9035p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.InterfaceC9236r0 r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8928o6.b(com.google.android.gms.internal.ads.r0, long):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9035p6
    public final void zza(int i10, long j10) {
        this.f77315a.m(new C9676v6(this.f77317c, this.f77318d, i10, j10));
        this.f77316b.d(this.f77322h);
    }

    public C8928o6(InterfaceC9450t0 interfaceC9450t0, X0 x02, C9355s6 c9355s6) throws zzbc {
        this.f77315a = interfaceC9450t0;
        this.f77316b = x02;
        this.f77317c = c9355s6;
        int iMax = Math.max(1, c9355s6.f78150c / 10);
        this.f77321g = iMax;
        GQ gq2 = new GQ(c9355s6.f78153f);
        gq2.A();
        int iA = gq2.A();
        this.f77318d = iA;
        int i10 = c9355s6.f78149b;
        int i11 = c9355s6.f78151d;
        int i12 = (((i11 - (i10 * 4)) * 8) / (c9355s6.f78152e * i10)) + 1;
        if (iA == i12) {
            int i13 = OV.f69091a;
            int i14 = ((iMax + iA) - 1) / iA;
            this.f77319e = new byte[i11 * i14];
            this.f77320f = new GQ(i14 * (iA + iA) * i10);
            int i15 = ((c9355s6.f78150c * c9355s6.f78151d) * 8) / iA;
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.B("audio/raw");
            c9592uH0.q0(i15);
            c9592uH0.v(i15);
            c9592uH0.r((iMax + iMax) * i10);
            c9592uH0.r0(c9355s6.f78149b);
            c9592uH0.C(c9355s6.f78150c);
            c9592uH0.u(2);
            this.f77322h = c9592uH0.H();
            return;
        }
        throw zzbc.a("Expected frames per block: " + i12 + "; got: " + iA, null);
    }
}
