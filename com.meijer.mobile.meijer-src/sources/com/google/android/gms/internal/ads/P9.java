package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class P9 extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f70123b;

    /* renamed from: c, reason: collision with root package name */
    public Long f70124c;

    /* renamed from: d, reason: collision with root package name */
    public Long f70125d;

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f70123b);
        map.put(1, this.f70124c);
        map.put(2, this.f70125d);
        return map;
    }

    public P9(String str) {
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f70123b = (Long) mapA.get(0);
            this.f70124c = (Long) mapA.get(1);
            this.f70125d = (Long) mapA.get(2);
        }
    }
}
