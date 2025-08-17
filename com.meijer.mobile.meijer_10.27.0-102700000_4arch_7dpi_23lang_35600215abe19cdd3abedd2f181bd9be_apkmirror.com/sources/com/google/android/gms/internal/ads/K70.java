package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class K70 {

    /* renamed from: a, reason: collision with root package name */
    private final D70 f68044a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f68045b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68046c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f68047d = false;

    public final synchronized com.google.common.util.concurrent.q a(D70 d70) {
        if (!this.f68047d && !this.f68046c && this.f68044a.zza() != null && d70.zza() != null && this.f68044a.zza().equals(d70.zza())) {
            this.f68046c = true;
            return this.f68045b;
        }
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(C70 c70, InterfaceC8184h70 interfaceC8184h70, D70 d70, C9251r70 c9251r70) throws Exception {
        synchronized (this) {
            try {
                this.f68047d = true;
                c70.a(c9251r70);
                if (this.f68046c) {
                    return Mj0.h(new B70(c9251r70, d70));
                }
                interfaceC8184h70.d(d70.zza(), c9251r70);
                return Mj0.h(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(C70 c70, Exception exc) throws Exception {
        synchronized (this) {
            this.f68047d = true;
            throw exc;
        }
    }

    public final synchronized void d(Ij0 ij0) {
        Mj0.r(Mj0.n(this.f68045b, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.H70
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.i();
            }
        }, this.f68044a.zzb()), ij0, this.f68044a.zzb());
    }

    public K70(final InterfaceC8184h70 interfaceC8184h70, final C70 c70, final D70 d70) {
        this.f68044a = d70;
        this.f68045b = Mj0.f(Mj0.n(c70.b(d70), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.I70
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f67556a.b(c70, interfaceC8184h70, d70, (C9251r70) obj);
            }
        }, d70.zzb()), Exception.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.J70
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f67779a.c(c70, (Exception) obj);
            }
        }, d70.zzb());
    }
}
