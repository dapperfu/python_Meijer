package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10291e1 extends C10288d1 {
    C10291e1(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.clearcut.C10288d1
    public final void x() {
        if (!a()) {
            for (int i10 = 0; i10 < q(); i10++) {
                Map.Entry entryH = h(i10);
                if (((Z) entryH.getKey()).s()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : r()) {
                if (((Z) entry.getKey()).s()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.x();
    }
}
