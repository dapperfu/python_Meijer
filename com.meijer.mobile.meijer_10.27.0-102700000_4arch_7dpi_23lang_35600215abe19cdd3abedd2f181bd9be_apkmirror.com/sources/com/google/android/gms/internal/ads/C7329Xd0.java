package com.google.android.gms.internal.ads;

import Td.AbstractC5232j;
import Td.C5224b;
import Td.InterfaceC5227e;

/* renamed from: com.google.android.gms.internal.ads.Xd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7329Xd0 {
    public static com.google.common.util.concurrent.q a(AbstractC5232j abstractC5232j, C5224b c5224b) {
        final C7296Wd0 c7296Wd0 = new C7296Wd0(abstractC5232j, null);
        abstractC5232j.d(C7923ek0.c(), new InterfaceC5227e() { // from class: com.google.android.gms.internal.ads.Vd0
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j2) {
                C7296Wd0 c7296Wd02 = c7296Wd0;
                if (abstractC5232j2.p()) {
                    c7296Wd02.cancel(false);
                    return;
                }
                if (abstractC5232j2.r()) {
                    c7296Wd02.g(abstractC5232j2.n());
                    return;
                }
                Exception excM = abstractC5232j2.m();
                if (excM == null) {
                    throw new IllegalStateException();
                }
                c7296Wd02.h(excM);
            }
        });
        return c7296Wd0;
    }
}
