package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ml, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8903ml {

    /* renamed from: a, reason: collision with root package name */
    private final C7196Pk f77713a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.common.util.concurrent.q f77714b;

    C8903ml(C7196Pk c7196Pk) {
        this.f77713a = c7196Pk;
    }

    private final void d() {
        if (this.f77714b == null) {
            final C7270Rq c7270Rq = new C7270Rq();
            this.f77714b = c7270Rq;
            this.f77713a.b(null).f(new InterfaceC7404Vq() { // from class: com.google.android.gms.internal.ads.jl
                @Override // com.google.android.gms.internal.ads.InterfaceC7404Vq
                public final void zza(Object obj) {
                    c7270Rq.b((InterfaceC7230Qk) obj);
                }
            }, new InterfaceC7338Tq() { // from class: com.google.android.gms.internal.ads.kl
                @Override // com.google.android.gms.internal.ads.InterfaceC7338Tq
                public final void zza() {
                    c7270Rq.c(new zzbnv("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final void c(final String str, final InterfaceC7194Pi interfaceC7194Pi) {
        this.f77714b = Mj0.m(this.f77714b, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.il
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                InterfaceC7230Qk interfaceC7230Qk = (InterfaceC7230Qk) obj;
                interfaceC7230Qk.H0(str, interfaceC7194Pi);
                return interfaceC7230Qk;
            }
        }, C7033Kq.f69020g);
    }

    public final C9224pl a(String str, InterfaceC7398Vk interfaceC7398Vk, InterfaceC7365Uk interfaceC7365Uk) {
        d();
        return new C9224pl(this.f77714b, "google.afma.activeView.handleUpdate", interfaceC7398Vk, interfaceC7365Uk);
    }

    public final void b(final String str, final InterfaceC7194Pi interfaceC7194Pi) {
        d();
        this.f77714b = Mj0.n(this.f77714b, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.ll
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                InterfaceC7230Qk interfaceC7230Qk = (InterfaceC7230Qk) obj;
                interfaceC7230Qk.G0(str, interfaceC7194Pi);
                return Mj0.h(interfaceC7230Qk);
            }
        }, C7033Kq.f69020g);
    }
}
