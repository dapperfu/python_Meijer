package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.y40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10119y40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8309h70 f80803a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f80804b;

    /* renamed from: c, reason: collision with root package name */
    private final Ij0 f80805c = new C9905w40(this);

    public C10119y40(InterfaceC8309h70 interfaceC8309h70, Executor executor) {
        this.f80803a = interfaceC8309h70;
        this.f80804b = executor;
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
        InterfaceC8309h70 interfaceC8309h70 = this.f80803a;
        InterfaceC9483s70 interfaceC9483s70 = g40.f67918b;
        C9978wo c9978wo = g40.f67917a;
        C9376r70 c9376r70B = interfaceC8309h70.b(interfaceC9483s70);
        if (c9376r70B != null && c9978wo != null) {
            Mj0.r(eb2.zzb().g(c9978wo), this.f80805c, this.f80804b);
        }
        return Mj0.h(new C10012x40(interfaceC9483s70, c9978wo, c9376r70B));
    }

    public final com.google.common.util.concurrent.q c(O40 o40, M40 m40, final EB eb2) {
        return (Cj0) Mj0.e((Cj0) Mj0.n(Cj0.D(new J40(this.f80803a, eb2, this.f80804b).c()), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.u40
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f79572a.b(eb2, (G40) obj);
            }
        }, this.f80804b), Exception.class, new C9798v40(this), this.f80804b);
    }
}
