package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10929v1 extends G1 {
    C10929v1(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.pal.G1
    public final void a() {
        if (!k()) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry entryH = h(i10);
                if (((InterfaceC10896t0) entryH.getKey()).zzc()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((InterfaceC10896t0) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
