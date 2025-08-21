package com.google.android.gms.internal.ads;

import Vd.AbstractC5516j;
import Vd.C5508b;
import Vd.InterfaceC5511e;

/* renamed from: com.google.android.gms.internal.ads.Xd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7454Xd0 {
    public static com.google.common.util.concurrent.q a(AbstractC5516j abstractC5516j, C5508b c5508b) {
        final C7421Wd0 c7421Wd0 = new C7421Wd0(abstractC5516j, null);
        abstractC5516j.d(C8048ek0.c(), new InterfaceC5511e() { // from class: com.google.android.gms.internal.ads.Vd0
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j2) {
                C7421Wd0 c7421Wd02 = c7421Wd0;
                if (abstractC5516j2.p()) {
                    c7421Wd02.cancel(false);
                    return;
                }
                if (abstractC5516j2.r()) {
                    c7421Wd02.g(abstractC5516j2.n());
                    return;
                }
                Exception excM = abstractC5516j2.m();
                if (excM == null) {
                    throw new IllegalStateException();
                }
                c7421Wd02.h(excM);
            }
        });
        return c7421Wd0;
    }
}
