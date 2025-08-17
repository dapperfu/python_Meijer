package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class Kv0 extends Rv0 {
    Kv0() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.Rv0
    public final void a() {
        if (!k()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryH = h(i10);
                if (((InterfaceC9652uu0) ((Lv0) entryH).a()).zze()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((InterfaceC9652uu0) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
