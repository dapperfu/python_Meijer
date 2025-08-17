package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class O2 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public String f82800b;

    /* renamed from: c, reason: collision with root package name */
    public long f82801c;

    /* renamed from: d, reason: collision with root package name */
    public String f82802d;

    /* renamed from: e, reason: collision with root package name */
    public String f82803e;

    /* renamed from: f, reason: collision with root package name */
    public String f82804f;

    public O2() {
        this.f82800b = "E";
        this.f82801c = -1L;
        this.f82802d = "E";
        this.f82803e = "E";
        this.f82804f = "E";
    }

    public O2(String str) {
        this.f82800b = "E";
        this.f82801c = -1L;
        this.f82802d = "E";
        this.f82803e = "E";
        this.f82804f = "E";
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f82800b = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f82801c = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f82802d = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f82803e = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f82804f = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f82800b);
        map.put(4, this.f82804f);
        map.put(3, this.f82803e);
        map.put(2, this.f82802d);
        map.put(1, Long.valueOf(this.f82801c));
        return map;
    }
}
