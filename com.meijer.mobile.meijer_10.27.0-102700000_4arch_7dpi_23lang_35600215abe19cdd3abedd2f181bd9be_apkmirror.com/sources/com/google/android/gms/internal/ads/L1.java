package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class L1 implements InterfaceC9450t0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f68244a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9450t0 f68245b;

    public L1(long j10, InterfaceC9450t0 interfaceC9450t0) {
        this.f68244a = j10;
        this.f68245b = interfaceC9450t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final X0 a(int i10, int i11) {
        return this.f68245b.a(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final void e() {
        this.f68245b.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final void m(Q0 q02) {
        this.f68245b.m(new K1(this, q02, q02));
    }
}
