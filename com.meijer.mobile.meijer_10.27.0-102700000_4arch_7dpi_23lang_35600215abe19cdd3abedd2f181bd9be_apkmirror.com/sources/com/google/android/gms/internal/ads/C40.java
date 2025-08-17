package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class C40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private final N40 f65698a;

    /* renamed from: b, reason: collision with root package name */
    private EB f65699b;

    public C40(N40 n40) {
        this.f65698a = n40;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized EB zzd() {
        return this.f65699b;
    }

    public final synchronized com.google.common.util.concurrent.q c(O40 o40, M40 m40, EB eb2) {
        C9853wo c9853wo;
        this.f65699b = eb2;
        if (eb2 == null || (c9853wo = o40.f69001a) == null) {
            return ((B40) this.f65698a).c(o40, m40, eb2);
        }
        C8082gA c8082gAZzb = eb2.zzb();
        return c8082gAZzb.h(c8082gAZzb.j(Mj0.h(c9853wo)));
    }
}
