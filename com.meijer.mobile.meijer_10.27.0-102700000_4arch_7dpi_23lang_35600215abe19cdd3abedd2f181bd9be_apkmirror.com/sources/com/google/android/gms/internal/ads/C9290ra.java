package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9290ra extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f78040b;

    /* renamed from: c, reason: collision with root package name */
    public Long f78041c;

    /* renamed from: d, reason: collision with root package name */
    public Long f78042d;

    /* renamed from: e, reason: collision with root package name */
    public Long f78043e;

    /* renamed from: f, reason: collision with root package name */
    public Long f78044f;

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f78040b);
        map.put(1, this.f78041c);
        map.put(2, this.f78042d);
        map.put(3, this.f78043e);
        map.put(4, this.f78044f);
        return map;
    }

    public C9290ra(String str) {
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f78040b = (Long) mapA.get(0);
            this.f78041c = (Long) mapA.get(1);
            this.f78042d = (Long) mapA.get(2);
            this.f78043e = (Long) mapA.get(3);
            this.f78044f = (Long) mapA.get(4);
        }
    }
}
