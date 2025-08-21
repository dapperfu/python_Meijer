package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.aG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7580aG0 implements YE0, XE0 {

    /* renamed from: a, reason: collision with root package name */
    private final YE0 f73228a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73229b;

    /* renamed from: c, reason: collision with root package name */
    private XE0 f73230c;

    public C7580aG0(YE0 ye0, long j10) {
        this.f73228a = ye0;
        this.f73229b = j10;
    }

    public final YE0 e() {
        return this.f73228a;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long n(PG0[] pg0Arr, boolean[] zArr, SF0[] sf0Arr, boolean[] zArr2, long j10) {
        SF0[] sf0Arr2 = new SF0[sf0Arr.length];
        int i10 = 0;
        while (true) {
            SF0 sf0C = null;
            if (i10 >= sf0Arr.length) {
                break;
            }
            ZF0 zf0 = (ZF0) sf0Arr[i10];
            if (zf0 != null) {
                sf0C = zf0.c();
            }
            sf0Arr2[i10] = sf0C;
            i10++;
        }
        long jN = this.f73228a.n(pg0Arr, zArr, sf0Arr2, zArr2, j10 - this.f73229b);
        for (int i11 = 0; i11 < sf0Arr.length; i11++) {
            SF0 sf0 = sf0Arr2[i11];
            if (sf0 == null) {
                sf0Arr[i11] = null;
            } else {
                SF0 sf02 = sf0Arr[i11];
                if (sf02 == null || ((ZF0) sf02).c() != sf0) {
                    sf0Arr[i11] = new ZF0(sf0, this.f73229b);
                }
            }
        }
        return jN + this.f73229b;
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        XE0 xe0 = this.f73230c;
        xe0.getClass();
        xe0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        this.f73228a.b(j10 - this.f73229b);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        long j10 = c7994eA0.f74617a;
        long j11 = this.f73229b;
        C7781cA0 c7781cA0A = c7994eA0.a();
        c7781cA0A.e(j10 - j11);
        return this.f73228a.c(c7781cA0A.g());
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        XE0 xe0 = this.f73230c;
        xe0.getClass();
        xe0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long f(long j10) {
        long j11 = this.f73229b;
        return this.f73228a.f(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long g(long j10, LA0 la0) {
        long j11 = this.f73229b;
        return this.f73228a.g(j10 - j11, la0) + j11;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        this.f73228a.k(j10 - this.f73229b, false);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f73230c = xe0;
        this.f73228a.o(this, j10 - this.f73229b);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        long jZzb = this.f73228a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f73229b;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        long jZzc = this.f73228a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f73229b;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        long jZzd = this.f73228a.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f73229b;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7900dG0 zzh() {
        return this.f73228a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        this.f73228a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f73228a.zzp();
    }
}
