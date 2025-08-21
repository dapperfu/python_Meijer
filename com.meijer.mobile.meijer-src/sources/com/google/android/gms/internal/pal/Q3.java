package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Q3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f83678b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f83679c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f83680d;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83678b);
        map.put(1, this.f83679c);
        map.put(2, this.f83680d);
        return map;
    }

    public Q3(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83678b = (Long) mapA.get(0);
            this.f83679c = (Boolean) mapA.get(1);
            this.f83680d = (Boolean) mapA.get(2);
        }
    }
}
