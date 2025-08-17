package com.google.ads.interactivemedia.v3.internal;

import Td.AbstractC5232j;
import Td.C5224b;
import Td.InterfaceC5227e;

/* loaded from: classes4.dex */
public final class zzpr {
    public static zzuu zza(AbstractC5232j abstractC5232j, C5224b c5224b) {
        final zzpq zzpqVar = new zzpq(abstractC5232j, null);
        abstractC5232j.d(zzvb.zzb(), new InterfaceC5227e() { // from class: com.google.ads.interactivemedia.v3.internal.zzpp
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j2) {
                zzpq zzpqVar2 = zzpqVar;
                if (abstractC5232j2.p()) {
                    zzpqVar2.cancel(false);
                    return;
                }
                if (abstractC5232j2.r()) {
                    zzpqVar2.zzc(abstractC5232j2.n());
                    return;
                }
                Exception excM = abstractC5232j2.m();
                if (excM == null) {
                    throw new IllegalStateException();
                }
                zzpqVar2.zzd(excM);
            }
        });
        return zzpqVar;
    }
}
