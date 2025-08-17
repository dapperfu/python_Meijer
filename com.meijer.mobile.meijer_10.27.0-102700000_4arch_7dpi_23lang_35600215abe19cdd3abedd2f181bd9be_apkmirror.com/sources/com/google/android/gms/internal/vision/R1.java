package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class R1 extends S1 {
    R1(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.vision.S1
    public final void f() {
        if (!j()) {
            for (int i10 = 0; i10 < k(); i10++) {
                Map.Entry entryI = i(i10);
                if (((I0) entryI.getKey()).zzd()) {
                    entryI.setValue(Collections.unmodifiableList((List) entryI.getValue()));
                }
            }
            for (Map.Entry entry : r()) {
                if (((I0) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }
}
