package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9202pa extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f78444b;

    /* renamed from: c, reason: collision with root package name */
    public Long f78445c;

    /* renamed from: d, reason: collision with root package name */
    public Long f78446d;

    /* renamed from: e, reason: collision with root package name */
    public Long f78447e;

    /* renamed from: f, reason: collision with root package name */
    public Long f78448f;

    /* renamed from: g, reason: collision with root package name */
    public Long f78449g;

    /* renamed from: h, reason: collision with root package name */
    public Long f78450h;

    /* renamed from: i, reason: collision with root package name */
    public Long f78451i;

    /* renamed from: j, reason: collision with root package name */
    public Long f78452j;

    /* renamed from: k, reason: collision with root package name */
    public Long f78453k;

    /* renamed from: l, reason: collision with root package name */
    public Long f78454l;

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f78444b);
        map.put(1, this.f78445c);
        map.put(2, this.f78446d);
        map.put(3, this.f78447e);
        map.put(4, this.f78448f);
        map.put(5, this.f78449g);
        map.put(6, this.f78450h);
        map.put(7, this.f78451i);
        map.put(8, this.f78452j);
        map.put(9, this.f78453k);
        map.put(10, this.f78454l);
        return map;
    }

    public C9202pa(String str) {
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f78444b = (Long) mapA.get(0);
            this.f78445c = (Long) mapA.get(1);
            this.f78446d = (Long) mapA.get(2);
            this.f78447e = (Long) mapA.get(3);
            this.f78448f = (Long) mapA.get(4);
            this.f78449g = (Long) mapA.get(5);
            this.f78450h = (Long) mapA.get(6);
            this.f78451i = (Long) mapA.get(7);
            this.f78452j = (Long) mapA.get(8);
            this.f78453k = (Long) mapA.get(9);
            this.f78454l = (Long) mapA.get(10);
        }
    }
}
