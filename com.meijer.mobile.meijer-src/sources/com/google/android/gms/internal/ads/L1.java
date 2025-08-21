package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class L1 implements InterfaceC9575t0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f69084a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9575t0 f69085b;

    public L1(long j10, InterfaceC9575t0 interfaceC9575t0) {
        this.f69084a = j10;
        this.f69085b = interfaceC9575t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final X0 a(int i10, int i11) {
        return this.f69085b.a(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final void e() {
        this.f69085b.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final void m(Q0 q02) {
        this.f69085b.m(new K1(this, q02, q02));
    }
}
