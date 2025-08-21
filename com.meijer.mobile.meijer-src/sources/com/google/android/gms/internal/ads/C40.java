package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class C40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private final N40 f66538a;

    /* renamed from: b, reason: collision with root package name */
    private EB f66539b;

    public C40(N40 n40) {
        this.f66538a = n40;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized EB zzd() {
        return this.f66539b;
    }

    public final synchronized com.google.common.util.concurrent.q c(O40 o40, M40 m40, EB eb2) {
        C9978wo c9978wo;
        this.f66539b = eb2;
        if (eb2 == null || (c9978wo = o40.f69841a) == null) {
            return ((B40) this.f66538a).c(o40, m40, eb2);
        }
        C8207gA c8207gAZzb = eb2.zzb();
        return c8207gAZzb.h(c8207gAZzb.j(Mj0.h(c9978wo)));
    }
}
