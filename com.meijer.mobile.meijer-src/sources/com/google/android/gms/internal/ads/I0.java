package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class I0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final XL f68366a;

    /* renamed from: b, reason: collision with root package name */
    private final XL f68367b;

    /* renamed from: c, reason: collision with root package name */
    private long f68368c;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f68368c;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return this.f68367b.a() > 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        XL xl2 = this.f68367b;
        if (xl2.a() == 0) {
            R0 r02 = R0.f70546c;
            return new O0(r02, r02);
        }
        int iT = OV.t(xl2, j10, true, true);
        R0 r03 = new R0(this.f68367b.b(iT), this.f68366a.b(iT));
        if (r03.f70547a != j10) {
            XL xl3 = this.f68367b;
            if (iT != xl3.a() - 1) {
                int i10 = iT + 1;
                return new O0(r03, new R0(xl3.b(i10), this.f68366a.b(i10)));
            }
        }
        return new O0(r03, r03);
    }

    public I0(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        if (length2 > 0 && jArr2[0] > 0) {
            int i10 = length2 + 1;
            XL xl2 = new XL(i10);
            this.f68366a = xl2;
            XL xl3 = new XL(i10);
            this.f68367b = xl3;
            xl2.c(0L);
            xl3.c(0L);
        } else {
            this.f68366a = new XL(length2);
            this.f68367b = new XL(length2);
        }
        this.f68366a.d(jArr);
        this.f68367b.d(jArr2);
        this.f68368c = j10;
    }
}
