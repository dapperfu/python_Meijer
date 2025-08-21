package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.oj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9114oj0 extends AbstractC8900mj0 {
    /* synthetic */ C9114oj0(C9221pj0 c9221pj0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8900mj0
    final int a(AbstractC9328qj0 abstractC9328qj0) {
        int i10;
        synchronized (abstractC9328qj0) {
            i10 = abstractC9328qj0.f78675i - 1;
            abstractC9328qj0.f78675i = i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8900mj0
    final void b(AbstractC9328qj0 abstractC9328qj0, Set set, Set set2) {
        synchronized (abstractC9328qj0) {
            try {
                if (abstractC9328qj0.f78674h == null) {
                    abstractC9328qj0.f78674h = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
