package com.scandit.datacapture.core.internal.module.https.scandit;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13436e implements InterfaceC13435d {
    public C13436e() {
        Intrinsics.j(", ", "separator");
    }

    public final HashMap a(Map headers) {
        Intrinsics.j(headers, "headers");
        HashMap map = new HashMap();
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                map.put(lowerCase, CollectionsKt.B0(list, ", ", null, null, 0, null, null, 62, null));
            }
        }
        return map;
    }
}
