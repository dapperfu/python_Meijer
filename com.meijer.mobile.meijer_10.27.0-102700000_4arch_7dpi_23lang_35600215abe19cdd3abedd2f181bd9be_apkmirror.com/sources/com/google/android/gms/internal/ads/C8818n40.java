package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.n40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8818n40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private EB f76992a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f76993b = C7923ek0.c();

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    public final EB b() {
        return this.f76992a;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* synthetic */ Object zzd() {
        return this.f76992a;
    }

    public final com.google.common.util.concurrent.q c(O40 o40, M40 m40, EB eb2) {
        DB dbA = m40.a(o40.f69002b);
        dbA.f(new R40(true));
        EB eb3 = (EB) dbA.zzh();
        this.f76992a = eb3;
        final C8082gA c8082gAZzb = eb3.zzb();
        final C9251r70 c9251r70 = new C9251r70();
        return (Cj0) Mj0.m((Cj0) Mj0.n(Cj0.D(c8082gAZzb.i()), new InterfaceC9416sj0(this) { // from class: com.google.android.gms.internal.ads.l40
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                C8608l60 c8608l60 = (C8608l60) obj;
                c9251r70.f77944b = c8608l60;
                Iterator it = c8608l60.f75749b.f75336a.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((Z50) it.next()).f72021a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return c8082gAZzb.h(Mj0.h(c8608l60));
                    }
                }
                return Mj0.h(null);
            }
        }, this.f76993b), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.m40
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                C9251r70 c9251r702 = c9251r70;
                c9251r702.f77945c = (C6577Az) obj;
                return c9251r702;
            }
        }, this.f76993b);
    }
}
