package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9523tj0 extends AbstractC9737vj0 {
    C9523tj0(AbstractC7401Zg0 abstractC7401Zg0, boolean z10) {
        super(abstractC7401Zg0, z10);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9737vj0
    public final /* bridge */ /* synthetic */ Object X(List list) {
        Object obj;
        ArrayList arrayListA = C9733vh0.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9630uj0 c9630uj0 = (C9630uj0) it.next();
            if (c9630uj0 != null) {
                obj = c9630uj0.f78895a;
            } else {
                obj = null;
            }
            arrayListA.add(obj);
        }
        return Collections.unmodifiableList(arrayListA);
    }
}
