package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9648tj0 extends AbstractC9862vj0 {
    C9648tj0(AbstractC7526Zg0 abstractC7526Zg0, boolean z10) {
        super(abstractC7526Zg0, z10);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9862vj0
    public final /* bridge */ /* synthetic */ Object X(List list) {
        Object obj;
        ArrayList arrayListA = C9858vh0.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9755uj0 c9755uj0 = (C9755uj0) it.next();
            if (c9755uj0 != null) {
                obj = c9755uj0.f79735a;
            } else {
                obj = null;
            }
            arrayListA.add(obj);
        }
        return Collections.unmodifiableList(arrayListA);
    }
}
