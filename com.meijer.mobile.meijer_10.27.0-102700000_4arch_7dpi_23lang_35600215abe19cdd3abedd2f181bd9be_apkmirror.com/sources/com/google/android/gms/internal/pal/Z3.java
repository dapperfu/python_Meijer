package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Z3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f83005b;

    /* renamed from: c, reason: collision with root package name */
    public Long f83006c;

    /* renamed from: d, reason: collision with root package name */
    public Long f83007d;

    /* renamed from: e, reason: collision with root package name */
    public Long f83008e;

    /* renamed from: f, reason: collision with root package name */
    public Long f83009f;

    /* renamed from: g, reason: collision with root package name */
    public Long f83010g;

    /* renamed from: h, reason: collision with root package name */
    public Long f83011h;

    /* renamed from: i, reason: collision with root package name */
    public Long f83012i;

    /* renamed from: j, reason: collision with root package name */
    public Long f83013j;

    /* renamed from: k, reason: collision with root package name */
    public Long f83014k;

    /* renamed from: l, reason: collision with root package name */
    public Long f83015l;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83005b);
        map.put(1, this.f83006c);
        map.put(2, this.f83007d);
        map.put(3, this.f83008e);
        map.put(4, this.f83009f);
        map.put(5, this.f83010g);
        map.put(6, this.f83011h);
        map.put(7, this.f83012i);
        map.put(8, this.f83013j);
        map.put(9, this.f83014k);
        map.put(10, this.f83015l);
        return map;
    }

    public Z3(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83005b = (Long) mapA.get(0);
            this.f83006c = (Long) mapA.get(1);
            this.f83007d = (Long) mapA.get(2);
            this.f83008e = (Long) mapA.get(3);
            this.f83009f = (Long) mapA.get(4);
            this.f83010g = (Long) mapA.get(5);
            this.f83011h = (Long) mapA.get(6);
            this.f83012i = (Long) mapA.get(7);
            this.f83013j = (Long) mapA.get(8);
            this.f83014k = (Long) mapA.get(9);
            this.f83015l = (Long) mapA.get(10);
        }
    }
}
