package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8223ha extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f74745b;

    /* renamed from: c, reason: collision with root package name */
    public Long f74746c;

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f74745b);
        map.put(1, this.f74746c);
        return map;
    }

    public C8223ha(String str) {
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f74745b = (Long) mapA.get(0);
            this.f74746c = (Long) mapA.get(1);
        }
    }
}
