package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.n40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8943n40 implements N40 {

    /* renamed from: a, reason: collision with root package name */
    private EB f77832a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f77833b = C8048ek0.c();

    @Override // com.google.android.gms.internal.ads.N40
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q a(O40 o40, M40 m40, Object obj) {
        return c(o40, m40, null);
    }

    public final EB b() {
        return this.f77832a;
    }

    @Override // com.google.android.gms.internal.ads.N40
    public final /* synthetic */ Object zzd() {
        return this.f77832a;
    }

    public final com.google.common.util.concurrent.q c(O40 o40, M40 m40, EB eb2) {
        DB dbA = m40.a(o40.f69842b);
        dbA.f(new R40(true));
        EB eb3 = (EB) dbA.zzh();
        this.f77832a = eb3;
        final C8207gA c8207gAZzb = eb3.zzb();
        final C9376r70 c9376r70 = new C9376r70();
        return (Cj0) Mj0.m((Cj0) Mj0.n(Cj0.D(c8207gAZzb.i()), new InterfaceC9541sj0(this) { // from class: com.google.android.gms.internal.ads.l40
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                C8733l60 c8733l60 = (C8733l60) obj;
                c9376r70.f78784b = c8733l60;
                Iterator it = c8733l60.f76589b.f76176a.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((Z50) it.next()).f72861a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return c8207gAZzb.h(Mj0.h(c8733l60));
                    }
                }
                return Mj0.h(null);
            }
        }, this.f77833b), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.m40
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                C9376r70 c9376r702 = c9376r70;
                c9376r702.f78785c = (C6702Az) obj;
                return c9376r702;
            }
        }, this.f77833b);
    }
}
