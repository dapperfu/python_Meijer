package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7778c9 extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public String f73968b;

    /* renamed from: c, reason: collision with root package name */
    public long f73969c;

    /* renamed from: d, reason: collision with root package name */
    public String f73970d;

    /* renamed from: e, reason: collision with root package name */
    public String f73971e;

    /* renamed from: f, reason: collision with root package name */
    public String f73972f;

    public C7778c9() {
        this.f73968b = "E";
        this.f73969c = -1L;
        this.f73970d = "E";
        this.f73971e = "E";
        this.f73972f = "E";
    }

    public C7778c9(String str) {
        this.f73968b = "E";
        this.f73969c = -1L;
        this.f73970d = "E";
        this.f73971e = "E";
        this.f73972f = "E";
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f73968b = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f73969c = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f73970d = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f73971e = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f73972f = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f73968b);
        map.put(4, this.f73972f);
        map.put(3, this.f73971e);
        map.put(2, this.f73970d);
        map.put(1, Long.valueOf(this.f73969c));
        return map;
    }
}
