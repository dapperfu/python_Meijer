package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9077pa extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f77604b;

    /* renamed from: c, reason: collision with root package name */
    public Long f77605c;

    /* renamed from: d, reason: collision with root package name */
    public Long f77606d;

    /* renamed from: e, reason: collision with root package name */
    public Long f77607e;

    /* renamed from: f, reason: collision with root package name */
    public Long f77608f;

    /* renamed from: g, reason: collision with root package name */
    public Long f77609g;

    /* renamed from: h, reason: collision with root package name */
    public Long f77610h;

    /* renamed from: i, reason: collision with root package name */
    public Long f77611i;

    /* renamed from: j, reason: collision with root package name */
    public Long f77612j;

    /* renamed from: k, reason: collision with root package name */
    public Long f77613k;

    /* renamed from: l, reason: collision with root package name */
    public Long f77614l;

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f77604b);
        map.put(1, this.f77605c);
        map.put(2, this.f77606d);
        map.put(3, this.f77607e);
        map.put(4, this.f77608f);
        map.put(5, this.f77609g);
        map.put(6, this.f77610h);
        map.put(7, this.f77611i);
        map.put(8, this.f77612j);
        map.put(9, this.f77613k);
        map.put(10, this.f77614l);
        return map;
    }

    public C9077pa(String str) {
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f77604b = (Long) mapA.get(0);
            this.f77605c = (Long) mapA.get(1);
            this.f77606d = (Long) mapA.get(2);
            this.f77607e = (Long) mapA.get(3);
            this.f77608f = (Long) mapA.get(4);
            this.f77609g = (Long) mapA.get(5);
            this.f77610h = (Long) mapA.get(6);
            this.f77611i = (Long) mapA.get(7);
            this.f77612j = (Long) mapA.get(8);
            this.f77613k = (Long) mapA.get(9);
            this.f77614l = (Long) mapA.get(10);
        }
    }
}
