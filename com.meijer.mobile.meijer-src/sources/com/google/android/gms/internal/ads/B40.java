package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class B40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private EB f66270a;

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    @Override // com.google.android.gms.internal.ads.N40
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized EB zzd() {
        return this.f66270a;
    }

    public final synchronized com.google.common.util.concurrent.q c(O40 o40, M40 m40, EB eb2) {
        C8207gA c8207gAZzb;
        try {
            if (eb2 != null) {
                this.f66270a = eb2;
            } else {
                this.f66270a = (EB) m40.a(o40.f69842b).zzh();
            }
            c8207gAZzb = this.f66270a.zzb();
        } catch (Throwable th2) {
            throw th2;
        }
        return c8207gAZzb.h(c8207gAZzb.i());
    }
}
