package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ml, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8778ml {

    /* renamed from: a, reason: collision with root package name */
    private final C7071Pk f76873a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.common.util.concurrent.q f76874b;

    C8778ml(C7071Pk c7071Pk) {
        this.f76873a = c7071Pk;
    }

    private final void d() {
        if (this.f76874b == null) {
            final C7145Rq c7145Rq = new C7145Rq();
            this.f76874b = c7145Rq;
            this.f76873a.b(null).f(new InterfaceC7279Vq() { // from class: com.google.android.gms.internal.ads.jl
                @Override // com.google.android.gms.internal.ads.InterfaceC7279Vq
                public final void zza(Object obj) {
                    c7145Rq.b((InterfaceC7105Qk) obj);
                }
            }, new InterfaceC7213Tq() { // from class: com.google.android.gms.internal.ads.kl
                @Override // com.google.android.gms.internal.ads.InterfaceC7213Tq
                public final void zza() {
                    c7145Rq.c(new zzbnv("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final void c(final String str, final InterfaceC7069Pi interfaceC7069Pi) {
        this.f76874b = Mj0.m(this.f76874b, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.il
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                InterfaceC7105Qk interfaceC7105Qk = (InterfaceC7105Qk) obj;
                interfaceC7105Qk.I0(str, interfaceC7069Pi);
                return interfaceC7105Qk;
            }
        }, C6908Kq.f68180g);
    }

    public final C9099pl a(String str, InterfaceC7273Vk interfaceC7273Vk, InterfaceC7240Uk interfaceC7240Uk) {
        d();
        return new C9099pl(this.f76874b, "google.afma.activeView.handleUpdate", interfaceC7273Vk, interfaceC7240Uk);
    }

    public final void b(final String str, final InterfaceC7069Pi interfaceC7069Pi) {
        d();
        this.f76874b = Mj0.n(this.f76874b, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.ll
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                InterfaceC7105Qk interfaceC7105Qk = (InterfaceC7105Qk) obj;
                interfaceC7105Qk.H0(str, interfaceC7069Pi);
                return Mj0.h(interfaceC7105Qk);
            }
        }, C6908Kq.f68180g);
    }
}
