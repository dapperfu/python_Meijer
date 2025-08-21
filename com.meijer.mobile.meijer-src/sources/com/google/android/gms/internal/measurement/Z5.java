package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class Z5 extends C10513d6 {
    Z5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.C10513d6
    public final void a() {
        if (!b()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryD = d(i10);
                if (((T4) ((C10486a6) entryD).a()).zzd()) {
                    entryD.setValue(Collections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : f()) {
                if (((T4) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
