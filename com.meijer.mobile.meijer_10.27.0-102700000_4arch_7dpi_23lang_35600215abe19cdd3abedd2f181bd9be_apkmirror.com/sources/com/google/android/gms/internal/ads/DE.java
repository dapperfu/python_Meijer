package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class DE implements InterfaceC10118zD {

    /* renamed from: a, reason: collision with root package name */
    private int f66191a = ((Integer) Mc.A.c().a(C8659lf.f76461p1)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private int f66192b = ((Integer) Mc.A.c().a(C8659lf.f76025Jc)).intValue();

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final synchronized void A0(C8608l60 c8608l60) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76475q1)).booleanValue()) {
            try {
                C7648c60 c7648c60 = c8608l60.f75749b.f75337b;
                this.f66191a = c7648c60.f73104c;
                this.f66192b = c7648c60.f73105d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
    }

    public final synchronized int a() {
        return this.f66191a;
    }

    public final synchronized int b() {
        return this.f66192b;
    }
}
