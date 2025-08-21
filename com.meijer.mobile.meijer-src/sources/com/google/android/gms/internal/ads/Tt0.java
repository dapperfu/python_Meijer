package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Tt0 extends Wt0 {

    /* renamed from: d, reason: collision with root package name */
    private final int f71308d;

    /* renamed from: e, reason: collision with root package name */
    private final int f71309e;

    @Override // com.google.android.gms.internal.ads.Wt0
    protected final int F() {
        return this.f71308d;
    }

    @Override // com.google.android.gms.internal.ads.Wt0, com.google.android.gms.internal.ads.Zt0
    public final int k() {
        return this.f71309e;
    }

    @Override // com.google.android.gms.internal.ads.Wt0, com.google.android.gms.internal.ads.Zt0
    public final byte e(int i10) {
        Zt0.C(i10, this.f71309e);
        return this.f72036c[this.f71308d + i10];
    }

    @Override // com.google.android.gms.internal.ads.Wt0, com.google.android.gms.internal.ads.Zt0
    final byte f(int i10) {
        return this.f72036c[this.f71308d + i10];
    }

    @Override // com.google.android.gms.internal.ads.Wt0, com.google.android.gms.internal.ads.Zt0
    protected final void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f72036c, this.f71308d + i10, bArr, i11, i12);
    }

    Tt0(byte[] bArr, int i10, int i11) {
        super(bArr);
        Zt0.t(i10, i10 + i11, bArr.length);
        this.f71308d = i10;
        this.f71309e = i11;
    }
}
