package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9478s5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f78971a;

    /* renamed from: c, reason: collision with root package name */
    private final String f78973c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78974d;

    /* renamed from: e, reason: collision with root package name */
    private String f78975e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f78976f;

    /* renamed from: h, reason: collision with root package name */
    private int f78978h;

    /* renamed from: i, reason: collision with root package name */
    private int f78979i;

    /* renamed from: j, reason: collision with root package name */
    private long f78980j;

    /* renamed from: k, reason: collision with root package name */
    private C f78981k;

    /* renamed from: l, reason: collision with root package name */
    private int f78982l;

    /* renamed from: m, reason: collision with root package name */
    private int f78983m;

    /* renamed from: g, reason: collision with root package name */
    private int f78977g = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f78986p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f78972b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    private int f78984n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f78985o = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f78986p = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f78977g = 0;
        this.f78978h = 0;
        this.f78979i = 0;
        this.f78986p = -9223372036854775807L;
        this.f78972b.set(0);
    }

    private final void d(C8934n0 c8934n0) {
        int i10;
        int i11 = c8934n0.f77800b;
        if (i11 == -2147483647 || (i10 = c8934n0.f77801c) == -1) {
            return;
        }
        C c10 = this.f78981k;
        if (c10 != null && i10 == c10.f66481D && i11 == c10.f66482E && Objects.equals(c8934n0.f77799a, c10.f66504o)) {
            return;
        }
        C c11 = this.f78981k;
        C9717uH0 c9717uH0 = c11 == null ? new C9717uH0() : c11.b();
        c9717uH0.m(this.f78975e);
        c9717uH0.B(c8934n0.f77799a);
        c9717uH0.r0(c8934n0.f77801c);
        c9717uH0.C(c8934n0.f77800b);
        c9717uH0.q(this.f78973c);
        c9717uH0.y(this.f78974d);
        C cH = c9717uH0.H();
        this.f78981k = cH;
        this.f78976f.d(cH);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r20) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9478s5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    public C9478s5(String str, int i10, int i11) {
        this.f78971a = new GQ(new byte[i11]);
        this.f78973c = str;
        this.f78974d = i10;
    }

    private final boolean e(GQ gq2, byte[] bArr, int i10) {
        int iMin = Math.min(gq2.r(), i10 - this.f78978h);
        gq2.h(bArr, this.f78978h, iMin);
        int i11 = this.f78978h + iMin;
        this.f78978h = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f78975e = c8518j6.b();
        this.f78976f = interfaceC9575t0.a(c8518j6.a(), 1);
    }
}
