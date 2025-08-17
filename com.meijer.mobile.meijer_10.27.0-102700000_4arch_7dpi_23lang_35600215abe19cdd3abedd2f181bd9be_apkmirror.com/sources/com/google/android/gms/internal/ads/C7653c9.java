package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7653c9 extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public String f73128b;

    /* renamed from: c, reason: collision with root package name */
    public long f73129c;

    /* renamed from: d, reason: collision with root package name */
    public String f73130d;

    /* renamed from: e, reason: collision with root package name */
    public String f73131e;

    /* renamed from: f, reason: collision with root package name */
    public String f73132f;

    public C7653c9() {
        this.f73128b = "E";
        this.f73129c = -1L;
        this.f73130d = "E";
        this.f73131e = "E";
        this.f73132f = "E";
    }

    public C7653c9(String str) {
        this.f73128b = "E";
        this.f73129c = -1L;
        this.f73130d = "E";
        this.f73131e = "E";
        this.f73132f = "E";
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f73128b = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f73129c = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f73130d = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f73131e = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f73132f = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f73128b);
        map.put(4, this.f73132f);
        map.put(3, this.f73131e);
        map.put(2, this.f73130d);
        map.put(1, Long.valueOf(this.f73129c));
        return map;
    }
}
