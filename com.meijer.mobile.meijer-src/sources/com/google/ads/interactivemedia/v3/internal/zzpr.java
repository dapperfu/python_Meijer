package com.google.ads.interactivemedia.v3.internal;

import Vd.AbstractC5516j;
import Vd.C5508b;
import Vd.InterfaceC5511e;

/* loaded from: classes4.dex */
public final class zzpr {
    public static zzuu zza(AbstractC5516j abstractC5516j, C5508b c5508b) {
        final zzpq zzpqVar = new zzpq(abstractC5516j, null);
        abstractC5516j.d(zzvb.zzb(), new InterfaceC5511e() { // from class: com.google.ads.interactivemedia.v3.internal.zzpp
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j2) {
                zzpq zzpqVar2 = zzpqVar;
                if (abstractC5516j2.p()) {
                    zzpqVar2.cancel(false);
                    return;
                }
                if (abstractC5516j2.r()) {
                    zzpqVar2.zzc(abstractC5516j2.n());
                    return;
                }
                Exception excM = abstractC5516j2.m();
                if (excM == null) {
                    throw new IllegalStateException();
                }
                zzpqVar2.zzd(excM);
            }
        });
        return zzpqVar;
    }
}
