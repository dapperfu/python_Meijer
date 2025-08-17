package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.pal.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10609b4 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f83059b;

    /* renamed from: c, reason: collision with root package name */
    public Long f83060c;

    /* renamed from: d, reason: collision with root package name */
    public Long f83061d;

    /* renamed from: e, reason: collision with root package name */
    public Long f83062e;

    /* renamed from: f, reason: collision with root package name */
    public Long f83063f;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83059b);
        map.put(1, this.f83060c);
        map.put(2, this.f83061d);
        map.put(3, this.f83062e);
        map.put(4, this.f83063f);
        return map;
    }

    public C10609b4(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83059b = (Long) mapA.get(0);
            this.f83060c = (Long) mapA.get(1);
            this.f83061d = (Long) mapA.get(2);
            this.f83062e = (Long) mapA.get(3);
            this.f83063f = (Long) mapA.get(4);
        }
    }
}
