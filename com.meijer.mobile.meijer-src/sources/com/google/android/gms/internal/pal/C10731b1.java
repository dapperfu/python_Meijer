package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10731b1 {
    C10731b1() {
    }

    public static final int a(int i10, Object obj, Object obj2) {
        Z0 z02 = (Z0) obj;
        if (z02.isEmpty()) {
            return 0;
        }
        Iterator it = z02.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((Z0) obj).f();
    }

    public static final Object c(Object obj, Object obj2) {
        Z0 z0B = (Z0) obj;
        Z0 z02 = (Z0) obj2;
        if (!z02.isEmpty()) {
            if (!z0B.f()) {
                z0B = z0B.b();
            }
            z0B.d(z02);
        }
        return z0B;
    }
}
