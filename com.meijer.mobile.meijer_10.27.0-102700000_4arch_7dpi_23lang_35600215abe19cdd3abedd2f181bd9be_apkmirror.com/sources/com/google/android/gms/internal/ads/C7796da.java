package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7796da extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f73429b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f73430c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f73431d;

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f73429b);
        map.put(1, this.f73430c);
        map.put(2, this.f73431d);
        return map;
    }

    public C7796da(String str) {
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f73429b = (Long) mapA.get(0);
            this.f73430c = (Boolean) mapA.get(1);
            this.f73431d = (Boolean) mapA.get(2);
        }
    }
}
