package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Z3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f83845b;

    /* renamed from: c, reason: collision with root package name */
    public Long f83846c;

    /* renamed from: d, reason: collision with root package name */
    public Long f83847d;

    /* renamed from: e, reason: collision with root package name */
    public Long f83848e;

    /* renamed from: f, reason: collision with root package name */
    public Long f83849f;

    /* renamed from: g, reason: collision with root package name */
    public Long f83850g;

    /* renamed from: h, reason: collision with root package name */
    public Long f83851h;

    /* renamed from: i, reason: collision with root package name */
    public Long f83852i;

    /* renamed from: j, reason: collision with root package name */
    public Long f83853j;

    /* renamed from: k, reason: collision with root package name */
    public Long f83854k;

    /* renamed from: l, reason: collision with root package name */
    public Long f83855l;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83845b);
        map.put(1, this.f83846c);
        map.put(2, this.f83847d);
        map.put(3, this.f83848e);
        map.put(4, this.f83849f);
        map.put(5, this.f83850g);
        map.put(6, this.f83851h);
        map.put(7, this.f83852i);
        map.put(8, this.f83853j);
        map.put(9, this.f83854k);
        map.put(10, this.f83855l);
        return map;
    }

    public Z3(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83845b = (Long) mapA.get(0);
            this.f83846c = (Long) mapA.get(1);
            this.f83847d = (Long) mapA.get(2);
            this.f83848e = (Long) mapA.get(3);
            this.f83849f = (Long) mapA.get(4);
            this.f83850g = (Long) mapA.get(5);
            this.f83851h = (Long) mapA.get(6);
            this.f83852i = (Long) mapA.get(7);
            this.f83853j = (Long) mapA.get(8);
            this.f83854k = (Long) mapA.get(9);
            this.f83855l = (Long) mapA.get(10);
        }
    }
}
