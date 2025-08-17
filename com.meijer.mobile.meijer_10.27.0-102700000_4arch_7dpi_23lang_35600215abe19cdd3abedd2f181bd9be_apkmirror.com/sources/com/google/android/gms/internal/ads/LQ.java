package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
public final class LQ implements NQ {

    /* renamed from: a, reason: collision with root package name */
    private final Map f68366a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f68367b;

    /* renamed from: c, reason: collision with root package name */
    private final C9904xD f68368c;

    public LQ(Map map, Xj0 xj0, C9904xD c9904xD) {
        this.f68366a = map;
        this.f68367b = xj0;
        this.f68368c = c9904xD;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final com.google.common.util.concurrent.q a(final C9853wo c9853wo) {
        this.f68368c.N(c9853wo);
        com.google.common.util.concurrent.q qVarG = Mj0.g(new zzdvy(3));
        for (String str : ((String) Mc.A.c().a(C8659lf.f76300d8)).split(",")) {
            final InterfaceC10088yy0 interfaceC10088yy0 = (InterfaceC10088yy0) this.f68366a.get(str.trim());
            if (interfaceC10088yy0 != null) {
                qVarG = Mj0.f(qVarG, zzdvy.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.JQ
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return ((NQ) interfaceC10088yy0.zzb()).a(c9853wo);
                    }
                }, this.f68367b);
            }
        }
        Mj0.r(qVarG, new KQ(this), C6908Kq.f68180g);
        return qVarG;
    }
}
