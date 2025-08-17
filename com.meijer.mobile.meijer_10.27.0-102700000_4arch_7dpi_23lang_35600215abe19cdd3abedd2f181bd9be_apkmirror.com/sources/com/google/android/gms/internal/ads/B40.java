package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class B40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private EB f65430a;

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized EB zzd() {
        return this.f65430a;
    }

    public final synchronized com.google.common.util.concurrent.q c(O40 o40, M40 m40, EB eb2) {
        C8082gA c8082gAZzb;
        try {
            if (eb2 != null) {
                this.f65430a = eb2;
            } else {
                this.f65430a = (EB) m40.a(o40.f69002b).zzh();
            }
            c8082gAZzb = this.f65430a.zzb();
        } catch (Throwable th2) {
            throw th2;
        }
        return c8082gAZzb.h(c8082gAZzb.i());
    }
}
