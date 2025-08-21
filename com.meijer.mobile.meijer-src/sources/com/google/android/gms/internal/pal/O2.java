package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class O2 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public String f83640b;

    /* renamed from: c, reason: collision with root package name */
    public long f83641c;

    /* renamed from: d, reason: collision with root package name */
    public String f83642d;

    /* renamed from: e, reason: collision with root package name */
    public String f83643e;

    /* renamed from: f, reason: collision with root package name */
    public String f83644f;

    public O2() {
        this.f83640b = "E";
        this.f83641c = -1L;
        this.f83642d = "E";
        this.f83643e = "E";
        this.f83644f = "E";
    }

    public O2(String str) {
        this.f83640b = "E";
        this.f83641c = -1L;
        this.f83642d = "E";
        this.f83643e = "E";
        this.f83644f = "E";
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83640b = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f83641c = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f83642d = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f83643e = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f83644f = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83640b);
        map.put(4, this.f83644f);
        map.put(3, this.f83643e);
        map.put(2, this.f83642d);
        map.put(1, Long.valueOf(this.f83641c));
        return map;
    }
}
