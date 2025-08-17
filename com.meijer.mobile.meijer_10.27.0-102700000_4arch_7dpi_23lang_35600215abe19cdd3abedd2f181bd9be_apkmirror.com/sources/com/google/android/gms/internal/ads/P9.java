package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class P9 extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f69283b;

    /* renamed from: c, reason: collision with root package name */
    public Long f69284c;

    /* renamed from: d, reason: collision with root package name */
    public Long f69285d;

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f69283b);
        map.put(1, this.f69284c);
        map.put(2, this.f69285d);
        return map;
    }

    public P9(String str) {
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f69283b = (Long) mapA.get(0);
            this.f69284c = (Long) mapA.get(1);
            this.f69285d = (Long) mapA.get(2);
        }
    }
}
