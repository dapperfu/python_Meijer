package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.y40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9994y40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8184h70 f79963a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f79964b;

    /* renamed from: c, reason: collision with root package name */
    private final Ij0 f79965c = new C9780w40(this);

    public C9994y40(InterfaceC8184h70 interfaceC8184h70, Executor executor) {
        this.f79963a = interfaceC8184h70;
        this.f79964b = executor;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(EB eb2, G40 g40) throws Exception {
        InterfaceC8184h70 interfaceC8184h70 = this.f79963a;
        InterfaceC9358s70 interfaceC9358s70 = g40.f67078b;
        C9853wo c9853wo = g40.f67077a;
        C9251r70 c9251r70B = interfaceC8184h70.b(interfaceC9358s70);
        if (c9251r70B != null && c9853wo != null) {
            Mj0.r(eb2.zzb().g(c9853wo), this.f79965c, this.f79964b);
        }
        return Mj0.h(new C9887x40(interfaceC9358s70, c9853wo, c9251r70B));
    }

    public final com.google.common.util.concurrent.q c(O40 o40, M40 m40, final EB eb2) {
        return (Cj0) Mj0.e((Cj0) Mj0.n(Cj0.D(new J40(this.f79963a, eb2, this.f79964b).c()), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.u40
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78732a.b(eb2, (G40) obj);
            }
        }, this.f79964b), Exception.class, new C9673v40(this), this.f79964b);
    }
}
