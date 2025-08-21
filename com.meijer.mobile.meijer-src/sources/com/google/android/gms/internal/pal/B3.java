package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class B3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f83327b;

    /* renamed from: c, reason: collision with root package name */
    public Long f83328c;

    /* renamed from: d, reason: collision with root package name */
    public Long f83329d;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83327b);
        map.put(1, this.f83328c);
        map.put(2, this.f83329d);
        return map;
    }

    public B3(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83327b = (Long) mapA.get(0);
            this.f83328c = (Long) mapA.get(1);
            this.f83329d = (Long) mapA.get(2);
        }
    }
}
