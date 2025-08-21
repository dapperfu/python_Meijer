package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
public final class LQ implements NQ {

    /* renamed from: a, reason: collision with root package name */
    private final Map f69206a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f69207b;

    /* renamed from: c, reason: collision with root package name */
    private final C10029xD f69208c;

    public LQ(Map map, Xj0 xj0, C10029xD c10029xD) {
        this.f69206a = map;
        this.f69207b = xj0;
        this.f69208c = c10029xD;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final com.google.common.util.concurrent.q a(final C9978wo c9978wo) {
        this.f69208c.d0(c9978wo);
        com.google.common.util.concurrent.q qVarG = Mj0.g(new zzdvy(3));
        for (String str : ((String) Oc.A.c().a(C8784lf.f77140d8)).split(",")) {
            final InterfaceC10213yy0 interfaceC10213yy0 = (InterfaceC10213yy0) this.f69206a.get(str.trim());
            if (interfaceC10213yy0 != null) {
                qVarG = Mj0.f(qVarG, zzdvy.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.JQ
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return ((NQ) interfaceC10213yy0.zzb()).a(c9978wo);
                    }
                }, this.f69207b);
            }
        }
        Mj0.r(qVarG, new KQ(this), C7033Kq.f69020g);
        return qVarG;
    }
}
