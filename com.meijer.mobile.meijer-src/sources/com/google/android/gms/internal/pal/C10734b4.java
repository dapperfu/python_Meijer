package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.pal.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10734b4 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f83899b;

    /* renamed from: c, reason: collision with root package name */
    public Long f83900c;

    /* renamed from: d, reason: collision with root package name */
    public Long f83901d;

    /* renamed from: e, reason: collision with root package name */
    public Long f83902e;

    /* renamed from: f, reason: collision with root package name */
    public Long f83903f;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f83899b);
        map.put(1, this.f83900c);
        map.put(2, this.f83901d);
        map.put(3, this.f83902e);
        map.put(4, this.f83903f);
        return map;
    }

    public C10734b4(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83899b = (Long) mapA.get(0);
            this.f83900c = (Long) mapA.get(1);
            this.f83901d = (Long) mapA.get(2);
            this.f83902e = (Long) mapA.get(3);
            this.f83903f = (Long) mapA.get(4);
        }
    }
}
