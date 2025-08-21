package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9415ra extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f78880b;

    /* renamed from: c, reason: collision with root package name */
    public Long f78881c;

    /* renamed from: d, reason: collision with root package name */
    public Long f78882d;

    /* renamed from: e, reason: collision with root package name */
    public Long f78883e;

    /* renamed from: f, reason: collision with root package name */
    public Long f78884f;

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f78880b);
        map.put(1, this.f78881c);
        map.put(2, this.f78882d);
        map.put(3, this.f78883e);
        map.put(4, this.f78884f);
        return map;
    }

    public C9415ra(String str) {
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f78880b = (Long) mapA.get(0);
            this.f78881c = (Long) mapA.get(1);
            this.f78882d = (Long) mapA.get(2);
            this.f78883e = (Long) mapA.get(3);
            this.f78884f = (Long) mapA.get(4);
        }
    }
}
