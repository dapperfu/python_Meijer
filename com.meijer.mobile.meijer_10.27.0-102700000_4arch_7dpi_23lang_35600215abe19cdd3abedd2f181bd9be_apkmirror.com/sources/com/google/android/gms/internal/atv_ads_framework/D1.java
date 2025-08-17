package com.google.android.gms.internal.atv_ads_framework;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class D1 extends N1 {
    D1(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.N1
    public final void a() {
        if (!k()) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry entryH = h(i10);
                if (((E0) entryH.getKey()).zzc()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((E0) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
