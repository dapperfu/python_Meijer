package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class S3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public Long f82865b;

    /* renamed from: c, reason: collision with root package name */
    public Long f82866c;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f82865b);
        map.put(1, this.f82866c);
        return map;
    }

    public S3(String str) {
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f82865b = (Long) mapA.get(0);
            this.f82866c = (Long) mapA.get(1);
        }
    }
}
