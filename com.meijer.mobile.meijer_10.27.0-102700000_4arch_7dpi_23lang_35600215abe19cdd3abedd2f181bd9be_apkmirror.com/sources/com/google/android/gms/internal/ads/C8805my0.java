package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.my0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8805my0 extends AbstractC7951ey0 {
    static {
        C8484jy0.a(Collections.EMPTY_MAP);
    }

    public static C8698ly0 b(int i10) {
        return new C8698ly0(i10, null);
    }

    /* synthetic */ C8805my0(Map map, C8591ky0 c8591ky0) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapB = C8058fy0.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            linkedHashMapB.put(entry.getKey(), ((InterfaceC9339ry0) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapB);
    }
}
