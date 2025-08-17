package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class B3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f82487b;

    /* renamed from: c, reason: collision with root package name */
    public Long f82488c;

    /* renamed from: d, reason: collision with root package name */
    public Long f82489d;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f82487b);
        map.put(1, this.f82488c);
        map.put(2, this.f82489d);
        return map;
    }

    public B3(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f82487b = (Long) mapA.get(0);
            this.f82488c = (Long) mapA.get(1);
            this.f82489d = (Long) mapA.get(2);
        }
    }
}
