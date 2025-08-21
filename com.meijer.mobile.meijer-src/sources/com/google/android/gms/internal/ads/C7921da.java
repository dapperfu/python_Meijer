package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7921da extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f74269b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f74270c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f74271d;

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f74269b);
        map.put(1, this.f74270c);
        map.put(2, this.f74271d);
        return map;
    }

    public C7921da(String str) {
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f74269b = (Long) mapA.get(0);
            this.f74270c = (Boolean) mapA.get(1);
            this.f74271d = (Boolean) mapA.get(2);
        }
    }
}
