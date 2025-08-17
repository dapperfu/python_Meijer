package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.oj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8989oj0 extends AbstractC8775mj0 {
    /* synthetic */ C8989oj0(C9096pj0 c9096pj0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8775mj0
    final int a(AbstractC9203qj0 abstractC9203qj0) {
        int i10;
        synchronized (abstractC9203qj0) {
            i10 = abstractC9203qj0.f77835i - 1;
            abstractC9203qj0.f77835i = i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8775mj0
    final void b(AbstractC9203qj0 abstractC9203qj0, Set set, Set set2) {
        synchronized (abstractC9203qj0) {
            try {
                if (abstractC9203qj0.f77834h == null) {
                    abstractC9203qj0.f77834h = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
