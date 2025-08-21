package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10357k1 {
    C10357k1() {
    }

    public static final int a(int i10, Object obj, Object obj2) {
        C10354j1 c10354j1 = (C10354j1) obj;
        if (c10354j1.isEmpty()) {
            return 0;
        }
        Iterator it = c10354j1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
